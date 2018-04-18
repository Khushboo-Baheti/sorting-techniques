
public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {8, 4, 9, 9, 9, 3, 1, 6};
        InsertionSort.sort(a);
        show(a);
    }

    /**
     * sorts the given array of elements
     * @param a array to be sorted
     */
    public static void sort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {          // Compares a[j] and a[j-1]
                    swap(a, j, j - 1);       // Swaps j and j-1
                } else {
                    break;
                }

            }
        }
    }

    /**
     * Swaps elements in a[i] with a[j]
     *
     * @param a array
     * @param i index of the array
     * @param j index of the array
     */
    private static void swap(int[] a, int i, int j) {
        if (i == j) {
            return;
        }

        int t = a[i];
        a[i] = a[j];           // Swaps element in a[i] with elements in a[j]
        a[j] = t;

    }

    /**
     * prints the array
     *
     * @param a array
     */
    private static void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}