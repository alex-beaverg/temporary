package com.solvd;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person("Alex", "Hill", 35);
        System.out.println(person);
        person.setFirstName("Max");
        person.setLastName("Fox");
        person.setAge(23);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
    }
}