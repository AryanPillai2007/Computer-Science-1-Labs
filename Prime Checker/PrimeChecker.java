//Name:
import java.util.*;
public class PrimeChecker
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter 1 to check if a number is prime or 2 to exit >>> ");
        int i=console.nextInt();
       
        while (i==1)
        {
            System.out.print("Please enter an integer to check ");
            int n=console.nextInt();  
            boolean isPrime=true;
            for(int y=2;y<n;y++)
             {
                int d=n%y;
                if(d==0)
                {
                   
                    isPrime=false;
                }
             }
            if(isPrime==true)
                {
                    System.out.println(n+" is a prime number");
                }
            else
            {
                System.out.println(n+" is NOT a prime number");
            }
            System.out.print("Enter 1 to check if a number is prime or 2 to exit >>> ");
            i=console.nextInt();
        }
      System.out.print("Goodbye ");
    }
}
