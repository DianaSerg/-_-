package ru.mirea.gibo03.lab2;
import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        ru.mirea.gibo03.lab2.Ball b1 = new Ball(150, 125);
        System.out.println(b1);
        b1.move(50, 25);
        System.out.println(b1);
    }
}
