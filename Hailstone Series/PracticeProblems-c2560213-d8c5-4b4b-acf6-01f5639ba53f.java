//Name: Aryan P.
import java.util.*;
public class PracticeProblems
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter an integer >>> ");
        int count = console.nextInt();
        while(count > 0)
        {
            System.out.print("salsa ");
            count=count-1;
        }
        
        System.out.println("");
        
        System.out.print("Enter a new integer >>> ");
        count = console.nextInt();
        console.nextLine();
        int i = count;
        while (i > 0)
        {

            int j = count;
            while (j > 0)
            {
                System.out.print("Salsa ");
                j = j-1;
            }
            System.out.println("");
            i = i-1;
        }
        
        System.out.println("");
        
        System.out.println("Want to see this message again? (true or false)");
        boolean seeagain = console.nextBoolean();
        while (seeagain == true)

        {
            System.out.println("Want to see this message again? (true or false)");
            boolean seeagain2 = console.nextBoolean();
            if (seeagain2 == false)
            {
                System.out.println("Very well.  I was getting bored with this anyway.");
                break;
            }
        }
        
        System.out.println("");
        
        System.out.println("Enter first integer (or 0 to quit) >>> ");
        int number = console.nextInt();
        int total = 0;
        if (number == 0)
        {
            System.out.println("No integers entered. Stop wasting my time.");
        }
        else
        {
            while (number != 0)
            {
                total += number;
                System.out.println("Enter another integer (or 0 to quit)");
                number = console.nextInt();
                if (number == 0)
                {
                    System.out.print("Sum of integers >>> " + total);
                    break;
                }
            }
        }
        //Riddle: Jo is 8 years old, so he's an annoying child.
        
        System.out.println("");
        
        double quality = 100;
        double discard = 50;
        int month = 0;
        System.out.println("Month 0:   100");
        while (quality >= discard)
        {
            quality *= 0.93;
            month += 1;
            System.out.println("Month " + month + ":    " + "Potency: " + quality);
            if (quality <= discard)
            {
                System.out.print("Time to discard!");
            }
        }
    }
}