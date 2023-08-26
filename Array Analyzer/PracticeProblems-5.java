//Name: Aryan P.

import java.util.*;

public class PracticeProblems
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int[] nums = {2, 4, 0, 8, 6, 2, 3, 5, 9, 0, 9, 6};
        //Number1
        int arrayLength = nums.length;
        System.out.println("Last element is " + nums[arrayLength - 1]);
        //Number2
        System.out.println("Number of elements is " + arrayLength);
        //Number3
        for (int i = 0; i < arrayLength; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println("");
        //Number4
        int total = 0;
        for (int i = 0; i < arrayLength; i++)
        {
            total = total + nums[i];
        }
        System.out.println("Sum of all numbers is " + total);
        //Number5
        for (int i = 0; i < arrayLength; i++)
        {
            if (nums[i] % 2 != 0)
            {
                System.out.println("Contains an odd");
                break;
            }
        }
        //Number6
        int doesItAppear = 0;
        for (int i = 0; i < arrayLength; i++)
        {
            if (nums[i] == 0)
            {
                System.out.println("Found a zero");
                doesItAppear++;
                break;
            }
        }
        if (doesItAppear == 0)
        {
            System.out.println("Array doesn't contain a zero");
        }
        //Number8
        doesItAppear = 0;
        for (int i = 0; i < arrayLength; i++)
        {
            if (nums[i] == 6)
            {
                doesItAppear++;
            }
        }
        if (doesItAppear >= 2)
        {
            System.out.println("Plenty of 6s");

        }
        else
        {
            System.out.println("Array contains less than 2 sixes");
        }
        //Number9
        for (int i = 0; i < arrayLength - 2; i++)
        {
            if (nums[i] == 2 && nums[i+1] == 3)
            {
                System.out.println("Found 2-3 combo");
                doesItAppear++;
                break;
            }
        }
        if (doesItAppear == 0)
        {
            System.out.println("No 2-3 combo");
        }
        //Number10
        doesItAppear = 0;
        for (int i = 0; i < arrayLength - 2; i++)
        {
            if (nums[i] == nums[i+1] && nums[i] == nums[i+2])
            {
                System.out.println("Three in a row!");
                doesItAppear++;
                break;
            }
        }
        if (doesItAppear == 0)
        {
            System.out.println("No three in a row");
        }
    }
}