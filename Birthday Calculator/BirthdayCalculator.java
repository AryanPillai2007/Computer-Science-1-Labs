//Name: Aryan P.
import java.util.*;
public class BirthdayCalculator
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("What Month Is It Now? >>> ");
        int cMonth = console.nextInt();
        System.out.print("What Day Is It Now? >>> ");
        int cDay = console.nextInt();
        System.out.print("What Month Is Your Birthday >>> ");
        int bMonth = console.nextInt();
        System.out.print("What Day Is Your Birthday? >>> ");
        int bDay = console.nextInt();
        calculateBirthday(cDay,cMonth,bDay,bMonth);
    }
    public static void calculateBirthday(int cDay, int cMonth, int bDay, int bMonth)
    {
        int dayCounter = 0;
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (cMonth < bMonth)
        {
                dayCounter = months[cMonth-1] - cDay;
                for (int i = cMonth+1; i < bMonth; i++)
                {
                   dayCounter = dayCounter + months[i];
                }
                dayCounter = dayCounter + bDay;
                System.out.println("Days until your Birthday >>> " + dayCounter);
        }
        else
        {
            dayCounter = months[cMonth-1] - cDay;
            int i;
            for (i = cMonth+1; i < 12; i++)
            {
                dayCounter = dayCounter + months[i];  
               
            }
            for (i = 0; i < bMonth; i++)
            {
                dayCounter = dayCounter + months[i];  
               
            }
                dayCounter = dayCounter + bDay;
                System.out.println("Days until your Birthday >>> " + dayCounter);
        }
               
    }
}  