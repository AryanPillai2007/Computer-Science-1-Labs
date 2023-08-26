//Name: Aryan P.
import java.util.Scanner;

public class ArrayAnalyzer {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many numbers will you enter? >>> ");
        int amount = console.nextInt();
        System.out.println("Type in numbers with spaces in between >>> ");
        double[] nums = new double[amount];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = console.nextDouble();
        }

        //Largest Number
        double max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Largest Number: " + max);

        //smallest Number
        double min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Smallest Number: " + min);

        //Average Number
        double sum = 0.0;
        double average = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

        }
        average = sum / amount;
       
        System.out.println("Average (rounded to tenth): " + Math.round(average * 10.0) / 10.0);

        //Even number
        int numOfEvens = 0;
        for (int i = 0; i < nums.length; i++) {
            int intNumber = (int) nums[i];
            if (intNumber % 2 == 0) {
                numOfEvens = numOfEvens + 1;
            }
        }

        System.out.println("Number of Evens: " + numOfEvens);

        //Longest repeating number
        double previous = nums[0];
        int repeated = 1;
        int maxRepeat = 0;
        double numberRepeatedMaximum = 0.0;
        for (int i = 0; i < nums.length; i++) {

            if (i > 0) {

                if (nums[i] == previous) {
                    repeated = repeated + 1;
                    if (repeated > maxRepeat) {
                        numberRepeatedMaximum = nums[i];
                        maxRepeat = repeated;
                    }

                } else {
                    repeated = 1;
                }
            }
            previous = nums[i];
        }

        System.out.println("Longest repeat: " + numberRepeatedMaximum + " is repeated " + maxRepeat + " times");

        //Longest Segments increasing number
        previous = nums[0];
        repeated = 1;
        maxRepeat = 0;
        int position = 0;
        for(int i = 0; i < nums.length;i++)

        {

            if (i > 0) {
                if (nums[i] > previous) {
                    repeated = repeated + 1;
                    if (repeated > maxRepeat) {
                        maxRepeat = repeated;
                        position = i;
                    }

                } else {
                    repeated = 1;
                }
            }
            previous = nums[i];
        }

        System.out.print("Longest increasing run:" );
        for (int i =  (position +1) - maxRepeat; i < position  + 1; i++) {
            System.out.print(nums[i] + " ");

        }

        //Longest Segments decreasing number
        previous = nums[0];
        repeated = 1;
        maxRepeat = 0;
        position = 0;
        for(int i = 0; i < nums.length;i++)

        {

            if (i > 0) {
                if (nums[i] < previous) {
                    repeated = repeated + 1;
                    if (repeated > maxRepeat) {
                        maxRepeat = repeated;
                        position = i;
                    }

                } else {
                    repeated = 1;
                }
            }
            previous = nums[i];
        }

        System.out.println(" " );

        System.out.print("Longest decreasing run:" );
        for (int i =  (position +1) - maxRepeat; i < position  + 1; i++) {
            System.out.print(nums[i] + " ");

        }
    }
}