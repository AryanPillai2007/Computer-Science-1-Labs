//Name: 
import java.util.*;
public class PracticeProblems
{
    public static void main(String[] args)
    {
        //Number1
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a double >>> ");
        double x = console.nextDouble();
        double exp1 = Math.pow(x, 6.0);
        System.out.print("Enter a double >>> ");
        double y = console.nextDouble();
        double exp2 = Math.pow(y, 6.0);
        double pi = Math.PI;
        int result = (int)((exp1 - exp2) * pi);
        System.out.println("The answer is about " + result);
        //Number2
        System.out.print("Enter a radius >>> ");
        double radius = console.nextDouble();
        double radiusCubed = Math.pow(radius, 3.0);
        double result2 = (double)((4.0/3 * pi) * radiusCubed);
        System.out.println("The answer is " + result2);
        //Number3
        System.out.print("Enter Z >>> ");
        double z = console.nextDouble();
        double zToTheFourth = Math.pow(z, 4.0);
        double result3 = Math.abs(zToTheFourth - 1);
        System.out.println("The answer is " + result3);
        //Number4
        System.out.print("Enter a double >>> ");
        x = console.nextDouble();
        double yeet = Math.abs(1 + x);
        double result4 = Math.log10(yeet);
        System.out.println("The answer is " + result4);
        //Number5
        x = console.nextDouble();
        yeet = Math.pow(x, 2.0);
        double eSquared = Math.pow(Math.E , x);
        int result5 = (int)(yeet * eSquared);
        System.out.println("The answer is " + result5);
        //Number 6
        System.out.print("Enter a double >>> ");
        x = console.nextDouble();
        System.out.print("Enter a double >>> ");
        y = console.nextDouble();
        double number = Math.pow(x , 2.0);
        double otherNumber = Math.pow(y , 2.0);
        double subtraction = (number - otherNumber);
        double result6 = Math.sqrt(subtraction);
        System.out.println("The answer is " + result6);
        //Number7
        System.out.print("Enter an integer >>> ");
        double bearing = console.nextInt();
        double runwayBearing = bearing/10;
        int runwayNumber = (int)Math.ceil(runwayBearing);
        System.out.println("The runway is number " + runwayNumber);
        //Number8
        System.out.print("Enter 3 integers >>> ");
        int i = console.nextInt();
        System.out.print(" ");
        int j = console.nextInt();
        System.out.print(" ");
        int k = console.nextInt();
        int smallestNumber = Math.min(i , j);
        int actualSmallestNumber = Math.min(k, smallestNumber);
        System.out.print("The answer is " + actualSmallestNumber);
    }
}