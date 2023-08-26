//Name:
import java.util.*;
public class PracticeProblems
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //1
        for(int i = 1; i <= 9; i++)
        {
            System.out.print(i);
        }
        System.out.println(" ");
        //2
        for (int i = 0; i < 10; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        //3
        int evennum = 20;
        for(int e=1; e<=evennum; e++)
        {
            if(e%2==0)
                System.out.print(e + " ");
        }
        System.out.println(" ");
        //4
        for (int i = 20; i < 26; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        //
        for(int i = 0; i <= 10; i++)
        {
            if (i > 0)
            {
                System.out.print("-" + i + " ");
            }
            else
            {
                System.out.print(i + " ");
            }
        }
        //8
        System.out.println("");
        System.out.print("Enter an integer >>> ");
        int num = console.nextInt();
        for(int asterisk = 1; asterisk <= num; asterisk++)
        {
            System.out.print("*");
        }
        //9
        System.out.println("");
        for(int squareRoot = 1; squareRoot <= 10; squareRoot++)
        {
            System.out.print(squareRoot * squareRoot + " ");
        }
        //10
        System.out.println("");
        for(int multiple = 1; multiple == 15; multiple++)
        {
            if (multiple % 3 == 0)
            {
                System.out.print(" ? ");
            }
            else
            {
                System.out.print(" " + multiple + " ");
            }
        }
        for(int multiple = 1; multiple <= 16; multiple++)
        {
            if (multiple % 3 == 0)
            {
                System.out.print("? ");
            }
            else
            {
                System.out.print(multiple + " ");
            }
        }
        //11
        System.out.println("");
        System.out.print("Enter an integer below 10 >>> ");
        int factorial = console.nextInt();
        int yeet = 1;
        if (factorial >= 0 && factorial < 10)
        {
            if(factorial >= 1)
            {
                for(int number = 1; number <= factorial; number++)
                {
                    yeet = yeet*number;
                }
                System.out.print("Factorial of " + factorial + " is " + yeet);
            }
            else if (factorial < 1)
            {
                System.out.print("Factorial of 0 is 1");
            }
        }
    }
}
