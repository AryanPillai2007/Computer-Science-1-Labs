
public class Inventory
{
    private Item item1;
    private Item item2;
    private Item item3;

    public Inventory()
    {
        item1 = null;
        item2 = null;
        item3 = null;
    }

    public Inventory(Item a, Item b, Item c)
    {
        item1 = a;
        item2 = b;
        item3 = c;
    }

    public double netWorth()
    {
        double netWorth = 0;
        if (item1 != null)
        {
            netWorth+=item1.getCost();
        }
        if (item2 != null)
        {
            netWorth+=item2.getCost();
        }
        if (item3 != null)
        {
            netWorth+=item3.getCost();
        }
        return netWorth;
    }

    public boolean roomForNewItem()
    {
        if (item1 == null)
        {
            return true;
        }
        else if (item2 == null)
        {
            return true;
        }
        else if (item3 == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void setItemAsSold(int itemNumber)
    {
        switch(itemNumber)
        {
            case 1:
                item1 = null;
                break;
            case 2:
                item2 = null;
                break;
            case 3:
                item3 = null;
                break;
            default:
                System.out.println("Could not sell, no object was found!");
        }
    }

    public void setNewItem(Item newItem, int itemNumber)
    {
        switch(itemNumber)
        {
            case 1:
                item1 = newItem;
                break;
            case 2:
                item2 = newItem;
                break;
            case 3:
                item3 = newItem;
                break;
            default:
                System.out.println("Could not replace, object found in item slot!");
        }
    }

    public boolean getItem(int itemNumber)
    {
        switch(itemNumber)
        {
            case 1:
                if (item1 == null)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            case 2:
                if (item2 == null)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            case 3:
                if (item3 == null)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                return false;
        }
    }

    public String toString()
    {
        String returnIt = "";
        if (item1 != null)
        {
            returnIt += (item1.toString() + "\n");
        }
        else
        {
            returnIt += ("NO ITEM" + "\n");
        }
        if (item2 != null)
        {
            returnIt += (item2.toString() + "\n");
        }
        else
        {
            returnIt += ("NO ITEM" + "\n");
        }
        if (item3 != null)
        {
            returnIt += (item3.toString() + "\n");
        }
        else
        {
            returnIt += ("NO ITEM" + "\n");
        }
        return returnIt;
    }
}