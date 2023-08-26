//Name: 

import java.util.*;

public class PracticeProblems
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //1
        System.out.println("Enter a whole number >>> ");
        int a = console.nextInt();
        console.nextLine();
        if (a == 9)
        {
            System.out.println("Good number!");
        }
        else
        {
            System.out.println("");
        }
        //2
        System.out.println("Enter a whole number >>> ");
        int b = console.nextInt();
        console.nextLine();
        if (b > 100)
        {
            System.out.println("that's a big number");
        }
        else
        {
            System.out.println("");
        }
        //3
        System.out.println("Enter a whole number >>> ");
        int c = console.nextInt();
        console.nextLine();
        if (c == 0)
        {
            System.out.println("binary!");
        }
        else if (c == 1)
        {
            System.out.println("binary!");
        }
        else
        {
            System.out.println("");
        }
        //4 - Riddle

        //5
        System.out.println("Enter a whole number >>> ");
        int d = console.nextInt();
        console.nextLine();
        if (d != 4)
        {
            System.out.println("that's not a 4");
        }
        else
        {
            System.out.println("");
        }
        //6
        System.out.println("Enter a whole number >>> ");
        int e = console.nextInt();
        console.nextLine();
        if (e > 10)
        {
            System.out.println("big");
        }
        else
        {
            System.out.println("small");
        }
        //7

        System.out.println("Welcome to Aryan's Quest for Salsa! Assign stats to your character (max 15 points TOTAL) ");
        System.out.println("Enter strength >>> ");
        int strength = console.nextInt();
        System.out.println("Enter charm >>> ");
        int charm = console.nextInt();
        System.out.println("Enter magic >>> ");
        int magic = console.nextInt();
        int total = (strength + charm + magic);
        if (total < 16)
        {
            System.out.print("strength = " + strength + ", ");
            System.out.print("charm = " + charm + ", ");
            System.out.print("magic = " + magic + ", ");}
        else
        {
            System.out.println("Point limit exceeded!  Default values assigned.");
            System.out.print("strength = 5" + ", ");
            System.out.print("charm = 5" + ", ");
            System.out.print("magic = 5" + ", ");
        }
    }
}

