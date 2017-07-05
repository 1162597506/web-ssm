package com.liuzhe.ssm.controller;

import com.liuzhe.ssm.entity.Book;
import com.liuzhe.ssm.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by Alan on 2017/6/30.
 */
@Controller
public class BookController {

    @Resource
    BookService service;

    @RequestMapping(value = "/addBook.do" ,method = RequestMethod.POST)
    public String addBook(Book book, ModelMap map){
        Integer addBookNumber  = service.addBook(book);
        map.addAttribute("number",addBookNumber);
        return "path";
    }

    @RequestMapping(value = "/updataBook.do" ,method = RequestMethod.GET)
    public String updataBook(Book book, ModelMap map){
        Integer updataBookNumber  = service.updataBook(book);
        map.addAttribute("number",updataBookNumber);
        return "path";
    }

    @RequestMapping(value = "/deleteBook.do" ,method = RequestMethod.GET)
    public String deleteBook(Integer bookId,ModelMap map){
        Integer deleteBookNumber  = service.deleteBook(bookId);
        map.addAttribute("number",deleteBookNumber);
        return "path";
    }

    @RequestMapping(value = "/getBook.do" ,method = RequestMethod.GET)
    public String getBook(Integer bookId,ModelMap map){
//        Book book  = service.getBook(bookId);
//      map.addAttribute("book",book);
        return "hello";
    }

}
