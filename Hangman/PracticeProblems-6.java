//Name: Aryan P.
import java.util.*;
public class PracticeProblems
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String[] s = {"Hello", "Goodbye", "Computer", "Science", "Um", "Do", "What", "Now"};
        //Number1
        System.out.println("There are " + s.length + " strings in array S");
        //Number2
        for (int i = 0; i < s.length; i++)
        {
            System.out.print(s[i].substring(0,1) + " ");
        }
        System.out.println("");
        //Number3
        int total = 0;
        for (int i = 0; i < s.length; i++)
        {
            int length = s[i].length();
            char lastLetter = s[i].charAt(length - 1);
            if (lastLetter == 'e')
            {
                total ++;
            }
        }
        System.out.println(total + " words end in an E");
        //Number4
        total = 0;
        for (int i = 0; i < s.length; i++)
        {
            int length = s[i].length();
            total += length;
        }
        System.out.println("There are " + total + " characters in the array");
        //Number5
        total = 0;
        for (int i = 0; i < s.length; i++)
        {
            int length = s[i].length();
            if (length >= 7)
            {
                total++;
            }
        }
        if (total >= 2)
        {
            System.out.println("There are some long words!");
        }
        else
        {
            System.out.println("Mostly short words");
        }
        //Number6
        //Number7
        total = 0;
        for (int i = 0; i < s.length; i++)
        {
            int length = s[i].length();
            for (int j = 0; j < length; j++)
            {
                    if (s[i].charAt(j) == 'e')
                {
                    total ++;
                }
            }
        }
        System.out.println("There are " + total + " Es in the array");
        //Number8
        total = 0;
        for (int i = 0; i < s.length; i++)
        {
            int length = s[i].length();
            for (int j = 0; j < length; j++)
            {
                    if (s[i].charAt(j) == 'e')
                {
                    total ++;
                    break;
                }
            }
        }
        System.out.println("There are " + total + " strings that contain an E");
    }
}
