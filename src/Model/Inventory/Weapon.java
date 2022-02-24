package Model.Inventory;

import Model.Enumerators.DiceType;

//represents a weapon
public class Weapon extends Item {
    Weapon (String name, DiceType diceDamage){
        this.name = name;
        this.diceDamage = diceDamage;
    }

    private DiceType diceDamage; //specifies which type of damage die the weapon has
    private int mgBonus; //
}
