package org.example.protorype;

import java.util.ArrayList;

public class Employees implements Cloneable {
    private ArrayList<String> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void loadData() {
        // Loads employees data from 3-4 sources which are super heavy operations
        this.employees.add("Sebzali");
        this.employees.add("Kamran");
        this.employees.add("Orxan");
        this.employees.add("Mahmud");
    }
    // Some other methods

    // Cloneable overridden method

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ArrayList<String> clonedEmployeeList = new ArrayList<>(this.employees);
        Employees clonedEmployees = new Employees();
        clonedEmployees.employees = clonedEmployeeList;
        return clonedEmployees;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employees=" + employees +
                '}';
    }
}
