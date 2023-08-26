public class Circle
{
    //Instance Variables
    private double radius; 
    public double getDiameter()
    {
        return 2 * radius;
    }

    public double getArea() 
    {
        return Math.PI * (radius * radius);
    }

    public double getCircumference()
    {
        return (2 * Math.PI) * radius;
    }
    //Costructors 
    public Circle(double rad)
    {
        radius = rad;
    }
    //Mutator Methods
    public void setRadius(double r)
    {
        radius = r;
    }
}
