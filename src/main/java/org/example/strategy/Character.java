package org.example.strategy;

import java.util.ArrayList;
import java.util.List;

public abstract class Character {

    private  List<AttackStrategy> attackStrategies = new ArrayList<>();

    abstract void displayCharClass();

    public void addAttackStrategy(AttackStrategy attackStrategy) {
        attackStrategies.add(attackStrategy);
    }
    public void attack(){
        for(AttackStrategy attackStrategy : attackStrategies){
            attackStrategy.attack();
        }
    }
}
