//Name: 

	public class Salary
	{
		public static void main(String[] args)
		{
		double hourlyRate = 23.0;
		double hoursWorked = 30.0;		
		double overtimeHours = 5.0;
		//Salary Part
		double totalSalary = hoursWorked * hourlyRate;
		double overtimeEarnings = hourlyRate * 1.5;
		double beforeTaxes = overtimeEarnings + totalSalary;
		double taxRate = 0.25;
		double netSalary = taxRate * beforeTaxes;
		
		
		//PrintPart
		System.out.println("Hourly rate >>> $" + hourlyRate);
		System.out.println("Regular hours worked >>> " + hoursWorked);
		System.out.println("Overtime hours worked >>> " + overtimeHours);
		System.out.println("");
		System.out.println("Total salary (before taxes) >>> " + beforeTaxes);
		System.out.println("Net salary (after taxes) >>> " + netSalary);

		}
	}
