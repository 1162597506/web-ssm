package com.liuzhe.ssm.model;

/**
 * Created by Alan on 2017/6/30.
 */
public class BookModel {

    Integer bookId;
    Integer price;
    String author;

    public BookModel() {
    }

    public BookModel(Integer bookId, Integer price, String author) {
        this.bookId = bookId;
        this.price = price;
        this.author = author;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
