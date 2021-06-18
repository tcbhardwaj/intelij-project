package com.telemed.entity;

public class Article {
    private int id;
    private String title;
    private String link;
    private int points;
    private int num_comments;
    private String author;
    private String created_date;
    private String created_time;
    private String day_of_the_week;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getNum_comments() {
        return num_comments;
    }

    public void setNum_comments(int num_comments) {
        this.num_comments = num_comments;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public String getDay_of_the_week() {
        return day_of_the_week;
    }

    public void setDay_of_the_week(String day_of_the_week) {
        this.day_of_the_week = day_of_the_week;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", points=" + points +
                ", num_comments=" + num_comments +
                ", author='" + author + '\'' +
                ", created_date='" + created_date + '\'' +
                ", created_time='" + created_time + '\'' +
                ", day_of_the_week='" + day_of_the_week + '\'' +
                '}';
    }
}
