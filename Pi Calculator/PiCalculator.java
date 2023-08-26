//Name: Aryan P. 
import java.util.*;
public class PiCalculator
{
    public static void main(String[]args)
    {
        System.out.println("Series of 10 >>> " + approximatePi(10));
        System.out.println("Series of 1000 >>> " + approximatePi(1000));
    }
   
    public static double approximatePi(int precision)
    {
        double pi = 1.0;
        double denom = 3.0;
        for (double i = 1; i < precision; i++)
        {
           if (i % 2 != 0)
           {
               pi = pi - (1/denom);
           }
           else
           {
               pi = pi + (1/denom);
           }
           denom = denom + 2;
        }
        return 4 * pi;
        }
    }
