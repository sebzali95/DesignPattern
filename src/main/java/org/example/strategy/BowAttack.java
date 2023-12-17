package org.example.strategy;

public class BowAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Can attack with Bow...");
    }
}
