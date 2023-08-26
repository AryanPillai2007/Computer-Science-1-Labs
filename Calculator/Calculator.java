//Name: 
import java.util.*;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //Menu
        System.out.println("-- Welcome to my calculator! --");
        System.out.println("Choose an operation from the menu >>> ");
        
        System.out.println("1 - addition (+)");
        System.out.println("2 - subtraction (-)");
        System.out.println("3 - multiplication (*)");
        System.out.println("4 - division (/)");
        System.out.println("5 - modulus (%)");
        int total = console.nextInt();
        console.nextLine();
        if (total == 1)
        {
            System.out.print("Enter first number >>> ");
            double number1 = console.nextInt();
            System.out.print("Enter second number >>> ");
            double number2 = console.nextInt();
            System.out.print(number1 + number2);
        }
        if (total == 2)
        {
            System.out.print("Enter first number >>> ");
            double number3 = console.nextInt();
            System.out.print("Enter second number >>> ");
            double number4 = console.nextInt();
            System.out.print(number3 - number4);
        }
        if (total == 3)
        {
            System.out.print("Enter first number >>> ");
            double number5 = console.nextInt();
            System.out.print("Enter second number >>> ");
            double number6 = console.nextInt();
            System.out.print(number5 * number6);
        }
        if (total == 4)
        {
            System.out.print("Enter first number >>> ");
            double number7 = console.nextInt();
            System.out.print("Enter second number >>> ");
            double number8 = console.nextInt();
            System.out.print(number7 / number8);
        }
        if (total == 5)
        {
            System.out.print("Enter first number >>> ");
            double number9 = console.nextInt();
            System.out.print("Enter second number >>> ");
            double number10 = console.nextInt();
            System.out.print(number9 % number10);
        }

    }
}