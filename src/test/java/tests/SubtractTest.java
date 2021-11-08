package tests;

import object.Calculator;
import object.ReadClass;

public class SubtractTest {
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
            case 2: System.out.println(calculator.subtract(30));
                break;
        }
    }

}
