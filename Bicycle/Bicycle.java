public class Bicycle
{
    private double location, speed;
    private String color;
    public Bicycle(String s)
    {
        location = speed = 0;
        color = s;
    }

    public void setSpeed(double newSpeed)
    {
        speed = newSpeed;
    }

    public void increaseSpeed(double deltaSpeed)
    {
        speed += deltaSpeed;
    }

    public double travelFarther(double hours)
    {
        double oldLocation = location;
        location += (hours * speed);
        return location - oldLocation;
    }

    public String getColor()
    {
        String bikeColor = color;
        return bikeColor;
    }

    public double getSpeed(double x)
    {
        increaseSpeed(x);
        return speed;
    }

    public double getLocation()
    {
        return location;
    }
}

