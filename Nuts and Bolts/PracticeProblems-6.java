
//Name: 

import java.util.*;

public class PracticeProblems
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a whole number >>>");
        int apples = console.nextInt();
        if (apples > 0)
        {
            System.out.println("That’s positive!");
        }
        System.out.println("");
        System.out.println("Enter a whole number >>>");
        int apples1 = console.nextInt();
        if(apples1>0 && apples1%2==0)
        {
            System.out.println("Omg. It's positive AND even!");
        }
        else
        {
            System.out.println("I don't like that number!");
        }
        int votingAge = 18;
        System.out.println("Enter your age >>> ");
        int actualAge= console.nextInt();

        if (actualAge >= votingAge)
        {
            System.out.println("You can vote.");
        }

        else
        {
            System.out.println("You can't vote");
        }
        System.out.print("Enter angle 1 >>> ");
        int angle1 = console.nextInt();
        System.out.print("Enter angle 2 >>> ");
        int angle2 = console.nextInt();
        System.out.print("Enter angle 3 >>> ");
        int angle3 = console.nextInt();
        if (angle1 + angle2 + angle3 == 180)
        {
            if (angle1 == angle2 && angle2 == angle3 && angle3 == angle1)
                System.out.println("That's an equilateral triangle.");
            else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3)
                System.out.println("That's an isoceles triangle.");
            else if (angle1 != angle2 && angle2 != angle3 && angle3 != angle1)
                System.out.println("That's a scalene triangle.");
        }
        
        else
        {
            System.out.println("Error");
        }
        
    }

}
