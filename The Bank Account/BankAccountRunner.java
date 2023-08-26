import java.util.*;
public class BankAccountRunner
{
    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name >>> ");
        String n = console.next();
        System.out.print("Enter your balance >>> ");
        double balance = console.nextDouble();
        BankAccount person = new BankAccount(n, balance);
        int x = 0;
        do
        {
            System.out.print("Deposit or withdrawl? (1=D|2=W) >>> ");
            int hehe = console.nextInt();
            if (hehe == 1)
            {
                System.out.print("How much deposit? >>> ");
                double amount = console.nextDouble();
                person.deposit(amount);
            }
            else if (hehe == 2)
            {
                System.out.print("How much withdrawl? >>> ");
                double amount = console.nextDouble();
                person.withdraw(amount);
            }
            else
            {
                System.out.println("Error: Invalid action entered");
            }
            System.out.print("Another action required? (1=Y|2=N) >>> ");
            int goAgain = console.nextInt();
            switch (goAgain)
            {
                case 1:
                    System.out.println("Continuing bank operations");
                    x = 0;
                    break;
                case 2:
                    System.out.println("Stopping bank operations");
                    x++;
                    break;
                default:
                    System.out.println("Invalid action; Automatically stopping bank operations");
                    x++;
            }
        }while (x < 1);
        System.out.print(person.toString());
    }
}
