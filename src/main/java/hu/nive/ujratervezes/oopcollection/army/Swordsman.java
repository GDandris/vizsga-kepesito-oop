package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit{

    private boolean firstStrikeReceived = true;

    public Swordsman(boolean isArmored){
        super(100,10,isArmored);
    }

    public void sufferDamage(int damage){
        if(firstStrikeReceived){
            firstStrikeReceived = false;
        }
        else {
            hitPoints -= isArmored ? damage / 2 : damage;
        }
    }
}