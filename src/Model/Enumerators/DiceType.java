package Model.Enumerators;

//max value of a die is the max value that the rolling of that die can produce
public enum DiceType {
    D4(4),D6(6),D8(8),D10(10),D12(12),D20(20),D100(100),NO_DICE(0);
    DiceType(int max){
        maxValue = max;
    }

    public int getMaxValue() {
        return maxValue;
    }

    private final int maxValue;

}
