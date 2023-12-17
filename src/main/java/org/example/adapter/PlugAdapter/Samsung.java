package org.example.adapter.PlugAdapter;

public class Samsung implements Telephone {
    private final int operatingVoltage;

    public Samsung() {
        operatingVoltage = 15;
    }

    @Override
    public int chargeIt() {
        System.out.println("Telephone started");
        return operatingVoltage;
    }
}
