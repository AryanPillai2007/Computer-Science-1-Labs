public class Item
{
    private String description, dateListed;
    private double cost;
    public Item(String d, double c, String date)
    {
        description = d;
        cost = c;
        dateListed = date;
    }
   
    public double getCost()
    {
        return cost;
    }
   
    public String toString()
    {
        return description + ", $" + cost + "\t" + "Listed: " + "(" +dateListed + ")";
    }
}