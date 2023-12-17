package org.example.strategy;

public class AxeAttack implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Can attack with Axe...");
    }
}
