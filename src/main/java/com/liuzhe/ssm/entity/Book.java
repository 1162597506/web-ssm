package com.liuzhe.ssm.entity;

public class Book {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.book_id
     *
     * @mbggenerated
     */
    private Integer bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.price
     *
     * @mbggenerated
     */
    private Integer price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.author
     *
     * @mbggenerated
     */
    private String author;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated
     */
    public Book(Integer bookId, Integer price, String author) {
        this.bookId = bookId;
        this.price = price;
        this.author = author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated
     */
    public Book() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.book_id
     *
     * @return the value of book.book_id
     *
     * @mbggenerated
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.book_id
     *
     * @param bookId the value for book.book_id
     *
     * @mbggenerated
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.price
     *
     * @return the value of book.price
     *
     * @mbggenerated
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.price
     *
     * @param price the value for book.price
     *
     * @mbggenerated
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.author
     *
     * @return the value of book.author
     *
     * @mbggenerated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.author
     *
     * @param author the value for book.author
     *
     * @mbggenerated
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}