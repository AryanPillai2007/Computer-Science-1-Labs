//Name:
import java.util.*;
public class PracticeProblems {

    public static void main(String[] args) {

        //IsLetterA
        char letter = 'a';
        boolean value = isLetterA(letter);
        System.out.println("'" + letter + "'" + " is the character 'a'? >>> " + value);

        letter = '7';
        value = isLetterA(letter);
        System.out.println("'" + letter + "'" + " is the character 'a'? >>> " + value);

        letter = 'F';

        value = isLetterA(letter);
        System.out.println("'" + letter + "'" + " is the character 'a'? >>> " + value);

        System.out.println("\n");

        //hasMultipleAs
        String word = "Apple";
        value = hasMultipleAs(word);
        System.out.println("\"" + word + "\"" +  " has at least 2 'a's? >>> " +  value);

        word = "Some teachers eat apples.";
        value = hasMultipleAs(word);
        System.out.println("\"" + word + "\"" +  " has at least 2 'a's? >>> " +  value);

        System.out.println("\n");
        //isVowel
        letter = 'u';
        value = isVowel(letter);
        System.out.println("'" + letter + "'" + " is a vowel? >>> " + value);

        letter = 'b';
        value = isVowel(letter);
        System.out.println("'" + letter + "'" + " is a vowel? >>> " + value);

        letter = 'I';
        value = isVowel(letter);
        System.out.println("'" + letter + "'" + " is a vowel? >>> " + value);

        System.out.println("\n");
        //numvowels
        word = "salsa";
        int intValue = numVowels(word);
        System.out.println("Vowel count in " + "\"" + word + "\"" + " >>> " +  intValue);

        word = "The best teachers eat salsa.";
        intValue = numVowels(word);
        System.out.println("Vowel count in " + "\"" + word + "\"" + " >>> " +  intValue);

        System.out.println("\n");

        //evenchars
        word = "salsa";
        letter = 'a';
        char letter2 = 's';
        value = evenChars(word,letter,letter2);
        System.out.println("The word " + "\"" + word + "\"" + " has the same number of" + "'" + letter + "'" + " and " +  "'" + letter2 + "'? >>> " + value);

        letter2 = 'f';
        value = evenChars(word,letter,letter2);
        System.out.println("The word " + "\"" + word + "\"" + " has the same number of" + "'" + letter + "'" + " and " +  "'" + letter2 + "'? >>> " + value);

        System.out.println("\n");

        word = "programmer";
        letter = 'm';
        value = hasRepeat(word,letter);
        System.out.println("The word " + "\"" + word + "\"" + " has a repeated '" + letter + "'? >>> " + value);

        //hasRepeat
        word = "programmer";
        letter = 'r';
        value = hasRepeat(word,letter);
        System.out.println("The word " + "\"" + word + "\"" + " has a repeated '" + letter + "'? >>> " + value);

        System.out.println("\n");

        letter = 'm';
        String caps = capChar(letter);
        System.out.println("Capitalizing '" + letter + "' gives you >>> " + caps);

        letter = 'W';
        caps = capChar(letter);
        System.out.println("Capitalizing '" + letter + "' gives you >>> " + caps);
        System.out.println("\n");

        word = "salsa";
        caps = capVowels(word);
        System.out.println("Capitalizing vowels in \"" + word + "\" gives you >>> " + caps);

        word = "SCRUMPTIOUS";
        caps = capVowels(word);
        System.out.println("Capitalizing vowels in \"" + word + "\" gives you >>> " + caps);

    }
    //1
    public static boolean isLetterA(char letter) {

        boolean value = false;
        if (letter == 'a') {
            value = true;
        }
        return value;

    }
    //2
    public static boolean hasMultipleAs(String s) {
        int numOfAs = 0;
        boolean value = false;
        for (int i = 0; i < s.length(); i++) {
            boolean isA = isLetterA(s.charAt(i));
            if (isA == true) {
                numOfAs += 1;
            }
        }
        if (numOfAs >= 2) {
            value = true;
        }

        return value;
    }
    //3
    public static boolean isVowel(char letter) {
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
        letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            return true;
        } else {
            return false;
        }
    }
    //4

    public static int numVowels(String s) {
        int numOfVs = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean isVowel = isVowel(s.charAt(i));
            if (isVowel == true) {
                numOfVs += 1;
            }
        }
        return numOfVs;
    }
    //5
    public static boolean evenChars(String s, char a, char b) {
        int numOfAs = 0;
        int numOfBs = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                numOfAs = numOfAs + 1;
            } else if (s.charAt(i) == b) {
                numOfBs = numOfBs + 1;
            }
        }
        if (numOfAs == numOfBs) {
            return true;
        } else {
            return false;
        }
    }
    //6 riddle skip
    //7
    public static boolean hasRepeat(String s, char a) {
        int numOfAs = 0;
        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == a && s.charAt(i + 1) == a) {
                numOfAs = numOfAs + 1;
            }
        }
        if (numOfAs >= 1) {
            return true;
        } else {
            return false;
        }
    }
    //8
    public static String capChar(char a) {

        String b = a + "";
        b = b.toUpperCase();
        return b;
    }

    //9
    public static String capVowels(String s) {

        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String upperCase = "";
            if (isVowel(c)) {
                upperCase = capChar(c);
                newString = newString + upperCase;
            } else {
                String lower = s.charAt(i) + "";
                newString = newString + lower.toLowerCase();;

            }

        }
        return newString;
    }
}
