//Name: Aryan
import java.util.Scanner;
public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Type a word (or \"quit\")");
        String word = console.nextLine();
        if (word.equals("quit"))
        {
            System.out.println("Bye!");
        }
        else
        {
            while (!word.equals("quit"))
            {
                int stringlength = word.length();
                int index = -1;
                char ch;
                for (int i = 0; i < stringlength; i++)
                {
                    ch = word.charAt(i);
                    if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u')
                    {
                        index = i;
                        break;
                    }
                }
                ch = word.charAt(0);
                if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u')
                {
                    System.out.println(word.substring(index) + word.substring(0, index) + "hay");
                }
                else
                {
                    System.out.println(word.substring(index) + word.substring(0, index) + "ay");
                }
                System.out.println("Type a word (or \"quit\")");
                word = console.nextLine();
            }
        }
    }
}
