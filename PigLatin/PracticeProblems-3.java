//Name: Aryan Pillai
import java.util.*;
public class PracticeProblems
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //Number1
        System.out.print("Enter a word >>> ");
        String str = console.nextLine();
        String firstLetter = (str.substring(0,1).toUpperCase());
        System.out.println(firstLetter + (str.substring(1)));
        //Number2
        System.out.print("Enter a word >>> ");
        str = console.nextLine();
        int lastTwoLetters = (str.length() - 2);
        str = (str.toLowerCase());
        System.out.println((str.substring(0, lastTwoLetters) + str.substring(lastTwoLetters).toUpperCase()));
        //Number3
        System.out.print("Enter a word >>> ");
        str = console.nextLine();
        char e = 'e';
        int amount = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == e)
            {
                amount ++;
            }
        }
        System.out.println("E appeared " + amount + " times");
        //Number4
        System.out.print("Enter a word >>> ");
        str = console.nextLine();
        amount = 0;
        char h = 'h';
        char I = 'i';
        for (int i = 0; i < str.length() - 1; i++)
        {
            if(str.charAt(i) == h)
            {
                if(str.charAt(i+1) == I)
                {
                    amount++;
                }
            }
        }
        System.out.println("Hi appeared " + amount + " times");
        //Number5
        amount = 0;
        System.out.print("Enter a string >>> ");
        str = console.nextLine();
        System.out.print("Enter a target string >>> ");
        String targetString = console.nextLine();
        int located = str.indexOf(targetString);
        if(located >= 1)
        {
            System.out.print("Found it!");
        }
        //Number6
        System.out.println("");
        System.out.print("Enter a string >>> ");
        str = console.nextLine();
        System.out.print("Enter amount of last letters repeated >>> ");
        int lastLetters = console.nextInt();
        console.nextLine();
        int length = str.length();
        str = str.substring(length - lastLetters, length);
        while(lastLetters > 0)
        {
            System.out.print(str);
            lastLetters--;
        }
        System.out.println("");
        //Number8
        System.out.println("Type your first and last name >>> ");
        String name = console.nextLine();
        int len = name.length();
        int num = name.indexOf(" ");
        String number7 = name.substring(num, len);
        String firstname = name.substring(0, num);
        System.out.println(firstname + number7.toUpperCase());
        //Number9
        System.out.println("Enter an email address >>> ");
        String domain = console.nextLine();
        len = domain.length();
        int at = domain.indexOf("@");
        String number8 = domain.substring(at+1, len);
        System.out.println(number8);
        //Number10
        System.out.print("Enter a string with asterisks >>> ");
        String word = console.nextLine();
        String withoutAsterisks = word.replace("*","");
        System.out.println(withoutAsterisks);
    }
}