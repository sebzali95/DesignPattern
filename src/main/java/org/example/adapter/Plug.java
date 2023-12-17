package org.example.adapter;

public class Plug {
    public void electric(ElectricHouseholdAppliances electricHouseholdAppliances) {
        int volt = electricHouseholdAppliances.plugStartWorking();
        System.out.println("From the plug " + volt + " volt coming");
    }

}
