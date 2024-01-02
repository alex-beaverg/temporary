package com.solvd;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() { }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName == null ? 0 : firstName.hashCode();
        result = 31 * result + (lastName == null ? 0 : lastName.hashCode());
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName + ", " + age + " years old";
    }
}
