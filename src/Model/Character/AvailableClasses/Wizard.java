package Model.Character.AvailableClasses;

import Model.Character.Character;
import Model.Enumerators.DiceType;
import Model.Enumerators.RpgClass;
import Model.Enumerators.StatType;
import Model.Inventory.Weapon;

public class Wizard extends Character {
    Wizard (String name) {
        this.name = name;
        level = 1;
        characterClass = RpgClass.WIZARD;
        hpDice = DiceType.D6;
        maxHp = stats.get(StatType.CON).getBonus() + hpDice.getMaxValue();
        hp = maxHp;
        weapon = new Weapon("Staff", DiceType.D8);
    }
}
