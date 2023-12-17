package org.example.protorype;

public class MainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        var employees = new Employees();
        employees.loadData();

//        try {
            Employees clone1 = (Employees) employees.clone();
            Employees clone2 = (Employees) employees.clone();

            System.out.println("Clone1 " + clone1);
            System.out.println("Clone2 " + clone2);
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
    }
}
