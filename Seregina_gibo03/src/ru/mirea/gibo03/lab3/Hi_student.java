package ru.mirea.gibo03.lab3;

public class Hi_student extends Student {
    protected String group;

    public Hi_student(String name, int age, String number, String group) {
        super(name, age, number);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        /*
                return "Hi_student{" +
                "group='" + group + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
         */
        return "Hi_student{" +
                "group='" + group + '\'' +
                "name" + super.getName() +
                "number" + super.getNumber() +
                "age" + super.getName() +
                '}';
    }

    public void say(){
        System.out.println("Здравствуйте!!!");
    }
}