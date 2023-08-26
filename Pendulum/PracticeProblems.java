//Name: 
import java.util.*;
public class PracticeProblems
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //1
        System.out.println("Enter a double >>> ");
        double a = console.nextDouble();
        System.out.println("Enter a double >>> ");
        double b = console.nextDouble();
        double letter_result = Math.max(a, b);
        System.out.print("The bigger one number is ");
        System.out.print(letter_result);
        System.out.println("");
        System.out.println("");
        //2
        System.out.println("Enter a double to cube >>> ");
        double cube = console.nextDouble();
        double cube_result = Math.pow(cube, 3.0);
        System.out.print("The cube of " + cube + " is ");
        System.out.print(cube_result);
        System.out.println("");
        System.out.println("");
        //3
        System.out.println("Enter a base >>> ");
        double base = console.nextDouble();
        System.out.println("Enter a exponent >>> ");
        double exp = console.nextDouble();
        double baseexp = Math.pow(base, exp);
        System.out.print(base + "^" + exp + " = " + baseexp);
        System.out.println("");    
        System.out.println("");
        //4
        System.out.println("Enter a double to round >>> ");
        double round_input = console.nextDouble();
        double round_result = Math.round(round_input);
        System.out.println("If you round " + round_input + " you get " + round_result);
        System.out.println("");    
        System.out.println("");
        //5
        System.out.println("Enter a double to root >>> ");
        double square = console.nextDouble();
        double square_result = Math.sqrt(square);
        System.out.println("The square root of " + square + " is " + square_result);
        System.out.println("");    
        System.out.println("");
        //6
        System.out.println("Enter sideA of a triangle >>> ");
        double sideA = console.nextDouble();
        System.out.println("Enter sideB of a triangle >>> ");
        double sideB = console.nextDouble();
        double side_resultA = Math.pow(sideA, 2);
        double side_resultB = Math.pow(sideB, 2);
        double hypo = side_resultA + side_resultB;
        double fore = Math.sqrt(hypo);
        double endresult = Math.round(fore);
        System.out.println("The hypotenuse is " + endresult);
        System.out.println("");    
        System.out.println("");
        //8
        System.out.println("Enter cylinder radius >>> ");
        double cylinderRadius = console.nextDouble();
        System.out.println("Enter cylinder height >>> ");
        double cylinderHeight = console.nextDouble();
        double calculations = 2 * cylinderHeight * cylinderRadius * Math.PI + 2 * Math.PI * Math.pow(cylinderRadius, 2);
        System.out.println("Surface area is " + calculations);
        System.out.println("");    
        System.out.println("");
        //9
        System.out.println("Enter sphere diameter >>> ");
        double sphereDiameter = console.nextDouble();
        double spherecal = 0.166667 * Math.PI * Math.pow(sphereDiameter, 3);
        System.out.println("Volume is " + spherecal);
        System.out.println("");    
        System.out.println("");
        
        
        
    }
}

