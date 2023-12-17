package org.example.adapter;

public class Refrigerator implements ElectricHouseholdAppliances {

    private final int volt;

    public Refrigerator() {
        volt = 200;
    }

    @Override
    public int plugStartWorking() {
        System.out.println("Refrigerator starting");
        return volt;
    }
}
