
public class FactorialPractice {

	public static void main(String[] args) {
		System.out.println("N\tN!");
int factorial = 1; 
for (int i = 1; i <=50; i++) {
	factorial *= i;
	System.out.println(i + "\t" + factorial);
	if (i == 12) {
		System.out.println("Integer overflow starts here!");
	}
	if (i==32) {
		System.out.println("Max is hit and program breaks. Loading only zeros.");
	}
	
}

	}

}
