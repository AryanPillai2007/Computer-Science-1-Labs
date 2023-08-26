import java.util.*;
public class InventoryRunner
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        Inventory garage = new Inventory();
        System.out.println("Current inventory: \n" + garage);
        System.out.println("(1) Add item to inventory. \n(2) Remove sold item from inventory. \n(3) Get net worth of inventory. \n(4) Quit.");
        int x = 0;
        do
        {
            System.out.print("What would you like to do? >>> ");
            int operation = console.nextInt();
            switch (operation)
            {
                case 1:
                    System.out.println("Where to store new item? >>> ");
                    int storeItemAt = console.nextInt();
                    if (garage.getItem(storeItemAt) == true)
                    {
                        System.out.print("New item name/description >>> ");
                        String name = console.next();
                        System.out.print("New item cost >>> ");
                        int cost = console.nextInt();
                        System.out.print("New item date of listing >>> ");
                        String date = console.next();
                        Item newItem = new Item(name, cost, date);
                        System.out.println(newItem.toString());
                        garage.setNewItem(newItem, storeItemAt);
                    }
                    else
                    {
                        System.out.println("Operation not available: Inventory is full" + "\n");
                    }
                    break;
                case 2:
                    System.out.print("Which item to be removed? >>> ");
                    int itemNumber = console.nextInt();
                    garage.setNewItem(null, itemNumber);
                    System.out.println("Item sold!" + "\n");
                    break;
                case 3:
                    System.out.println("Inventory net worth is $" + garage.netWorth() + "\n");
                    break;
                case 4:
                    x++;
                    break;
                default:
                    System.out.println("Error: Could not process operation");
                    break;
            }
            System.out.println("Current inventory: \n" + garage);
        }while(x < 1);
    }
}