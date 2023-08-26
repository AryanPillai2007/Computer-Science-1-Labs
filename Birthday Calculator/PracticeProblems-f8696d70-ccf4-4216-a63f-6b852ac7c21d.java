//Aryan P.
import java.util.*;
public class PracticeProblems
{
    public static void main(String[]args)
    {
       
       
    }
    //1
    public static void letterGrade(double num)
    {
        if(num<=105 && num>=90)
        {
            System.out.println("Grade of "+num+" is a A");
        }
        if(num<90 && num>80)
        {
            System.out.println("Grade of "+num+" is a B");
        }      
        if(num<80 && num>70)
        {
            System.out.println("Grade of "+num+" is a C");
        }
        if(num<70)
        {
            System.out.println("Grade of "+num+" is a F");
        }
    }
    public static void squareBoard(int num2)
    {
        System.out.println("Printing a size "+num2+" square");
        for(int i=0; i<num2;i++)
        {
            for(int j=0; j<num2;j++)
            {
                System.out.print("# ");
               
            }
            System.out.print("\n");
        }
    }
    //2
    public static void checkeredBoard(int num2)
    {
        System.out.println("Printing a size "+num2+" checkerboard");
        for(int i=0; i<num2;i++)
        {
            for(int j=0; j<num2;j++)
            {
                System.out.print("# ");
               
        }
        if(i%2==0)
                {
                    System.out.print("\n"+" ");
                }
        else
        {
        System.out.print("\n");
        }
        }
    }
    //3
    public static void powers(int pow2)
    {
        System.out.println("Here are the first "+pow2+" powers of 2:");
        for(int f=0;f <pow2;f++)
        {
            System.out.println("2^"+f+" = "+Math.pow(2,f));
        }
    }
    //4
    public static void quadraticFormula(double a, double b, double c)
    {
        double root1 = (-b + Math.sqrt((b*b) - (4 * a * c)))/(2 * a);
        double root2= (-b - Math.sqrt((b*b) - (4 * a * c)))/(2 * a);
        System.out.println("Roots using "+a+", "+b+", "+c+": ["+root1+", "+root2+"]");
    }
    //5
    public static void temperatureConverter(double d, char ForC)
    {
        if(ForC=='c')
        {
           
            double e=(1.8*d)+32;
            System.out.println("Converting "+d+" C  to F: "+e);
        }
        if(ForC=='f')
        {
            double h=5/9;
            double f=((d-32)*.5556);
            System.out.println("Converting "+d+" to F: "+f);
        }
    }
    //6
    public static void simpleSearch(int[] nums, int num)
    {
        int theNumber = 0;
        while (theNumber < 1)
        {
            for (int i = 0; i < nums.length; i++)
            {
                if (nums[i] == num)
                {
                    theNumber = i;
                    break;
                }
            }
        }
        System.out.println("My array is  "+Arrays.toString(nums));
        System.out.println("Searching for "+num+". Location: "+theNumber);
    }
    //7
    public static void reversedNumber(int num1)
    {
        int reverse=0;
        System.out.print("print "+num1+" in reverse: ");
        while(num1 != 0)
        {
       
            int digit=num1%10;
            reverse=reverse*10+digit;
            num1/=10;
           
        }
        System.out.print(reverse);
    }
    //8
    public static void arrayInAnotherArray(int [] array1, int[] array2)
    {
       boolean h=true;
        for(int i = 0; i < array1.length; i++)
         {
            for(int j = 0; j < array2.length; j++)
            {
             
                if(array1[i] == array2[j])
                {
             
                    h=true;
                }
                else
                {
                    h=false;
                     
                }
            }
        }
       System.out.println("Is "+Arrays.toString(array1)+" found in "+Arrays.toString(array2)+"? "+h);
    }  
}
