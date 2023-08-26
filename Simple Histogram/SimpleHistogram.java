//Name: Aryan P.
import java.util.Random;
import java.util.Scanner;
public class SimpleHistogram {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        Random randomGen = new Random();

        System.out.println("How many single digit numbers should I generate? >> ");
        int amountOfSingleDigits = console.nextInt();
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int[] array = new int[10];

        for (int i=0; i!=amountOfSingleDigits; i++)
        {
            System.out.print("Simulation"+(i+1)+":");
            int simulation = randomGen.nextInt(10);
            System.out.println(simulation);

            if (simulation == 0){
                zero++;
                array[0] = zero;

            }
            if (simulation == 1){
                one++;
                array[1] = one;
            }
            if (simulation == 2){
                two++;
                array[2] = two;
            }
            if (simulation == 3){
                three++;
                array[3] = three;
            }
            if (simulation == 4){
                four++;
                array[4] = four;
            }
            if (simulation == 5){
                five++;
                array[5] = five;
            }
            if (simulation == 6){
                six++;
                array[6] = six;
            }
            if (simulation == 7){
                seven++;
                array[7] = seven;
            }
            if (simulation == 8){
                eight++;
                array[8] = eight;
            }
            if (simulation == 9){
                nine++;
                array[9] = nine;
            }

        }
        System.out.println("** Here's the final count **");
        for (int i = 0; i <array.length ; i++) {
            System.out.println(i+"s found: "+ array[i]);
        }
    }
}
