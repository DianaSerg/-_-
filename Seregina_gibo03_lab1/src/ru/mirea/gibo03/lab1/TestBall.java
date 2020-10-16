package ru.mirea.gibo03.lab1;
import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("black", 15);
        Ball b2 = new Ball("blue", 5);
        Ball b3 = new Ball("yellow");
        b3.setRadius(20);
        System.out.println(b1);
        b1.volumeandcolorofBall();
        b2.volumeandcolorofBall();
        b3.volumeandcolorofBall();
    }

}
