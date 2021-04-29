package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    protected int hitPoints;
    protected int damage;
    protected boolean isArmored;

    public MilitaryUnit(int hitPoints, int damage, boolean isArmored) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.isArmored = isArmored;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int doDamage(){
        return damage;
    }

    public void sufferDamage(int damage){
        hitPoints -= isArmored?damage/2:damage;
    }
}
