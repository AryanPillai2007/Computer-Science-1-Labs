//Name: 

import java.util.*;

public class NutsAndBolts
{
    public static void main(String[] args)
    {
        double costb = 5;
        double costn = 3;
        double costw = 1;
        Scanner console = new Scanner(System.in);
        System.out.println("Number of bolts >>> ");
        int bolts = console.nextInt();
        System.out.println("Number of nuts >>> ");
        int nuts = console.nextInt();
        System.out.println("Number of washers >>>");
        int washers = console.nextInt();
        if(nuts >= bolts && washers*2 >= bolts)
        {
            System.out.println("Order OK!");
            System.out.println("Total cost (in cents) >>>" + (bolts*costb+nuts*costn+washers*costw));
        }
        else
        {
            System.out.println("Warning! Check order: too few nuts");
            System.out.println("Warning! Check order: too few washers");
            System.out.println("Total cost (in cents) >>> " + (bolts*costb+nuts*costn+washers*costw));
        }
    }
}
