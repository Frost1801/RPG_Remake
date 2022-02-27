package Model.Character.AvailableClasses;

import Model.Character.Character;
import Model.Enumerators.DiceType;
import Model.Enumerators.RpgClass;
import Model.Enumerators.StatType;
import Model.Inventory.Weapon;

public class Warrior extends Character {
    Warrior(String name){
        this.name = name;
        level = 1;
        characterClass = RpgClass.WARRIOR;
        hpDice = DiceType.D10;
        maxHp = stats.get(StatType.CON).getBonus() + hpDice.getMaxValue();
        hp = maxHp;
        weapon = new Weapon("Longsword", DiceType.D8);
    }
}
