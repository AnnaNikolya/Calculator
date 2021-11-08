package tests;

import object.Calculator;
import object.ReadClass;
import org.junit.Before;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;


public class SummaTest {


    public static void main(String[] args) {

        ReadClass readClass = new ReadClass();
        int a = 0;
        int b = 0;

        Calculator calculator = new Calculator(a, b);
        System.out.println("Enter number a");
        a = readClass.readNextInt();
        System.out.println("Enter number b");
        b = readClass.readNextInt();

        int sum = a + b;
        System.out.println(calculator.sum(7, 3, "+"));
    }
        Calculator calc = new Calculator();
        @Before
        public void runBeforeEveryTest () {
            calc.currentTotal = 0;
        }

        @Test(description = "Result")
        public void Test1 () {
            int sum = calc.sum(7, 3, "+");
            System.out.println();
        }

        @Test(description = "Get total string", invocationCount = 3)
        public void Test2 () throws Exception {
                calc.currentTotal = 50;
                assertTrue(calc.currentTotal % 1.0 == 0);
        }

        @Test(priority = 1)
        public void assertEquals(int currentTotal, double v) throws Exception{
                calc.equal("20");
                assertEquals(calc.currentTotal, 45.0);
        }



    @Test(description = "Add 800", invocationCount = 3, threadPoolSize = 5)
        public void AddTest4 () throws Exception {
            calc.add(80);
            assertEquals(calc.currentTotal, 80.0);
        }

        @Test(description = "Summa 10 and 20", groups = {"Math"})
        public void Test5 () throws Exception {
            public void testSubtract () throws Exception {
                calc.subtract(30);
                assertEquals(calc.currentTotal, -30.0);
            }
        }

        @Test
        public void Test6 () {
        }

        @Test
        public void Test7 () {
        }

        @Test
        public void Test8 () {
        }

        @Test
        public void Test9 () {
        }

        @DataProvider(name = "User data")
        public Object[][] userData () {
            return new Object[][]{
                    {"a", "b", "answer"},
            };
        }
        @Test(dataProvider = "User data", dataProviderClass = DataProviderTest.class, retryAnalyzer = Retry.class)
        public void Test10 ( int a, int b, String answer){
        }
    }