package Testing;

//required to run the tests from main
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//tested classes
import Testing.ControllerTests.controllerTester;

public class testStart {
    public static void main (String [] args){
        Result result = JUnitCore.runClasses(controllerTester.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
