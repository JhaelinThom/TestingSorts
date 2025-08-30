import java.util.Arrays;  // use Arrays, not Array

public class BubbleSort {
public static void main(String[] args) {

	int myList  [] = {2, 90, 100, 300, 9, 32, 10, 200, 1, 20, 5};
	bubbleSort(myList);
	System.out.println(Arrays.toString(myList));
}



//Psuedocode of BubbleSort... 

//Compare two adjacent elements. 
//Swap the values if first element is greater than the other. 
//Move onto the next index. 
//Repeat part one. 
//Continue looping entire array until finished. 

public static void bubbleSort(int[] myList) {
	for (int i = 0; i < myList.length - 1; i++) {
		boolean swapped = false;

		for (int j = 0; j < myList.length - i - 1 ; j++) {

			if (myList[j] > myList[j+1]) {

				int temp = myList[j];
				myList[j] = myList[j+1];
				myList[j+1] = temp;
				swapped = true;
			}
		
		}
		if (!swapped) break;
	}
}
}
