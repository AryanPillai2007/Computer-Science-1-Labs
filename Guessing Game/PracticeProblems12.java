import java.util.*;

public class PracticeProblems12
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer >>> ");
        int n = console.nextInt();
        console.nextLine();
        int add = 0;
        while(add < n)
        {
            add ++;
            System.out.print(add + " ");
        }
        System.out.println("");
        System.out.print("Enter an integer up to 1000 >>> ");
        n = console.nextInt();
        console.nextLine();
        while (n < 1 || n > 1000)
        {
            System.out.print("Enter an integer up to 1000 >>> ");
            n = console.nextInt();
            console.nextLine();
        }
        int divider = 0;
        int multiply = 0;
        while(divider < n)
        {
            divider++;
            multiply += divider;
            if(divider == n)
            {
                System.out.print(multiply);
            }
        }
        System.out.println("");
        System.out.print("Enter an integer up to 1000 >>> ");
        n = console.nextInt();
        console.nextLine();
        while (n < 1 || n > 1000)
        {
            System.out.print("Enter an integer up to 1000 >>> ");
            n = console.nextInt();
            console.nextLine();
        }
        int divided = 0;
        int multiple = 0;
        while(divided < n)
        {
            divided++;
            if (divided % 2 == 0)
            {
                multiple += divided;
            }
            if(divided == n)
            {
                System.out.print(multiple);
            }
        }
        System.out.println("");
        //Number 4: the answer is "normal" because you only have 5 fingers on one hand
        System.out.print("Enter an integer up to 1000 >>> ");
        n = console.nextInt();
        console.nextLine();
        while (n < 1 || n > 1000)
        {
            System.out.print("Enter an integer up to 1000 >>> ");
            n = console.nextInt();
            console.nextLine();
        }
        int divide = 0;
        int multiples = 0;
        while(divide < n)
        {
            divide++;
            if (divide % 7 == 0)
            {
                multiples += divide;
            }
            if(divide == n)
            {
                System.out.print(multiples);
            }
        }
    }
}