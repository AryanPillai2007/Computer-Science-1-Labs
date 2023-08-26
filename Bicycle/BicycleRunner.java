public class BicycleRunner
{
    public static void main(String args[])
    {
        Bicycle bike = new Bicycle("blue"); // make a new Bicycle object

        bike.setSpeed(10);
        System.out.println("Color: " + bike.getColor());
        System.out.println("Speed: " + bike.getSpeed(0));
        System.out.println("Miles traveled: " + bike.travelFarther((double)3/60)); // 3 minutes
        System.out.println("Current Location: " + bike.getLocation());

        System.out.println("Speed: " + bike.getSpeed(5));
        System.out.println("Miles traveled: " + bike.travelFarther((double)3/60)); // 3 minutes
        System.out.println("Current Location: " + bike.getLocation());
    }
}