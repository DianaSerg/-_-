package ru.mirea.gibo03.lab1;
import java.lang.*;

public class Ball {
    private String color;
    private int radius;

    public Ball(String c, int r) {
        color = c;
        radius = r;
    }

    public Ball(String c) {
        color = c;
        radius = 0;
    }

    public Ball() {
        color = "red";
        radius = 10;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }

    public void volumeandcolorofBall() {
        System.out.println("Volume of ball with color " + color + " is " + (4.0/3.0) * Math.PI * radius * radius);
    }
}
