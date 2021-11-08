import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
        System.out.println(calculator.sum());
    }

     @Test(description = "Summa 1 and 7")
    public void Test1(){
         System.out.println();
     }

    @Test(description = "Summa 10 and 20", invocationCount = 3)
    public void Test2(){
    }

    @Test(priority = 1)
    public void Test3(){
    }

    @Test(description = "Summa 10 and 20", invocationCount = 3, threadPoolSize = 5)
    public void Test4(){
    }

    @Test(description = "Summa 10 and 20", groups = {"Math"})
    public void Test5(){
    }

    @Test
    public void Test6(){
    }

    @Test
    public void Test7(){
    }

    @Test
    public void Test8(){
    }

    @Test
    public void Test9(){
    }

    @DataProvider(name = "User data")
    public Object[][] userData() {
        return new Object[][]{
                {"a", "b", "answer"},
        };
    }
    @Test (dataProvider = "User data", dataProviderClass = DataProviderTest.class)
    public void Test10(int a, int b, String answer){
    }
}