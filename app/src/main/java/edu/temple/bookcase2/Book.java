package edu.temple.bookcase2;

import android.content.Context;

public class Book {

    Context context;
    private int id;
    private String title;
    private String author;
    private int year;
    private String coverURL;
    private int duration;

    public Book(int id, String title, String author, int year, String coverURL, Context context){
        this.context = context;
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.coverURL = coverURL;
    }
    //setter for book
    public Book(Book book){
        this.id = book.id;
        this.author = book.author;
        this.year = book.year;
        this.coverURL = book.coverURL;
        this.duration = book.duration;
    }
}
