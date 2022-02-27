package Model.Character.AvailableClasses;

import Model.Character.Character;
import Model.Enumerators.DiceType;
import Model.Enumerators.RpgClass;
import Model.Enumerators.StatType;
import Model.Inventory.Weapon;

import java.util.HashMap;
import java.util.Vector;

public class Wizard extends Character {
    public Wizard(String name, Vector<Integer> statsValue) {
        this.name = name;
        level = 1;
        characterClass = RpgClass.WIZARD;
        hpDice = DiceType.D6;
        stats = new HashMap<>();
        setStats(statsValue);
        calculateHealth();
        hp = maxHp;
        weapon = new Weapon("Staff", DiceType.D8);
    }
}
