package Model.Character;

import Model.Enumerators.StatType;

public class Statistic {
    Statistic(int value, StatType type){
        this.value = value;
        this.type = type;
    }

    public int getBonus(){ //returns the bonus associated to the stat
        return (value - 10)/2;
    }

    public int getValue() {
        return value;
    }

    private StatType type;
    private int value;
}
