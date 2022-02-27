package Model.Inventory;

import Model.Enumerators.DiceType;

//represents a weapon
public class Weapon extends Item {
    public Weapon(String name, DiceType diceDamage){
        this.name = name;
        this.diceDamage = diceDamage;
        this.diceN = 1;
    }
    Weapon (String name, DiceType diceDamage, int diceN){
        this.name = name;
        this.diceDamage = diceDamage;
        this.diceN = diceN;
    }

    private DiceType diceDamage; //specifies which type of damage die the weapon has
    int diceN; //number of dice rolled
    private int mgBonus; //
}
