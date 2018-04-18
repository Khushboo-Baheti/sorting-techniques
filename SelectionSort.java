
public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {4, 5, 8, 2, 2, 2, 10};
        SelectionSort.sort(a);
        show(a);
    }


    /**
     * Sorts the given array
     *
     * @param a array to be sorted
     */
    public static void sort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;                       // Initialize element in ith position as minimum
            for (int j = i + 1; j < N; j++) {  // Initialize next element right to i as j
                if (a[j] < a[min]) {           // Compares if j is less than min
                    min = j;                   // resets min
                }
            }

            swap(a, i, min);                   // swap the minimum with i
        }
    }

    /**
     * Swaps elements in a[i] with a[j]
     * If both i and j are equal returns
     * @param a array
     * @param i index of array
     * @param j index of array
     */
    private static void swap(int[] a, int i, int j) {
        if (i == j) {
            return;
        }

        int t = a[i];
        a[i] = a[j];                  // swaps element in a[i] with element in a[j]
        a[j] = t;

    }

    /**
     * Prints the array
     *
     * @param a array
     */
    private static void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }

}