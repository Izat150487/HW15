package com.company;

import java.util.StringJoiner;

public class Person {
    private String name;
    private String designation;

    public Person() {

    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void Learn() {
        System.out.println("Okup uironot");
    }

    public void Walk() {
        System.out.println("ary beri basyp gulyat' etet");
    }

    public void Eat() {
        System.out.println("Tamak jeit");

    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("designation='" + designation + "'")
                .toString();
    }
}