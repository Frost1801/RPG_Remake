package Testing;

//required to run the tests from main
import Testing.ModelTests.TravellerTester;
import Testing.ModelTests.WarriorTester;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//tested classes
import Testing.ControllerTests.ControllerTester;

public class testStart {
    public static void main (String [] args){
        Result result = JUnitCore.runClasses(ControllerTester.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());

        result = JUnitCore.runClasses(WarriorTester.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
