import java.util.Arrays;

public class InsertionSort {
public static void main (String[] args) {
int [] A = { 30, 10, 20, 50, 75, 49, 1, 28, 5, 4 };

insertionSort(A);
System.out.print(Arrays.toString(A));
System.out.println();
System.out.println("My code has ran!");
System.out.println("No way???");
}

static void insertionSort(int [] A) {
	for (int i = 1; i < A.length; i++) {
		int j = i;
		while (j > 0 && A[j-1] > A[j]) {
			int temp = A[j];
			A[j] = A[j-1];
			A[j-1] = temp;
			j = j-1;
		}
	}
}
}
