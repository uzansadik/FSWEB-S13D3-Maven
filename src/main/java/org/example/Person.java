package org.example;

public class Person {


    //Required
    private String firstName;
    private String lastName;
    private int age;


    private String gender;
    private String nationality;
    private String identityNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public Person(String firstName, String lastName, int age, String gender, String nationality, String identityNumber) {
        this(firstName, lastName, age);
        this.gender = gender;
        this.nationality = nationality;
        this.identityNumber = identityNumber;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
    // add tc no verifying algorithm
    public boolean checkIdentityNumber() {
        if (identityNumber == null) {
            return false;
        }
        return identityNumber.length() == 11; // return false if tcNo is not equal to 11 and null.
    }
}

