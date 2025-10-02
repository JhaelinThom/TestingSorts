public class InsertionSort {
	//After comparing elements to the left. 
	//Shift elements to the right to make room to insert a value. 
public static void main (String[] args) {
int [] A = { 30, 10, 20, 50, 75, 49, 1, 28, 5, 4 };
insertionSort(A);
//For each loop for easy printing. 
for (int num : A) {
	System.out.print(num + " " );
}
System.out.println();
}


static void insertionSort(int [] array) {
for (int i = 1; i < array.length; i++) {
	int key = array[i];
	int j = i - 1;
	while (j>=0 && array[j] > key) {
		array[j + 1] = array[j];
		j = j -1;
	}
	array[j+1] = key;
}
}
}