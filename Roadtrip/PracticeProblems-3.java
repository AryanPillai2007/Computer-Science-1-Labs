//Name: 

import java.util.*;

	public class PracticeProblems
	{
		public static void main(String[] args)
		{
		Scanner console = new Scanner(System.in);
		//1
		System.out.println("Enter a whole number >>> ");
		int num1 = console.nextInt();
                console.nextLine();
		System.out.println("Ten more than that is " + (num1 + 10));
		//2
		System.out.println("What is your name? >>> ");
		String name = console.nextLine();
		System.out.println("Hello, " + name + "!");
		//3
		System.out.print("Enter a number with a decimal >>> ");
                double something = console.nextDouble();
                console.nextLine();
                System.out.println("That number squared is " + something * something);
                //5
                System.out.println("Type a name >>> ");
                String name2 = console.nextLine();
                System.out.println("Type an age >>> ");
		int age = console.nextInt();
		console.nextLine();
		System.out.println(name2 + " is " + age + " years old.");
		//6
		System.out.print("Enter the radius of a circle (decimals are allowed) >>> ");
                double radius = console.nextDouble();
                console.nextLine();
                System.out.println("The area of that circle is " + radius * radius * 3.1415926535);
        	//7
        	System.out.print("Enter the number of seconds of free fall >>> ");
        	double gravityconstant = 32.174;
                double time = console.nextDouble();
                console.nextLine();
                System.out.println("The area of that circle is " + time*time*gravityconstant*1/2);
                //8
                System.out.println("Who is your favorite person? >>> ");
		String name1 = console.nextLine();
		System.out.println(name1+name1+name1);

            }
	}

