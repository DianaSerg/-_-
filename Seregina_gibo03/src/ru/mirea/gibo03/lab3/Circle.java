package ru.mirea.gibo03.lab3;
import java.math.*;

public class Circle extends Shape {

    protected double radius;

    public Circle() {
        this.filled = false;
        this.color = "black";
        radius = 5;
    }

    public Circle(double radius) {
        this.filled = false;
        this.color = "black";
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: " +this.radius+ ", color: "+this.color;
    }
}
