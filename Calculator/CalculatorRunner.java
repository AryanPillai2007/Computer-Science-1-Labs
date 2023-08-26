import java.util.*;
public class CalculatorRunner
{
     public static void main(String []args)
     {
        Calculator calc = new Calculator();
        Scanner console = new Scanner(System.in);
        char goAgain;
        do
        {
            System.out.print("\u000c");
            System.out.print("Type first number >>> ");
            calc.setNumber1(console.nextDouble());
            System.out.print("Type second number >>> ");
            calc.setNumber2(console.nextDouble());
            calc.displayChoices();
            System.out.print("Choose operation >>> ");
            calc.setOperation(console.nextInt());
            calc.getAnswer();
            System.out.print("Perform another operation? (y/n) >>> ");
            goAgain = console.next().toLowerCase().charAt(0);
        } while (goAgain == 'y');
     }
}
