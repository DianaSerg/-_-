package ru.mirea.gibo03.lab3;
import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Di", "dinaserg@mail.ru", 'F');
        System.out.println(a1);
        Blogger b1 = new Blogger("Хованский", "hava@mail.ru", 'M', "Хованский_лайв");
   System.out.println(b1);
   b1.name = "Ларин";
   System.out.println(b1);
   Student name = new Student("Di", 20, "sf456vjh");
   name.say();
   Hi_student hi_student = new Hi_student("Настя", 20, "2345", "gibo0318");
   hi_student.say();
   }
   
}