package com.example.as;

import java.util.Date;

/**
 * @author jiayingchen
 * @created 2020/04/30
 * @project course-april-2020
 */

public class Book {

    private static long id;
    private static java.lang.String isbn;
    private static java.lang.String name;
    private static java.lang.String author;
    private static Date publishDate;

    public Book(){
    }

    public Book(long id, java.lang.String isbn, java.lang.String name, java.lang.String author, Date publishDate){
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
    }

    static {
        id = 12345;
        isbn = "s-df234234";
        name = "CoreJava";
        author = "Andy";
        publishDate = new Date(2020,4,1);
    }

    public static void main(java.lang.String[] args){
        //below is the static block info
        System.out.println(id);
        System.out.println(isbn);
        System.out.println(name);
        System.out.println(author);
        System.out.println(publishDate);


        Book book2 = new Book(23455,"fijsdad","sdjifd","gj",new Date(2020,4,2));
//        System.out.println(book2.name);

    }
}
