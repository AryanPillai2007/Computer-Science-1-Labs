//Name:

import java.util.*;

    public class GuessingGame
    {
        public static void main(String[] args)
        {
            Scanner console = new Scanner(System.in);
                        Random randomGen = new Random();
                        int number = randomGen.nextInt(1000) + 1;
                        int count = 7;
                        System.out.println("Let's play a guessing game!");
                        System.out.println("The number to guess will be from 1 to 1000");
                        System.out.println("You have 7 attempts to guess the number correctly.");
                       
                        System.out.println("");
                        while (count>0){
                        System.out.print("Enter your guess (whole number from 1 to 1000) >>> ");
                            int guess = console.nextInt();
                        console.nextLine();
                            if (guess == number)
                            {
                            System.out.println("Correct! The number was >>> ");
                            }
                            else if (guess>number)
                            {
                               
                                System.out.println("");
                                count=count-1;
                                System.out.print("Too high! Guesses remaining >>> "+count);
                                System.out.println("Enter your guess (whole number from 1 to 1000) >>> ");
                               
                            }
                           
                            else if (guess<number)
                            {
                                System.out.println("");
                                count=count-1;
                                System.out.print("Too low! Guesses remaining >>> "+count);
                                System.out.println("");
                               
                            }
                           
                            }
                            System.out.println("");
                            System.out.println("The number was >>> "+number);
                        }
                    }