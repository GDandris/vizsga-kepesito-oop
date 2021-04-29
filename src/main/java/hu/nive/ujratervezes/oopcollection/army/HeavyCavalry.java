package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit{

    private boolean firstStrike = true;

    public HeavyCavalry(){
        super(150,20,true);
    }

    public int doDamage(){
        if(firstStrike){
            firstStrike = false;
            return damage*3;
        }
        return damage;
    }
}