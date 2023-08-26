//Name:
import java.util.*;
import java.util.Random.*;
public class WordScrambler
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a word/sentence/paragraph >>> ");
        String word = console.nextLine();
        Scrambler(word);
    }

    public static void Scrambler(String word)
    {
        String[] wordScramble = new String[word.length()];
        for (int i = 0;i < word.length(); i++)
        {
            if (word.charAt(i) == ' ')
            {
                wordScramble = word.split(" ");
                break;
            }
            else
            {
                for (int j = 0; j < word.length(); j++)
                {
                    wordScramble[j] = Character.toString(word.charAt(j));
                }
            }
        }
        if (wordScramble[0].length() == 1)
        {
            for (int i = 1; i < word.length() - 1; i++)
            {
                String moveLetter = wordScramble[i];
                wordScramble[1 + (int)(Math.random() * ((word.length() - 1) - 1))] = moveLetter;
            }
            System.out.print(Arrays.toString(wordScramble));
        }
        else
        {
            for (int i = 0; i < wordScramble.length; i++)
            {
                for (int w = 0; w < wordScramble[i].length() - 1; w++)
                {
                    if (wordScramble[i].length() > 3)
                    {
                        for (int x = 1; x < wordScramble[i].length() - 1; x++)
                        {
                            String letter = wordScramble[i];
                            char[] changeWord = new char[letter.length()];
                            for (int y = 1; y < wordScramble[i].length() - 1; y++)
                            {
                                changeWord = letter.toCharArray();
                                char moveLetter = changeWord[1 + (int)(Math.random() * ((changeWord.length - 1) - 1))];
                                changeWord[y] = moveLetter;
                            }
                            letter = String.valueOf(changeWord);
                            wordScramble[i]= letter;
                        }
                    }
                }
            }
            System.out.print(Arrays.toString(wordScramble));
        }
    }
}
