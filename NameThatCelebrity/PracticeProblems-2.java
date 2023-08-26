//Name: Aryan Pillai
import java.util.*;
public class PracticeProblems
{
    public static void main(String[] args)
    {
        //1
        Scanner console = new Scanner(System.in);
        System.out.print("Type something, will ya >>> ");
        String p = console.nextLine();
        int word = p.length();
        System.out.println("That string is " + word + " long.");
        System.out.println("");
        //2
        System.out.print("Type something else >>> ");
        String name = console.nextLine();
        name = name.substring(1);
        System.out.println("Removing first character: " + name);
        System.out.println("");
        //3
        System.out.print("Type something else >>> ");
        String num3 = console.nextLine();
        num3 = num3.substring(0, num3.length() - 1);
        System.out.println("Removing last character: " + num3);
        System.out.println("");
        //4
        System.out.print("Type a word >>> ");
        String wordOne = console.nextLine();
        System.out.print("Type another word >>> ");
        String wordTwo = console.nextLine();
        if (wordOne.length() > wordTwo.length())
        {
            System.out.println(wordTwo+wordOne+wordTwo);
        }
        if (wordOne.length() < wordTwo.length())
        {
            System.out.println(wordOne+wordTwo+wordOne);
        }
        System.out.println("");
        //5
        System.out.print("Type a string to cut in half >>> ");
        String firstHalf = console.nextLine();
        firstHalf = firstHalf.substring(0, firstHalf.length()/2);
        System.out.print("First half: " + firstHalf);
        System.out.println("");
        //6
        System.out.print("Type a word >>> ");
        String a = console.nextLine();
        System.out.print("Type another word >>> ");
        String b = console.nextLine();
        String a_b = a.substring(1) + b.substring(1);
        System.out.print(a_b);
        System.out.println("");
        //7 - Riddle: Coal
        //8
        System.out.println(" ");
        System.out.print("Type something that might start with salsa >>> ");
        String salsa = console.nextLine();
        salsa=salsa.substring(0,5);
        System.out.println("");
        if(salsa.equals("salsa"))
        {
            System.out.println("Yummy!");
        }
        //9
        System.out.println(" ");
        System.out.print("Type something else >>> ");
        String o=console.nextLine();
        String num9 =o.substring(1,o.length()-1);
        System.out.println("Inside part: "+num9);
        System.out.println(" ");
        //10
        System.out.println(" ");
        System.out.print("Type fish please >>> ");
        String q=console.nextLine();
        if(q.equals("salsa")==false)
        {
            System.out.println("Lame!");
        }
        //11
        System.out.println(" ");
        System.out.print("Type a string with an odd number of characters >>> ");
        String r=console.nextLine();
        String t=r.substring(((r.length()-1)/2-1),r.length()-((r.length()-1)/2-1));
        System.out.println("Middle 3: "+t);
    }
}