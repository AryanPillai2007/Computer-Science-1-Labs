//Name: 

	public class BigMacWalk
	{
		public static void main(String[] args)
		{
		int numBigMacs = 4;
		double bigmacCalories = 590;
		double burntCals = 94;
		
		System.out.print("Big Macs eaten >>> ");
		System.out.print(numBigMacs);
		System.out.println("");
		System.out.print("Total calories consumed >>> ");
		System.out.print(numBigMacs * bigmacCalories);
		System.out.println("");
		System.out.print("Miles to walk off all those Big Macs >>> ");
		System.out.print(numBigMacs * bigmacCalories / burntCals);
		
		System.out.println("");
		System.out.println("");
		
		double friesAndDrinkCals = bigmacCalories += 400;
		System.out.print("Big Macs meals eaten >>> ");
		System.out.print(numBigMacs);
		System.out.println("");
		System.out.print("Total calories consumed >>> ");
		System.out.print(numBigMacs * bigmacCalories);
		System.out.println("");
		System.out.print("Miles to walk off all those Big Macs >>> ");
		System.out.print(numBigMacs * bigmacCalories / burntCals);
		
		}
	}
