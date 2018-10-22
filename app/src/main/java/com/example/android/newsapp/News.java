package com.example.android.newsapp;

public class News {
    // data declaration
    String title;
    String section;
    String author;
    String date;
    String url;

    // constructor
    public News(String title, String section, String author, String date, String url) {
        this.title = title;
        this.section = section;
        this.author = author;
        this.date = date;
        this.url = url;
    }

    // return news title
    public String getTitle() {
        return title;
    }

    // return news section
    public String getSection() {
        return section;
    }

    // return news autor
    public String getAuthor() {
        return author;
    }

    // return news date
    public String getDate() {
        return date;
    }

    // return news url
    public String getUrl() {
        return url;
    }
}
