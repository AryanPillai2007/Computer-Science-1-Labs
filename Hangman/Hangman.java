//Name: Aryan P.
import java.util.*;
public class Hangman
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a secret word >>> ");
        String word = console.nextLine();
        char[] secretWord = word.toCharArray();
        System.out.println("\u000c");
        char[] guess = new char[word.length()];
        int guessNumber = 10;
        boolean breakLoop = false;
        int total = 0;
        for (int i = 0; i < guess.length; i++)
        {
            guess[i] = '_';
        }
        while (guessNumber > 0 && breakLoop == false)
        {
            System.out.print("Enter a character >>> ");
            String letter = console.next();
            for (int i = 0; i < word.length(); i++)
            {
                if (letter.charAt(0) == secretWord[i])
                {
                    guess[i] = letter.charAt(0);
                }
            }
            for (int i = 0; i < word.length(); i++)
            {
                System.out.print(guess[i]);
            }
            System.out.println("");
            for (int i = 0; i < word.length(); i++)
            {
                if (guess[i] == secretWord[i])
                {
                    total ++;
                }
                else
                {
                    total = 0;
                    break;
                }
                if (total == word.length())
                {
                    breakLoop = true;
                }
            }
        }
    }
}