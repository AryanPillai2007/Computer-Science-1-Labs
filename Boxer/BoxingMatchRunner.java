import java.util.*;
import static java.lang.System.*;
public class BoxingMatchRunner
{
    public static void main(String[] args)
    {
        Boxer b1 = new Boxer("Fred", 100);
        Boxer b2 = new Boxer("George", 110);
        out.println(b1);
        out.println(b2);
        out.println("FIGHT! \n");
        while (b1.getHealth()>0 && b2.getHealth()>0)
        {
            Random randomGen = new Random();

            if (randomGen.nextBoolean() == true)
            {
                b1.punch(b2);
                if (randomGen.nextBoolean() == true)
                {
                    b2.punch(b1);
                }
                out.println(b1 + " ::: " + b2 + "\n");
            }
            if (b1.getHealth() > 0)
                out.println("The winner by knockout is... " + b1.getName() + "!");
            else
                out.println("The winner by knockout is... " + b2.getName() + "!");
        }
        out.println("Match Statistics:");
        out.println("Punches Thrown\t" + " Fred: " + b1.punchCount() + "     " + "George: " + b2.punchCount());
        out.println ("Damage Caused\t" + "  Fred: " + b1.damageTotal() + "   "+ " George: " + b2.damageTotal());
        out.println ("Average Punch Damage\t" + "  Fred: " + b1.getAveragePunchDamage() + "   "+ " George: " + b2.getAveragePunchDamage());
     
    }
}