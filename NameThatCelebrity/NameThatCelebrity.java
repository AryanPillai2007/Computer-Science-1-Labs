//Name: 
import java.util.*;
public class NameThatCelebrity
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //Easy
        System.out.println("Choose a difficulty level (easy, medium, or hard) >>> ");
        String e_m_h = console.nextLine();
        String actor = "Will Smith";
        String actor_hint = actor.substring(1, 8);
        if (e_m_h.equals("easy"))
        {
            System.out.println("Good choice. Here's your clue: ");
            System.out.println(">>> " + actor_hint);
            System.out.println("What's your guess? >>> ");
            String guessing1 = console.nextLine();
            if (guessing1.equals("Will Smith"))
            {
                System.out.println("Correct!! Nice Job.");  
                System.exit(0);
            }
            for (int guessing = 2; guessing <= 3; guessing++)
            {
                System.out.println("Incorrect, sorry!"); 
                System.out.println("What's your guess? >>> ");
                guessing1 = console.nextLine();
                if (guessing == 3)
                {
                    System.out.println("Hint: In the movie Men in Black. "); 
                    System.out.println("What's your guess? >>> ");
                    guessing1 = console.nextLine();
                    if (guessing1.equals("Will Smith"))
                    {
                        System.out.println("Correct!! Nice Job.");  
                        System.exit(0);
                    }
                    if (guessing1 != actor)
                    {
                        System.out.println("You lose! The answer was " + actor);
                    }
                }
            }
        }
        //Medium
        if (e_m_h.equals("medium"))
        {
            actor_hint = actor.substring(1, 7);
            System.out.println("Good choice. Here's your clue: ");
            System.out.println(">>> " + actor_hint);
            System.out.println("What's your guess? >>> ");
            String guessing1 = console.nextLine();
            if (guessing1.equals("Will Smith"))
            {
                System.out.println("Correct!! Nice Job.");  
                System.exit(0);
            }
            for (int guessing = 2; guessing <= 3; guessing++)
            {
                System.out.println("Incorrect, sorry!"); 
                System.out.println("What's your guess? >>> ");
                guessing1 = console.nextLine();
                if (guessing == 3)
                {
                    System.out.println("Hint: In the movie Men in Black. "); 
                    System.out.println("What's your guess? >>> ");
                    guessing1 = console.nextLine();
                    if (guessing1.equals("Will Smith"))
                    {
                        System.out.println("Correct!! Nice Job.");  
                        System.exit(0);
                    }
                    if (guessing1 != actor)
                    {
                        System.out.println("You lose! The answer was " + actor);
                    }
                }
            }
        }
        //Hard
        if (e_m_h.equals("hard"))
        {
            actor_hint = actor.substring(1, 5);
            System.out.println("Good choice. Here's your clue: ");
            System.out.println(">>> " + actor_hint);
            System.out.println("What's your guess? >>> ");
            String guessing1 = console.nextLine();
            if (guessing1.equals("Will Smith"))
            {
                System.out.println("Correct!! Nice Job.");  
                System.exit(0);
            }
            for (int guessing = 2; guessing <= 3; guessing++)
            {
                System.out.println("Incorrect, sorry!"); 
                System.out.println("What's your guess? >>> ");
                guessing1 = console.nextLine();
                if (guessing == 3)
                {
                    System.out.println("Hint: In the movie Men in Black. "); 
                    System.out.println("What's your guess? >>> ");
                    guessing1 = console.nextLine();
                    if (guessing1.equals("Will Smith"))
                    {
                        System.out.println("Correct!! Nice Job.");  
                        System.exit(0);
                    }
                    if (guessing1 != actor)
                    {
                        System.out.println("You lose! The answer was " + actor);
                    }
                }
            }
        }
    }
}
