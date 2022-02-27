package Model.Character;

import java.lang.reflect.Array;
import java.util.Vector;
import java.util.HashMap;

import Model.Enumerators.DiceType;
import Model.Enumerators.RpgClass;
import Model.Enumerators.StatType;
import Model.Inventory.StatusEffect;
import Model.Inventory.Weapon;

public class Character {



    public void setStats (Vector<Integer> statsValue){

        int counter = 0;
        for (StatType st: StatType.values()){
            Statistic toPush = new Statistic(statsValue.elementAt(counter),st);
            stats.put(st,toPush);
            counter ++;
        }
        calculateHealth();
    }

    protected void calculateHealth (){ //recalculates max health in case con gets changed
        int total = stats.get(StatType.CON).getBonus() + hpDice.getMaxValue();
        for (int i = 1; i < level; i++){
            total +=  hpDice.getMaxValue() + stats.get(StatType.CON).getBonus();
        }
        maxHp = total;
    }

    public int getStatBonus (StatType type){
        return stats.get(type).getBonus();
    }
    public int getStatValue (StatType type){
        return stats.get(type).getValue();
    }


    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    protected String name;
    protected int level;
    protected RpgClass characterClass;
    protected int hp; //current HP the character has
    protected int maxHp;
    protected DiceType hpDice; //the dice that the character uses for its HP
    protected Weapon weapon; //weapon used
    protected Vector<StatusEffect> statusEffects; //effects that the character is facing
    protected HashMap<StatType,Statistic> stats; //represents a statistic of the character, to access it we use the statistic type as key
}
