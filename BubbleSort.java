
public class BubbleSort {

	public void sort(int[] array) {
		int n = array.length;   

		for(int i = 0; i < n; i++) {             // check for each array element
			for(int j = 1; j < (n-i); j++) {		//check for (total array elements) - (last i elements which are at their final positions in sorting list)  
				if(array[j-1] > array[j]) {  
					swap_elements(array, j-1, j );  // if the previous element is greater than j element, it will swap them 
				}  
			}
		}
	}

	// Method to swap the array elements
	private void swap_elements(int array[], int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	// Print array items
	private static void printArray(int array[])
	{
		int n = array.length;
		for (int i = 0; i < n; ++i)
			System.out.print(array[i]+" ");
		System.out.println();
	}

	public static void main(String[] args) {  
		int array[] = {3, 60, 35, 2, 45, 320, 5};  // Initializing array elements

		BubbleSort bs = new BubbleSort();
		bs.sort(array);  // Sorting array elements using bubble sort  

		System.out.println("Array after Bubble Sort");  // Print list after sorting as final result
		printArray(array);
	}  

}
