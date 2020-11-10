package ru.mirea.gibo03.lab3;
import java.math.*;

public class Square extends Rectangle {

    protected double side;

    public Square() {
        this.filled = false;
        this.color = "Green";
        this.width = 7;
        this.length = 3;
        this.side = 18;
    }

    public Square(double side) {
        this.filled = false;
        this.color = "Green";
        this.width = 7;
        this.length = 3;
        this.side = side;
    }

    public Square(String color, boolean filled, double width, double length, double side) {
        super(color, filled, width, length);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.side + ", color: "+this.color
                + ", perimeter: " + getPerimeter() + ", area: " + getArea();
    }
}
