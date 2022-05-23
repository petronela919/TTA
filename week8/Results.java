package week8;

public class Results {
	
	//	Printing the results for each exam, and the total mark
	public static void printResults(double physics, double chemistry, double biology) {
		System.out.println("Physics mark = " + physics);
		System.out.println("Chemistry mark = " + chemistry);
		System.out.println("Biology mark = " + biology);
		System.out.println("Your total score = " + (physics + chemistry + biology));
		
	}
	
	//	Calculating and returning the percentage value
	public static double returnPercentage(double total) {
		return (total * 100) / 450;
	}

	public static void main(String[] args) {
		double physics, chemistry, biology, total, percentage;
		
		// initialise test marks
		physics = 50;
		biology = 60;
		chemistry = 70;
		
		//	printing the results
		printResults(physics, biology, chemistry);
		
		total = physics + biology + chemistry;
		percentage = returnPercentage(total); //	printing the percentage
		
		//	Checking if the student has passed
		if (percentage < 60)
			System.out.println(percentage + "%    -    Fail");
		else
			System.out.println(percentage + "%    -    Pass");
		
	}

}
