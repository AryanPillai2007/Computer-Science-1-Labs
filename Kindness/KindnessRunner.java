import java.util.*;
public class KindnessRunner
{
    public static void main(String[] args)
    {
        Random randomGen = new Random();
        Person[] people = new Person[4];
       
        for(int i = 0; i < people.length; i++)
        {
        people[i] = new Person();
        }
       
       
        people[0].setName("Fred");
        people[0].setHappiness(0);
        people[1].setName("George");
        people[1].setHappiness(0);
        people[2].setName("Bill");
        people[2].setHappiness(0);
        people[3].setName("Mary");
        people[3].setHappiness(30);
        int randKind;
        int randKindRec;
        System.out.println("Starting point");
        System.out.println("[" + people[0].toString() + ", " + people[1].toString() + ", "  + people[2].toString() + ", " + people[3].toString() + "]");
        int day = 1;
        int counter1 = 0;
        int counter2 = 0;
        while(people[0].getHappiness() < 50 || people[1].getHappiness() < 50 || people[2].getHappiness() < 50)
        {
            System.out.println("Day " + day);
           
            for(int i = 0; i < people.length; i++)
            {
               randKindRec = randomGen.nextInt(4);
               while(counter1 == 0)
               {
                   randKindRec = randomGen.nextInt(4);
                   if(people[randKindRec] != people[i])
                   {
                       counter1 = 1;
                   }
               }
               people[i].actOfKindness(people[randKindRec]);
            }
            System.out.println("[" + people[0].toString() + ", " + people[1].toString() + ", "  + people[2].toString() + ", " + people[3].toString() + "]");
            day += 1;
        }
    }
   
}
