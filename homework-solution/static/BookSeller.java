package com.example.as;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author jiayingchen
 * @created 2020/04/30
 * @project course-april-2020
 */

public class BookSeller {

    //static inner class Book
    public static class Book{

        private long id;
        private java.lang.String isbn;
        private java.lang.String name;
        private java.lang.String author;
        private Date publishDate;

        public Book(){
        }

        public Book(long id, java.lang.String isbn, java.lang.String name, java.lang.String author, Date publishDate){
            this.id = id;
            this.isbn = isbn;
            this.name = name;
            this.author = author;
            this.publishDate = publishDate;
        }

        //use this static method to initialize several books
        public static void sellBooks(){
            List<BookSeller.Book> list = new ArrayList<>();

            BookSeller.Book book2 = new Book(3333333,"jg-fijsdad","HelloJava","Andy",new Date(2020,4,2));
            BookSeller.Book book3 = new Book(2222222,"BN-skfksjd","MorningJava","Andy",new Date(2020,5,2));
            list.add(book2);
            list.add(book3);
            for(BookSeller.Book book: list){
                System.out.println(" id: "+ book.id + " isbn: " +book.isbn + " name: " + book.name + " author: " + book.author + " date: " + book.publishDate);
            }
        }

    }

    public static void main(java.lang.String[] args){
        //Display all the book by calling sellBooks
        BookSeller.Book.sellBooks();
    }

}
