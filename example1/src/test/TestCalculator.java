package test;
import main.Calculator;

/**
 * This is a very bad way to test if our Calculator code works
 * as we want it to.  Does not scale at all well, not good when
 * refactoring code.
 */

public class TestCalculator {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();

        if (calculator.add(2, 2) == 4) {
            System.out.println("2 + 2 = works");
        }
        else {
            System.out.println("2 + 2 = does not work");
        }
        
        if (calculator.add(2.5, 2.7) == 5.2) {
            System.out.println("2.5 + 2.7 = works");
        }
        else {
            System.out.println("2.5 + 2.7 = does not work");
        }
        
    }
}
