package ru.mirea.gibo03.lab1;

public class DemoCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle( 5.5, "red");
        System.out.println(c1);
        c1.setColor("black");
        c1.setRadius(2.9);
        System.out.println(c1);
    }

}
