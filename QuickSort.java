
public class QuickSort {

	public void sort(int array[]) {
		sortInternal(array, 0, array.length - 1);
	}

	private void sortInternal(int array[], int low, int high) {	 // low is Starting index, high is Ending index
		if (low < high) {
			int partitionIndex = partition(array, low, high); 		// partitionIndex is the partition index
			sortInternal(array, low, partitionIndex - 1);						// recursively sort array index before and after the division
			sortInternal(array, partitionIndex + 1, high);
		}
	}

	/* Takes last element as pivot and places it at correct position in sorted array,
	 * and places all smaller than pivot to left of pivot and all greater elements to right of pivot */
	private int partition(int array[], int low, int high) {
		int pivot = array[high]; 			// element to be placed at right position 
		int i = (low-1); 				// index of smaller element( initially 0-1 = -1) 
		for (int j = low; j < high; j++) {
			// If current element is smaller than or equal to pivot
			if (array[j] <= pivot) {
				i++;						// increment index of smaller element 
				swap_elements(array,i,j);		// swap them
			}
		}

		swap_elements(array, i+1, high);   // place pivot at correct position by swapping

		return i+1;
	}

	// Method to swap the array elements
	private void swap_elements(int array[], int a, int b) {      
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	// Print array items
	static void printArray(int array[])
	{
		int n = array.length;
		for (int i = 0; i < n; ++i)
			System.out.print(array[i]+" ");
		System.out.println();
	}


	public static void main(String args[])
	{
		int array[] = {10, 7, 8, 9, 1, 5};
		QuickSort qs = new QuickSort();
		qs.sort(array); // Sorting array elements using quick sort  

		System.out.println("Sorted array after quick sort");
		printArray(array);
	}
}

