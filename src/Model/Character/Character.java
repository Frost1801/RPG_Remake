package Model.Character;

import java.util.Vector;
import java.util.HashMap;

import Model.Enumerators.DiceType;
import Model.Enumerators.RpgClass;
import Model.Enumerators.StatType;
import Model.Inventory.StatusEffect;
import Model.Inventory.Weapon;

public class Character {







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
