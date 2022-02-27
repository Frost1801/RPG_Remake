package Testing.ModelTests;


import Model.Character.AvailableClasses.Warrior;
import Model.Enumerators.StatType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Model.Character.AvailableClasses.Wizard;

import java.util.Vector;

public class WizardTester {
    @Before
    public void setup(){
        Vector<Integer> statsVector = createStatsVector(10);
        tested = new Wizard("Tested",statsVector);
    }

    Vector<Integer> createStatsVector(int value){ //sets all the stats value to 10
        int statNumber = 5;
        Vector <Integer> statsVector = new Vector<>(statNumber);
        for (int i = 0; i < statNumber;i++ ){ //sets all stats to 10
            statsVector.add(value);
        }
        return statsVector;
    }
    @Test
    public void testSettingStats(){ //checks the value of the stat
        createStatsVector(10);
        for (StatType st: StatType.values()){
            Assert.assertEquals("Stat not set correctly", 10, tested.getStatValue(st));
        }
    }
    @Test
    public void testStatBonus(){ //checks the bonus of the stat
        createStatsVector(10);
        for (StatType st: StatType.values()){
            Assert.assertEquals("Bonus does not match", 0, tested.getStatBonus(st));
        }
    }
    @Test
    public void testHP () {
        tested.setStats(createStatsVector(12));
        Assert.assertEquals(7,tested.getMaxHp());
    }

    Wizard tested;
}
