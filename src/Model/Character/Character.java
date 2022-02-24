package Model.Character;

import java.util.Vector;
import java.util.HashMap;

import Model.Enumerators.RpgClass;
import Model.Enumerators.StatType;
import Model.Inventory.StatusEffect;
import Model.Inventory.Weapon;

public class Character {







    private String name;
    private int level;
    private RpgClass characterClass;
    private int hp;
    private int maxHp;
    private Weapon weapon;
    private Vector<StatusEffect> statusEffects; //effects that the character is facing
    private HashMap<StatType,Statistic> stats; //represents a statistic of the character, to access it we use the statistic type as key
}
