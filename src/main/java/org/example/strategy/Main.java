package org.example.strategy;

public class Main {
    public static void main(String[] args) {
        var sura = new Sura();
        sura.addAttackStrategy(new SwordAttack());
        sura.displayCharClass();
        sura.attack();

        System.out.println("--------------------------------");


        var ninja = new Ninja();
        ninja.addAttackStrategy(new BowAttack());
        ninja.addAttackStrategy(new SwordAttack());
//        ninja.addAttackStrategy(new KnifeAttack());
        ninja.displayCharClass();
        ninja.attack();

        System.out.println("--------------------------------");

        var fighter = new Fighter();
        fighter.addAttackStrategy(new AxeAttack());
        fighter.addAttackStrategy(new SwordAttack());
        fighter.displayCharClass();
        fighter.attack();
    }
}
