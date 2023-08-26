//Name: 
import java.util.*;
public class Pendulum
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        double time;
        double length;
        double g = 9.8;
        System.out.println("Enter pendulum length in meters (or 0 to quit) >>> ");
        length = console.nextDouble();
        if (length == 0)
        {
            System.out.println("Goodbye.");
            return;
        }
        if (length >= 0)
        {
            time = 2 * Math.PI * Math.sqrt(length) / Math.sqrt(g);
            double round10 = Math.round(time*10.0)/(10.0);
            System.out.println("For a length of " + length + " m," + " the pendulum's period is " + round10 + " seconds.");
                
        }
    }
}
