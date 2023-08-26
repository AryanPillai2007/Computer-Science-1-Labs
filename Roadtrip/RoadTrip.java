//Name: 

import java.util.*;

	public class RoadTrip
	{
		public static void main(String[] args)
		{
			Scanner console = new Scanner(System.in);
			System.out.println("Please enter information for my calculations.");
			System.out.print("Fuel economy (mpg) >>> ");
			double fuelEconomy = console.nextDouble();
			System.out.print("Total miles of trip >>> ");
			double tripMiles = console.nextDouble();
			System.out.print("Anticipated average speed (mph) >>> ");
			double averageSpeed = console.nextDouble();
			System.out.print("Avg. price of gas (per gallon) >>> $");
			double avgPriceOfGas = console.nextDouble();
			
			
			System.out.println("");
			System.out.print("Road trip calculations:");
			System.out.println("");
			System.out.print("Gallons of gas used >>> ");
			System.out.print(tripMiles / fuelEconomy);
			System.out.println("");
			System.out.print("Total cost of gas >>> $");
			System.out.print((tripMiles / fuelEconomy) * avgPriceOfGas);
			System.out.println("");
			System.out.print("Total driving hours >>> ");
			System.out.print(tripMiles / averageSpeed);
		}
	}

