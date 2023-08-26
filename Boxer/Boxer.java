import java.util.*;
import static java.lang.System.*;
public class Boxer
{
    //Variables
    private String name;
    private int health;
    public int pcount;
    public int damage;
    public double avgDam;

    //Constructor
    public Boxer(String n, int h)
    {
        name = n;
        health = h;

    }

    //Mutators 
    public void punch(Boxer other)
    {
        Random randomGen = new Random();
        int amount = randomGen.nextInt(10)+1;
        if (amount < 4) //hook
        {
            out.println(name + " nails " + other.name + " with a left hook.");
            out.println(" Power: " + amount);
        }
        else if (amount < 8) //jab
        {
            out.println(name + " smacks " + other.name + " with a right jab.");
            out.println(" Power: " + amount);

        }else //uppercut
        {
            out.println(name + " destroys " + other.name + " with an uppercut.");
            out.println(" Power: " + amount);
        }
        other.health -= amount;
        pcount += 1;
        damage += amount;
        
    }

    //Accessors
    public String toString()
    {
        return name + "(Health: " + health + ")";
    }

    public int getHealth()
    {
        return health; 
    }

    public String getName()
    {
        return name; 
    }

    public int punchCount()
    {
        return pcount;
    }

    public int damageTotal()
    {
        return damage;
    }

    public double getAveragePunchDamage()
    {
           avgDam = Math.round(damage /= pcount * 0.1) * 0.1;
           return avgDam;
    }
}
