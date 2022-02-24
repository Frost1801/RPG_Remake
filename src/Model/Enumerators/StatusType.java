package Model.Enumerators;

//possible status effects types

public enum StatusType {
    BLEEDING(3,DiceType.D4),SHIELD(3,DiceType.NO_DICE), POISONED(3,DiceType.D6);
    private final int maxTurns; //represents the number of turns for which the status is active
    private final DiceType type;
    StatusType (int maxTurns, DiceType dice){
        this.maxTurns = maxTurns;
        this.type = dice;
    }

    public int getMaxTurns() {
        return maxTurns;
    }

    public DiceType getType() {
        return type;
    }
}
