import java.util.*;
public class Person
{
    int happiness;
    String name;

    Person()
    {

    }

    public void setHappiness(int h)
    {
        happiness = h;
    }

    public void setName(String n)
    {
        name = n;
    }

    public int getHappiness()
    {
        return happiness;
    }

    public String getName()
    {
        return name;
    }

    public void gainHappy(int happyGained)
    {
        happiness += happyGained;
    }

    public void actOfKindness(Person other)
    {
        Random randomGen = new Random();
        int kindMessage = randomGen.nextInt(3) + 1;
        int happinessGained = randomGen.nextInt(21) + 10;
        if(kindMessage == 1)
        {
            System.out.println(getName() + " hugs " + other.getName() + " (+" + happinessGained + " happiness)");
            other.gainHappy(happinessGained);
        }
        else if(kindMessage == 2)
        {
            System.out.println(getName() + " help " + other.getName() + " with homework." + " (+" + happinessGained + " happiness)");
            other.gainHappy(happinessGained);
        }
        else if(kindMessage == 3)
        {
            System.out.println(getName() + " complements " + other.getName() + "'s shoes" + " (+" + happinessGained + " happiness)");
            other.gainHappy(happinessGained);
        }
    }

    public String toString()
    {
        return (name + " (" + happiness + ")");
    }
}
