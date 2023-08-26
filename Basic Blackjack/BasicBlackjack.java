import java.util.*;

public class BasicBlackjack
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Player 1, enter hand value >>> ");
        int hand1 = console.nextInt();
        console.nextLine();
        System.out.print("Player 2, enter hand value >>> ");
        int hand2 = console.nextInt();
        console.nextLine();
        if(hand1 < 0 || hand2 < 0)
        {
            System.out.print("You entered bad numbers ");
        }
        else if(hand2 > 21 && hand1 > 21)
        {
            System.out.print("Bust!");

        }
        else if(hand1 > 21)
        {
            System.out.print("Player 2 wins!");

        }
        else if(hand2 > 21)
        {
            System.out.print("Player 1 wins!");

        }

        else if(21 - hand1 < 21 - hand2)
        {
            System.out.print("Player 1 wins!");

        }
        else if(21 - hand2 < 21 - hand1)
        {
            System.out.print("Player 2 wins!");

        }
    }
}

