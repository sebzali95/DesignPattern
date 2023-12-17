package org.example.bridge;

class Program {
    public static void main(String[] args) {
        System.out.println("Bridge Pattern \n");
        System.out.println(new Abstraction(new ImplementationA()).Operation());
        System.out.println(new Abstraction(new ImplementationB()).Operation());
    }
}
