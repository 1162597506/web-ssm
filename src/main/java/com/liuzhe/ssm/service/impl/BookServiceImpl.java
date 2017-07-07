package com.liuzhe.ssm.service.impl;

import com.liuzhe.ssm.entity.Book;
import com.liuzhe.ssm.mapper.BookMapper;
import com.liuzhe.ssm.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Alan on 2017/6/30.
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper mapping;

    public Integer addBook(Book book){
        return mapping.insert(book);
    }

    public Integer updataBook(Book book){
        return mapping.updateByPrimaryKey(book);
    }

    public Integer deleteBook(Integer bookId){
        return mapping.deleteByPrimaryKey(bookId);
    }

    public Book getBook(Integer bookId){
        return mapping.selectByPrimaryKey(bookId);
    }

    public List<Book> getBookList() {
        return mapping.selectAll();
    }
}
