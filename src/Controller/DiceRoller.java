package Controller;

import Model.Enumerators.DiceType;
import java.util.Random;

public class DiceRoller {
    public static int rollDice (DiceType type, int rollsN){ //method to roll dice
        int result = 0;
        int maxValue = type.getMaxValue();
        Random rd = new Random();
        for (int i = 0; i< rollsN; i++){ //rolls the dice a number of times equals to rollsN and adds the result
            int rolled = rd.nextInt(maxValue) + 1; //numbers from 1 to maxvalue
            result +=rolled;
        }
        return result;
    }

}
