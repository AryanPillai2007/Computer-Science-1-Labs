//Name:

import java.util.*;

public class BottlesOnTheWall
{
public static void main(String[] args)
{
Scanner console = new Scanner(System.in);
System.out.print("Enter your age (whole number only) >>> ");
int yourAge=console.nextInt();
if(yourAge>21)
{
   System.out.print("Do you prefer beer or Coke (enter 1 for beer, 2 for Coke >>> ");
   int beerOrCoke=console.nextInt();
   int count=99;
                if(yourAge>21 && beerOrCoke==1)
   {
       System.out.println(count+" bottles of beer on the wall");
                    System.out.println(count+" bottles of beer");
                    System.out.println("Take one down, pass it around, "+(count-1)+" bottles of beer on the wall!");
                while(count>1)
                {
                    count=count-1;
                    System.out.println(count+" bottles of beer on the wall");
                    System.out.println(count+" bottles of beer");
                    System.out.println("Take one down, pass it around, "+(count)+" bottles of beer on the wall!");
                   

                                        }
                            }
                                if(beerOrCoke==2)
   {
       System.out.println(count+" bottles of Coke on the wall");
                    System.out.println(count+" bottles of Coke");
                    System.out.println("Take one down, pass it around, "+(count-1)+" bottles of Coke on the wall!");
                while(count>1)
                {
                    count=count-1;
                    System.out.println(count+" bottles of Coke on the wall");
                    System.out.println(count+" bottles of Coke");
                    System.out.println("Take one down, pass it around, "+(count)+" bottles of Coke on the wall!");
                   

                                        }  
                           }
                       }
else
{
   int count=99;
   System.out.println(count+" bottles of Coke on the wall");
   
                    System.out.println(count+" bottles of Coke");
                    System.out.println("Take one down, pass it around, "+(count-1)+" bottles of Coke on the wall!");
                while(count>1)
                {
                    count=count-1;
                    System.out.println(count+" bottles of Coke on the wall");
                    System.out.println(count+" bottles of Coke");
                    System.out.println("Take one down, pass it around, "+(count)+" bottles of Coke on the wall!");
                   

                                        }  
   
                  }
               }
            }
