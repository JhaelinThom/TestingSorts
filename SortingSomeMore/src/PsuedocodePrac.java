
public class PsuedocodePrac {

	public static void main(String[] args) {

		//Subtract two numbers 
		
//Start
		//Input: Num1 - Num2; 
		//Processing steps: 
		//Difference = Num1 - Num2;
		/* Optional: Conditional Statements, Loops, Etc */
		
		//Output: Difference;
		
		
	//	int i = 5;
	// int k = 3;
		
	//	int difference = i - k;
	//	System.out.println(difference);
		
		int subtractionExample = conditionalExample(8, 4);
System.out.println("Difference: " + subtractionExample);
System.out.println("-----------------------------\n");
int multiplyExample = conditionalExample(10, 10, 100);

System.out.println("Results: " + multiplyExample);
		
	}


//Testing Parameters 
public static int conditionalExample(int t, int k) {
int difference = t - k;
	
	if (difference >= 5) {
		System.out.println("More than half!");
	} else  
			System.out.println("Less than half...");
	return difference;
}
	

public static int conditionalExample(int t, int k, int o) {
	int product  = t * k * o;
	
	if (product == 0) {
		System.out.println("You multiplied by zero... not bad.");
	} else if (product == 1) {
		System.out.println("All ones? I see. ");
	} else if (product == 10) {
		System.out.println("Understandable.");
	} 
	else if (product > 9001) {
		System.out.println("ITS OVER NINE THOUSAND!!!!");
	} 
	else 
		System.out.println("You have fallen into my trap card!");
	{

return t * k * o;
}
}
}