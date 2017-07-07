package com.liuzhe.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.liuzhe.ssm.entity.Book;
import com.liuzhe.ssm.service.BookService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Alan on 2017/6/30.
 */
@Controller
public class BookController {

    Logger logger = Logger.getLogger(BookController.class);

    @Resource
    BookService service;

    @RequestMapping(value = "/addBook.ajax" ,method = RequestMethod.POST)
    public void addBook(Book book, ModelMap map,HttpServletResponse response) throws IOException {
        logger.info(book.toString());
        Integer addBookNumber  = service.addBook(book);
        PrintWriter pw = response.getWriter();
        JSONObject json = new JSONObject();

        if (addBookNumber != 0){
            json.put("success","1");
        }else {
            json.put("success","0");
        }
        logger.info(book.getAuthor()+"----"+addBookNumber+"----"+json);
        pw.print(json);
        pw.flush();
        pw.close();
    }

    @RequestMapping(value = "/updataBook.ajax" ,method = RequestMethod.POST)
        public void updataBook(Book book, HttpServletResponse response) throws IOException {

        logger.info(book.toString());

        Integer updataBookNumber  = service.updataBook(book);

        PrintWriter pw = response.getWriter();
        JSONObject json = new JSONObject();

        if (updataBookNumber != 0){
            json.put("success","1");
        }else {
            json.put("success","0");
        }
        logger.info(book.getAuthor()+"----"+updataBookNumber+"----"+json);
        pw.print(json);
        pw.flush();
        pw.close();

    }

    @RequestMapping(value = "/deleteBook.do" ,method = RequestMethod.GET)
    public String deleteBook(Integer bookId,ModelMap map){

        Integer deleteBookNumber  = service.deleteBook(bookId);
        logger.info(bookId+"--------"+deleteBookNumber);
        map.addAttribute("number",deleteBookNumber);
        return getBookList(map);
    }

    @RequestMapping(value = "/getBook.do" ,method = RequestMethod.GET)
    public String getBook(Integer bookId,ModelMap map){
        Book book  = service.getBook(bookId);
         map.addAttribute("book",book);
        return "/book";
    }

    @RequestMapping(value = "/getBookList.do" ,method = RequestMethod.GET)
    public String getBookList(ModelMap map){
        List<Book> list  = service.getBookList();
        map.addAttribute("list",list);
        return "/book";
    }
}
