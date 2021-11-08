package tests;

import object.Calculator;
import object.ReadClass;
import org.junit.Before;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MultiplyTest {
    public static void main(String[] args) {
        ReadClass readClass = new ReadClass();
        int one = 0;
        int two = 0;

        System.out.println("Enter number one");
        one = readClass.readNextInt();
        System.out.println("Enter number two");
        two = readClass.readNextInt();

        Calculator calculator = new Calculator(one, two);

        int action = (int) readClass.readNextInt();
        switch (action) {
            case 4:
                System.out.println(calculator.mult(10));
                break;
        }
    }
        Calculator calc = new Calculator();

        @Before
        public void runBeforeEveryTest() {
            calc.currentTotal = 0;
        }
        @Test
        public void testMultiplyByZero() throws Exception {
            calc.mult(10);
            assertEquals(calc.currentTotal, 0.0);
        }
    @Test
    public void testMultiply() throws Exception {
        calc.add(10);
        calc.mult(10);
        assertEquals(calc.currentTotal, 100.0);
    }

    }
