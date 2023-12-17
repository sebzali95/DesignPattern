package org.example.factory;

public class Teacher extends User{

    @Override
    public void save(String name) {
        System.out.println("Teacher saved : " + name);
    }
}
