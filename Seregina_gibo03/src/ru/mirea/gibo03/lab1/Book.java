package ru.mirea.gibo03.lab1;
import java.lang.*;

public class Book {
    private String color;
    private int page;

    public Book(String c, int p) {
        color = c;
        page = p;
    }

    public Book(String c) {
        color = c;
        page = 0;
    }

    public Book() {
        color = "whate";
        page = 50;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getColor(String color) {
        return color;
    }

    public int getPage() {
        return page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "color='" + color + '\'' +
                ", page=" + page +
                '}';
    }

    public void numberofcharacters() {
        System.out.println("Book with color " + color + " has " + (page/2) + " sheets");
    }
}
