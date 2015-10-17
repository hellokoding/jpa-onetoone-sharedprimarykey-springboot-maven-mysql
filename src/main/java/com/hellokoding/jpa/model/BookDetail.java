package com.hellokoding.jpa.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book_detail")
public class BookDetail implements Serializable{
    private Integer bookId;
    private Integer numberOfPages;
    private Book book;

    public BookDetail(){

    }

    public BookDetail(Integer numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    @Id
    @Column(name = "book_id")
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Column(name = "number_of_pages")
    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @JoinColumn(name = "book_id")
    @OneToOne
    @MapsId
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
