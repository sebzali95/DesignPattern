package org.example.adapter;

public class Television implements ElectricHouseholdAppliances {

    private final int volt;

    public Television() {
        volt = 200;
    }

    @Override
    public int plugStartWorking() {
        System.out.println("Television started");
        return volt;
    }
}
