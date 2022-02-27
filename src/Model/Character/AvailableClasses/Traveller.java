package Model.Character.AvailableClasses;

import Model.Character.Character;
import Model.Enumerators.DiceType;
import Model.Enumerators.RpgClass;
import Model.Enumerators.StatType;
import Model.Inventory.Weapon;

import java.util.HashMap;
import java.util.Vector;


public class Traveller extends Character {
    public Traveller(String name, Vector<Integer> statsValue){
        this.name = name;
        level = 1;
        characterClass = RpgClass.TRAVELLER;
        hpDice = DiceType.D8;
        stats = new HashMap<>();
        setStats(statsValue);
        calculateHealth();//initial hp is set to the maximum for the damage + constitution
        hp = maxHp;
        weapon = new Weapon("Axe", DiceType.D8);
    }



}
