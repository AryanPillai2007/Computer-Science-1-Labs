import java.util.*;
public class TShirtLauncher
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter launch velocity (m/s) >>> ");
        double velocity = console.nextDouble();
        System.out.println("Enter launch angle (degrees) >>> ");
        double angle = console.nextInt();
        System.out.println("Projectile's path");
        double time = 0;
        double yPosition=Math.sin(Math.toRadians(angle))*time*velocity-0.5*9.8*(time*time);
        double xPosition=Math.cos(Math.toRadians(angle))*time*velocity;
        System.out.println("y-pos: "+yPosition+"meters");
        while (yPosition >=0)
        {
            yPosition=Math.sin(Math.toRadians(angle))*time*velocity-0.5*9.8*(time*time);
            xPosition=Math.cos(Math.toRadians(angle))*time*velocity;


            System.out.println("Time:"+time+"seconds");
            System.out.println("x-pos: "+xPosition+"meters");
            if (yPosition  > 0.0) {
                System.out.println("y-pos: " + yPosition + "meters");
            }
            time++;

            if (yPosition <0.0)
            {
                yPosition = 0.0;
                System.out.println("y-pos: " + yPosition + "meters");
                break;
            }

        }

    }
}
