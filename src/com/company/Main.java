package com.company;

public class Main {
    public static void main(String[] args) {
        marriage();
    }
    public static void marriage()
    {
        Person person1 = new Person(true,"Иван");
        Person person2 = new Person(false,"Мария");

        Person person3 = new Person(true,"Михаил");
        Person person4 = new Person(false, "Виктория");

        System.out.println(person1.marry(person2));//женим первую пару
        System.out.println();
        System.out.println(person3.marry(person4));//женим вторую пару
        System.out.println();
        System.out.println(person1.marry(person4));//меняем супругов
        System.out.println();
        System.out.println(person1.marry(person3));//пытаемся поженить однополых (по идее false )
    }
}