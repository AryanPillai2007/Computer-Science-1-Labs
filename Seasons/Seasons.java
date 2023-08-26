
import java.util.*;

public class Seasons
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter month >>> ");
        int month = console.nextInt();
        System.out.print("Enter day >>> ");
        int day = console.nextInt();
        if ((month == 12 && day >= 16 && day <= 31) || (month == 1 && day >=1 && day <= 31) || (month == 2 && day >= 1 && day <= 28) || (month == 3 && day >=1 && day <=15))
        {
            System.out.println("Winter");
        }
        if ((month == 3 && day >= 16 && day <= 31) || (month == 4 && day >=1 && day <= 30) || (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >=1 && day <=15))
        {
            System.out.println("Spring");
        }
        if ((month == 6 && day >= 16 && day <= 30) || (month == 7 && day >=1 && day <= 31) || (month == 8 && day >= 1 && day <= 31) || (month == 9 && day >=1 && day <=15))
        {
            System.out.println("Summer");
        }
        if((month == 9 && day >= 16 && day <= 30) || (month == 10 && day >=1 && day <= 31) || (month == 11 && day >= 1 && day <= 30) || (month == 12 && day >=1 && day <=15))
        {
            System.out.println("Fall"); 
        }
    }
}
