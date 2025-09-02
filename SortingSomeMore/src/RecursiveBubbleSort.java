import java.util.Arrays;

public class RecursiveBubbleSort {
public static void main (String[] args) {
System.out.println(recursivePractice(10));
int [] list = {5,3,4,1,2};
bubbleSort(list);
System.out.println(Arrays.toString(list));
}
static int recursivePractice(int n) {
	 //Recursive Practice
	//This will result in 3,628,800 
	// Remember, start from the base call. 
	//Then work your way up. 
	//Each stack needs the other one! 
	
	/*
	//		   print(3) = 3 * print(2) 
	//	       print(2) = 2 * print(1)
	//EXAMPLE: print(1) = base call. 
	///
	 */
	
if (n == 1) {
	return 1;
}
else {
	return n * recursivePractice(n-1);
}

}

static void bubbleSort (int[] a) {
	
	for (int i = 0; i < a.length -1; i++) {
		boolean swapped = false;

		for (int j = 0; j < a.length - i - 1; j++) {
			if (a[j] > a[j+1]) {
				int temp = a[j+1];
				a[j+1] = a[j];
				a[j] = temp;
				swapped = true;
			}

		}
		if (!swapped) break;

	}
}
}
