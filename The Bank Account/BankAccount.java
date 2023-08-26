public class BankAccount
{
    private double balance;
    private String name;
    public BankAccount(String n, double bal)
    {
        name = n;
        balance = bal;
    }
   
    public void deposit(double amt)
    {
        balance += amt;
        System.out.println("New balance >>> " + balance);
    }
   
    public void withdraw(double amt)
    {
        balance -= amt;
        System.out.println("New balance >>> " + balance);
    }
   
    public String toString()
    {
        return name + ": $" + balance;
    }
}
