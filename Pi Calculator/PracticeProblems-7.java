//Name: Aryan Pillai
import java.util.*;
import java.util.Random.*;
import static java.lang.Math.*;
public class PracticeProblems
{
    public static void main(String[] args)
    {
        //Number1
        System.out.println(5 + " is Odd? >>> " + isOdd(5));
        System.out.println(6 + " is Odd? >>> " + isOdd(6));
        //Number2
        System.out.println(15 + " is Single Digit? >>> " + isSingleDigit(15));
        System.out.println(-7 + " is Single Digit? >>> " + isSingleDigit(-7));
        //Number3
        System.out.println("Max between 100 and 200? >>> " + getMax(100, 200));
        System.out.println("Max between -3 and 4? >>> " + getMax(-3, 4));
        //Number5
        System.out.println("Random Roll >>> " + rollDice());
        System.out.println("Random Roll >>> " + rollDice());
        //Number6
        System.out.println("Random Roll (20 Faces) >>> " + rollDice(20));
        System.out.println("Random Roll (1000 Faces) >>> " + rollDice(1000));
        //Number7
        System.out.println("Caps fixing frEd >>> " + capitalizeOnlyFirst("frEd"));
        System.out.println("Caps fixing sALSA >>> " + capitalizeOnlyFirst("sALSA"));
        //Number8
        System.out.println("Area of circle with radius 1.0 >>> " + circleArea(1.0));
        System.out.println("Area of circle with radius 8.5 >>> " + circleArea(8.5));
        //Number9
        System.out.println("35 is a multiple of 5? >>> " + isMultiple(35, 5));
        System.out.println("31 is a multiple of 3? >>> " + isMultiple(31, 3));
        //Number10

        //Number11
        System.out.println("5 is prime? >>> " + isPrime(5));
        System.out.println("33 is prime? >>> " + isPrime(33));
        System.out.println("2 is prime? >>> " + isPrime(2));
        System.out.println("301 is prime? >>> " + isPrime(301));
        System.out.println("307 is prime? >>> " + isPrime(307));
        //Number12
        printDiagonal("pig");
        printDiagonal("salsa");
    }

    public static boolean isOdd(int a)
    {
        if (a % 2 != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isSingleDigit(int a)
    {
        if (Math.abs(a) < 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int getMax(int a, int b)
    {
        if (a > b)
        {
            return a;
        }
        else if (b > a)
        {
            return b;
        }
        else
        {
            return a;
        }
    }

    public static int rollDice()
    {
        Random rand = new Random();
        int upperbound = 6;
        int randInt = rand.nextInt(upperbound) + 1;
        return randInt;
    }

    public static int rollDice(int numFaces)
    {
        Random rand = new Random();
        int upperbound = numFaces;
        int randInt = rand.nextInt(upperbound) + 1;
        return randInt;
    }

    public static String capitalizeOnlyFirst(String name)
    {
        String firstLetter = name.substring(0, 1);
        String restOfWord = name.substring(1);
        firstLetter = firstLetter.toUpperCase();
        restOfWord = restOfWord.toLowerCase();
        return firstLetter + restOfWord;
    }

    public static double circleArea(double radius)
    {
        return (Math.PI * (radius * radius));
    }

    public static boolean isMultiple(int a, int b)
    {
        if (a % b == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isPrime(long num)
    {
        boolean prime = true;
        for (int i = 1; i < num; i++)
        {
            if (i != 1 && i != num)
            {
                if (num % i == 0)
                {
                    prime = false;
                }
            }
        }
        if (prime == true || num == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void printDiagonal(String s)
    {
        System.out.println("Printing diagonally " + s + " >>> ");
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            System.out.println(s.charAt(i));
        }
    }
}

