//Name: Aryan Pillai 
import java.util.*;
public class PracticeProblems {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //Number1
        System.out.println("Which of the following will declare and initialize a variable in Java?");
        System.out.println("1. int 2a = 4;");
        System.out.println("2. double circle-area = 5.78;");
        System.out.println("3. string s = hello!;");
        System.out.println("4. boolean whoa_now = true;");
        System.out.println("Enter answer >>> ");
        int answer = console.nextInt();
        switch (answer)
        {
            case 1:
                System.out.println("True");
                break;
            case 2:
                System.out.println("True");
                break;
            case 3:
                System.out.println("Incorrect");
                break;
            case 4:
                System.out.println("True");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        //Number2
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Enter a number >>> ");
        double x = console.nextDouble();
        System.out.print("Enter a number >>> ");
        double y = console.nextDouble();
        System.out.print("Enter a number (1)+, (2)-, (3)*, (4)/, (5)%, (6)exp  >>> ");
        int operation = console.nextInt();
        switch (operation)
        {
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                System.out.println(x/y);
                break;
            case 5:
                System.out.println(x%y);
                break;
            case 6:
                System.out.println(Math.pow(x, y));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

        //Number3
        System.out.println("Making a PB&J sandwich?  Which step are you stuck on? >>> ");
        int steps = console.nextInt();
        switch (steps)
        {
            case 1:
                System.out.println("1. Get 2 pieces of bread, a jar of peanut butter and a jar of jelly");
                break;
            case 2:
                System.out.println("2. Open both jars.");
                
            case 3:
                System.out.println("3. Spread peanut butter on 1 piece of bread.");
                
            case 4:
                System.out.println("4. Spoon jelly onto the other piece of bread.");
                
            case 5:
                System.out.println("5. Put bread together so that the peanut butter and jelly are touching.");
               
            case 6:
                System.out.println("6. Give the sandwich to your dog and feast on a much better food. Salsa!");
                   break;
            default:
                System.out.println("Invalid step.");
                
        }
    }
}
