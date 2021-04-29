package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Army {

    private List<MilitaryUnit> army = new ArrayList();

    public void addUnit(MilitaryUnit militaryUnit){
        army.add(militaryUnit);
    }

    public void damageAll(int damage){
        army.forEach(e ->e.sufferDamage(damage));
        army =   army.stream()
                .filter(e -> e.getHitPoints()>25)
                .collect(Collectors.toList());
    }

    public int getArmyDamage(){
        int damage = 0;
        for(MilitaryUnit militaryUnit : army){
            damage += militaryUnit.doDamage();
        }
        return damage;
    }

    public int getArmySize(){
        return army.size();
    }
}