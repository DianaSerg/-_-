package ru.mirea.gibo03.lab1;
import java.lang.*;

public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a) {
        name = n;
        age = a;
    }
    public Dog(String n) {
        name = n;
        age = 0;
    }
    public Dog() {
        name = "Archi";
        age = 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(String name) {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}