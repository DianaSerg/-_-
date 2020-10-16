package ru.mirea.gibo03.lab1;
import java.lang.*;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("red", 58);
        Book b2 = new Book("black", 100);
        Book b3 = new Book("orange");
        b3.setPage(88);
        System.out.println(b1);
        b1.numberofcharacters();
        b2.numberofcharacters();
        b3.numberofcharacters();
    }
}
