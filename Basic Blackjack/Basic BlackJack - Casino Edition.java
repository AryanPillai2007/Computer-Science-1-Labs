import java.util.*;
public class onmacathome
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello all. I would like to enforce 2 rules. 1. Numbers in brackets; [], means you should type the number into the input box. Rule No. 2: Have fun, I guess. If you lose ur bad.");
        System.out.println("🆆🅴🅻🅲🅾🅼🅴 to Aryan's casino! Let's Play Blackjack! If you lose you owe me a million dollars. ");
        int play = 1;
        Random randomGen = new Random();
        while (play == 1)
        {

            int cardValue = randomGen.nextInt(10) + 2;
            int card2Value = randomGen.nextInt(10) + 2;
            int newCard = 0;
            int newCard2 = 0;
            System.out.println("You are dealt a " + cardValue);
            System.out.println("You are dealt a " + card2Value);
            System.out.println("The dealer is dealt 2 cards as well, but you can't see them, haha.");
            System.out.println("Your hand total >>> " + (cardValue + card2Value));
            System.out.println("Would you like to [1] - Hit or [2] - Stand?");
            int move = input.nextInt();
            int dealer1 = randomGen.nextInt(10) + 2;
            int dealer2 = randomGen.nextInt(10) + 2;
            int dealer = dealer1 + dealer2;
            int dealerNew = 0;
            while (move == 1)
            {
                newCard = randomGen.nextInt(10) + 2;
                newCard2 = newCard2 + newCard;
                System.out.println("You are dealt a " + newCard);
                System.out.println("Your new hand total >>> " + (newCard2 + cardValue + card2Value));
                if (newCard2 + cardValue + card2Value > 21)
                {
                    move = 2;
                    System.out.println("Player busted. Dealer wins. Ur bad.");
                    System.out.println("Play again? [1] - Yes or [2] - No ------ dont rage quit and you owe me a million dollars.");
                    play = input.nextInt();
                }
                if  (dealer <= 14)
                {
                    System.out.println("Dealer shows " + dealer);
                    dealerNew = randomGen.nextInt(10) + 2;
                    dealer += dealerNew;
                    System.out.println("Dealer draws an " + dealerNew);
                    System.out.println("New dealer total: " + dealer);
                }

                System.out.println("Enter [1] to hit, or enter [2] to pass your move.");
                move = input.nextInt();
            }

            while (dealer <= 14)
                dealer = dealer + randomGen.nextInt(10) + 2;
            if (dealer > 21)
            {
                System.out.println("Results:");
                System.out.println("Your hand total: " + (newCard2 + cardValue + card2Value));
                System.out.println("Dealer hand total " + dealer);
                System.out.println("Dealer Bust! You win! Would you like to play again? (press [1] for yes, enter [2] for no) --- congrats i guess.");
                play = input.nextInt();
            }
            else if (21 - (dealer) < (21 - (newCard2 + cardValue + card2Value)))
            {
                System.out.println("Results:");
                System.out.println("Your hand total: " + (newCard2 + cardValue + card2Value));
                System.out.println("Dealer hand total " + dealer);
                System.out.println("Dealer wins! Would you like to play again? (press [1] for yes, enter [2] for no) --- ur garbage at dis game git gud.");
                play = input.nextInt();
            }
            else if (dealer == newCard2 + cardValue + card2Value)
            {
                System.out.println("Results:");
                System.out.println("Your hand total: " + (newCard2 + cardValue + card2Value));
                System.out.println("Dealer hand total " + dealer);
                System.out.println("Tie! Would you like to play again? (press [1] for yes, enter [2] for no) --- you tied and also ur pretty bad at dis game git gud lamo");
                play = input.nextInt();
            }
            else
            {
                System.out.println("Results:");
                System.out.println("Your hand total: " + (newCard2 + cardValue + card2Value));
                System.out.println("Dealer hand total " + dealer);
                System.out.println("Player wins! would you like to play again? (press [1] for yes, enter [2] for no) --- ggs gamer ur good.");
                play = input.nextInt();
            }
        }
    }
}

