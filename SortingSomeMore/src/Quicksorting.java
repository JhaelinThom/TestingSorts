
public class Quicksorting {
	public static void main(String args[]) {
		
	
	int [] array = { 20, 10, 50, 2, 1, 8, 100, 45};
	
	quickSort(array, 0, array.length -1);
	
	
for (int i : array) {
	System.out.print(i + " " );
}
	
}
	
	//Quicksort is very similar to merge sort, except it uses a pivot point 
	//While it has subarrays, it will place numbers larger or smaller on respective sides (right or left) 
	//Once the sub arrays are created, we use another sorting algorithm to finish the rest 
	
public static void quickSort(int [] array, int left, int right) {
	if (right <= left) return; //base case
	
	int pivot = right;
	int j = right;
	pivot = array[j];
	left = array[0];
	right = pivot - 1;
	
	int i = 0;
	
	while (pivot <= array[i]) {
		
		
	}
}
}