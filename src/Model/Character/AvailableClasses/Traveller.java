package Model.Character.AvailableClasses;

import Model.Character.Character;
import Model.Enumerators.DiceType;
import Model.Enumerators.RpgClass;
import Model.Enumerators.StatType;
import Model.Inventory.Weapon;


public class Traveller extends Character {
    Traveller (String name){
        this.name = name;
        level = 1;
        characterClass = RpgClass.TRAVELLER;
        hpDice = DiceType.D8;
        maxHp = stats.get(StatType.CON).getBonus() + hpDice.getMaxValue(); //initial hp is set to the maximum for the damage + constitution
        hp = maxHp;
        weapon = new Weapon("Axe", DiceType.D8);
    }



}
