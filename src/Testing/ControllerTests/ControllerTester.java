package Testing.ControllerTests;
//testing libraries

import org.junit.Assert;
import org.junit.Test;

//tested class
import Controller.DiceRoller;

import Model.Enumerators.DiceType;

public class ControllerTester {
    
    
    
    @Test
    public void testRollDice (){
        DiceType dt = DiceType.D8; 
        int testSize =100; 
        boolean outcome = true; 
        for (int i = 0; i < testSize; i++){
            int result = DiceRoller.rollDice(dt,1);
            if (result < 1 || result > dt.getMaxValue()){
                outcome = false; 
                break;
            }
        }
        Assert.assertTrue("Rolls dice error, exceeding expected value",outcome);
    }
   
}
