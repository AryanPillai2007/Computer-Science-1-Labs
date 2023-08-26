//Name: Aryan Pillai
import java.util.*;
public class WaffleIrons {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Model 1 -> $10.98");
        System.out.println("Model 2 -> $14.50");
        System.out.println("Model 3 -> $19.98");
        System.out.println("Model 4 -> $24.49");
        System.out.println("Model 5 -> $26.87");
        double total = 0;
        int stop = 0;
        while (stop >= 0)
        {
            System.out.println("Enter Model >>> ");
            int model = console.nextInt();
            System.out.println("Enter Quantity >>> ");
            int quantity = console.nextInt();
            switch (model)
            {
                case 1:
                    total += quantity * 10.98;
                    break;
                case 2:
                    total += quantity * 14.50;
                    break;
                case 3:
                    total += quantity * 19.98;
                    break;
                case 4:
                    total += quantity * 24.49;
                    break;
                case 5:
                    total += quantity * 26.87;
                    break;
                case -1:
                    stop = -1;
                    break;
            }
        }
        total = Math.round(total * 100)/100;
        System.out.println("Total Price >>> $" + total);
    }
}