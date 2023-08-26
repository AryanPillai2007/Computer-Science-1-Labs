//Name: 

import java.util.*;

public class PracticeProblems
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter left tire pressure (as whole num) >>> ");
        int leftPressure = console.nextInt();
        System.out.println("Enter right tire pressure (as whole num) >>> ");
        int rightPressure = console.nextInt();
        if (leftPressure < 36 || rightPressure < 36)
        {
            System.out.println("Warning! Low tire pressure.");
        }

        System.out.println("Enter new left tire pressure (as whole num) >>> ");
        int leftPressure1 = console.nextInt();
        System.out.println("Enter new right tire pressure (as whole num) >>> ");
        int rightPressure1 = console.nextInt();
        if (leftPressure1 > rightPressure+4)
        {
            System.out.println("Warning! Uneven tire pressure.");
            if (rightPressure > leftPressure+4)
            {
                System.out.println("Warning! Uneven tire pressure.");
            }
        }
        System.out.println("Enter your grade >>> ");
        double grade = console.nextDouble();
        if (grade <= 100 && grade >= 90)
        {
            System.out.println("Letter grade for " + grade + " >>> A.");
        } else if (grade < 90 && grade >= 80)
        {
            System.out.println("Letter grade for " + grade + " >>> B.");
        }
        else if (grade < 80 && grade >= 70)
        {
            System.out.println("Letter grade for " + grade + " >>> C.");
        }
        else if (grade < 70 && grade >= 60)
        {
            System.out.println("Grades Lower than 70 is an F.");
        }
        else if (grade <= 69)
        {
            System.out.println("Grades Lower than 70 is an F.");
        }
        System.out.println();
        System.out.print("Enter a whole number to round >>> ");
        int number1 = console.nextInt();
        console.nextLine();
        int remainder1=number1%10;
        if(remainder1 < 5)
        {
            System.out.println("Rounded to nearest 10 >>> "+(number1 - remainder1));
        }
        if(remainder1 >= 5)
        {
            System.out.println("Rounded to nearest 10 >>> "+(number1 - remainder1+ 10));
        }
    }
}
