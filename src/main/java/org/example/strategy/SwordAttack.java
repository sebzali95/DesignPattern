package org.example.strategy;

public class SwordAttack implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Can attack with Sword...");
    }
}
