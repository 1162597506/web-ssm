package com.liuzhe.ssm.service;

import com.liuzhe.ssm.entity.Book;


/**
 * Created by Alan on 2017/6/30.
 */
public interface BookService {

    public Integer addBook(Book book);

    public Integer updataBook(Book book);

    public Integer deleteBook(Integer bookId);

    public Book getBook(Integer bookId);

}
