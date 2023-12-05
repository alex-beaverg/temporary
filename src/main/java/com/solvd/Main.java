package com.solvd;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person("Alex", "Hill", 35);
        System.out.println(person);
        person.setFirstName("Max");
        person.setLastName("Fox");
        person.setAge(25);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.equals(new Person("Max", "Fox", 25)));
        System.out.println(new Person("Alex", "Hill", 23).hashCode());
        System.out.println(new Person("Alex", "Hill", 23).hashCode());
        System.out.println(new Person("John", "Hilla", 23).hashCode());
        System.out.println(new Person("Sam", "Hill", 33).hashCode());
    }
}