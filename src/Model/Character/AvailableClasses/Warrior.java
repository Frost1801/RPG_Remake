package Model.Character.AvailableClasses;

import Model.Character.Character;
import Model.Enumerators.DiceType;
import Model.Enumerators.RpgClass;
import Model.Enumerators.StatType;
import Model.Inventory.Weapon;

import java.util.HashMap;
import java.util.Vector;

public class Warrior extends Character {
    public Warrior(String name, Vector<Integer> statsValue){
        this.name = name;
        level = 1;
        characterClass = RpgClass.WARRIOR;
        hpDice = DiceType.D10;
        stats = new HashMap<>();
        setStats(statsValue);
        calculateHealth();
        hp = maxHp;
        weapon = new Weapon("Longsword", DiceType.D8);
    }
}
