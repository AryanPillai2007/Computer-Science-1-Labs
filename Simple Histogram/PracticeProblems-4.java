//Name: Aryan Pillai
import java.util.*;
public class PracticeProblems
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int[] nums = {2, 4, 0, 8, 6, 2, 3, 5, 9, 0, 9, 6};
        //1
        int num1 = nums[0];
        System.out.println(num1);
        //2
        int num2 = nums[1];
        System.out.println(num2);
        //3 - Riddle
        //4
        if(nums[4] == 6)
        {
            System.out.println("true"); 
        } else {
            System.out.println("false"); 
        }
        //5
        int correct = 0;
        System.out.println("Guess what's in the 6th spot >>> ");
        int guess = console.nextInt();
        while (correct != 1)
        {
            if(nums[5] == guess)
            {
                correct++;
                System.out.println("Correct! ");
            } 
            else 
            {
                guess = console.nextInt();
            }
        }
        //6
        nums[3] = 50;
        System.out.println(nums[3]);
        //7
        nums[7] = nums[7] * 2;
        System.out.println(nums[7]);
        //8
        System.out.println(nums[2] = nums[0] + 10);
        //9
        System.out.println(Arrays.toString(nums));
        //10
        double[] otherNums = new double[4];
        System.out.println(Arrays.toString(otherNums));
        //11
        otherNums[0] = 1.2;
        otherNums[1] = 3.4;
        otherNums[2] = 5.6;
        otherNums[3] = 7.8;
        System.out.println(Arrays.toString(otherNums));

    }
}

