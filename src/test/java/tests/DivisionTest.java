package tests;

import object.Calculator;
import object.ReadClass;
import org.junit.Before;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DivisionTest{
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
        switch (action)
        {
            case 4: System.out.println(calculator.div(10));
                break;
        }
    }
    Calculator calc = new Calculator();

    @Before
    public void runBeforeEveryTest() {
        calc.currentTotal = 0;
    }
    @Test
    public void testDivideByZero() throws Exception {
        calc.div(43);
        assertEquals(calc.currentTotal, 0.0);
    }

    @Test
    public void testDivide() throws Exception {
        calc.add(8);
        calc.div(4);
        assertEquals(calc.currentTotal, 2.0);
    }

}