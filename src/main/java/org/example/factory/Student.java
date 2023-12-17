package org.example.factory;

public class Student extends User {

    @Override
    public void save(String name) {
        System.out.println("Student saved : " + name);
    }
}
