//Name:
import java.util.*;

public class PracticeProblems
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //1
        System.out.print("Enter a value for num1 >>> ");
        double num1 = console.nextDouble();
        console.nextLine();
        System.out.print("Enter a value for num2 >>> ");
        double num2 = console.nextDouble();
        console.nextLine();
        //2
        boolean numsAreSame = num1==num2;
        //3
        System.out.print("num1 and num2 are the same? >>> ");
        System.out.println(numsAreSame);
        System.out.println("");
        //4
        System.out.print("Enter total bill amount >>> $");
        double totalBill = console.nextDouble();
        console.nextLine();
        double nub = (totalBill*.10);
        double nub1 = (totalBill*.15);
        if (totalBill>1000 && totalBill<2000)
        {
            System.out.println("10% discount >>> $"+ totalBill*.10);
            System.out.println("New total after discount (if applicable) >>> $"+ (totalBill-nub));
        }
        else if(totalBill>2000)
        {
            System.out.println("15% discount >>> $"+ totalBill*.15);
            System.out.println("New total after discount (if applicable) >>> $"+ (totalBill-nub1));
        }
        //5
        double nub2 =((totalBill-nub1));
        System.out.print("Customer has a coupon? (Enter true or false) >>> ");
        boolean hasCoupon = console.nextBoolean();
        double nub45 = (totalBill-nub);
        double oneting = ((nub2*0.05));
        if (hasCoupon == true && totalBill>1000 && totalBill<2000)
        {
            System.out.println("Coupon discount >>> $"+ nub2*0.05);
            System.out.println("New total after discount (if applicable) >>> $"+ (totalBill-nub));
            System.out.println("New total after coupon (if applicable) >>> $"+(nub2-nub2*0.05));
        }
        else if(hasCoupon == true && totalBill>2000)
        {
            System.out.println("Coupon discount >>> $"+ nub2*0.05);
            System.out.println("New total after coupon (if applicable) >>> $"+(nub2-oneting));
        }
    }

}
