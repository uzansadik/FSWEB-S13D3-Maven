package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Person person = new Person("Sadık", "Uzan", 13);
        System.out.println(person);
        System.out.println(person.toString());

        Person secondPerson = new Person("John", "Doe",30,"Male","Turkey","1234567890");
        System.out.println(person.checkIdentityNumber());

        Wall karsiDuvar = new Wall(10,10);
        System.out.println(karsiDuvar.getArea());

        Wall yanDUvar = new Wall(10,-10);
        System.out.println(yanDUvar.getArea());

    }


}
