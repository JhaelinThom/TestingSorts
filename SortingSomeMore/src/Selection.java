import java.util.Arrays;

public class Selection {
public static void main(String[]args) {
	
	int [] list = { 10, 17, 9, 24, 8, 12, 304, 1 };
	//Creating a selection sort! 
	
	//Start at the current index of the array
	//Scan the array for the minimum
	//Swap the minimum with the current index. 
	//RINSE AND REPEATO! 
	 
	selectionSort(list);
	
	//Optional choice if I don't want to use for each. 
//System.out.println(Arrays.toString(list));
	for (int num : list) {
		System.out.print(num + " " );
	}
}


public static void selectionSort(int[] list) {
	for(int i = 0; i < list.length - 1; i++) {
		int min = i;
		for(int j = i + 1; j < list.length; j++) {
			if(list[min] > list[j]) {
				min = j;
			}
		}
		int temp = list[i];
		list[i] = list[min]; 
		list[min] = temp;
	}
}
}