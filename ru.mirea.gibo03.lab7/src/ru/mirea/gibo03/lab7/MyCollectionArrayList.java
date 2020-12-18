package ru.mirea.gibo03.lab7;

import java.util.ArrayList;

public class MyCollectionArrayList {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<String>();
        name.add("Петя");
        name.add("Алёна");
        name.add("Сергей");
        name.add("Витя");
        name.add("Саша");
        name.add("Катя");
        name.add("Лена");

        System.out.printf("В классе %d учеников. \n", name.size());
        for(String employee : name){
            System.out.println(employee);
        }

        name.add(0, "Ваня");
        name.add(5, "Гена");

        System.out.printf("В класс перевели новых учеников. Теперь их %d. \n", name.size());
        for(String employee : name){
            System.out.println(employee);
        }

        name.add(6, "Миша");

        if(name.contains("Миша")){
            System.out.println("Также в классе есть староста Миша. \n");
        }

        System.out.println(name.get(6));
        name.set(6, "Фамилия у него Ерашов Миша");
        System.out.println("Миша ‐ отличник. \n");

        name.remove(4);

        Object[] peoples = name.toArray();
        for(Object people : peoples){
            System.out.println(people);
        }

    }

}
