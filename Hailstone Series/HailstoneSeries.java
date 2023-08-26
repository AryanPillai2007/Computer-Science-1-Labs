//Name: Aryan
import java.util.*;
    public class HailstoneSeries
    {
        public static void main(String[] args)
        {
            Scanner console = new Scanner(System.in);
            System.out.print("Enter an integer from 1 to 1000 >>> ");
            int num=console.nextInt();
            console.nextLine();
            int count=0;
            while(num!=1)
            {
                    if( num%2!=0)  
                        {
                             System.out.println(num*3+1);
                             num=num*3+1;
                             count=count+1;
                          }
                   
         
                    else
                     {
                             System.out.println(num/2);
                             num=num/2;
                             count=count+1;
                            }
                    }  
                    System.out.print("Series took "+count+" steps to reach a value of 1");
                }
            }
