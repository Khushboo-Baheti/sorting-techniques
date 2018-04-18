
public class MergeSort {

    public static void main(String[] args) {

        int[] a = {2, 4, 5, 8, 2, 2, 2, 10};
        MergeSort.sort(a);
        show(a);
    }

    public static void sort(int[] a) {
        int[] aux = new int[a.length];           // creates the new auxiliary array
        sort(a, aux, 0, a.length - 1);
    }

    /**
     * merge the sorted elements in two halves
     *
     * @param a   array to be sorted
     * @param aux auxiliary array with copy of array a
     * @param lo  first part the array to be sorted
     * @param mid mid point of array
     * @param hi  last part of array to be sorted
     */
    private static void merge(int[] a, int aux[], int lo, int mid, int hi) {

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];               // Copy elements from array to auxiliary array
        }

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {                // when i pointer is exhausted , increment j
                a[k] = aux[j++];
            } else if (j > hi) {          // j pointer is exhausted  , increment i and k
                a[k] = aux[i++];
            } else if (aux[j] < aux[i]) { // aux[j] less than aux[i] ,increment j and k
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    /**
     * Sort and merge the element in each half
     *
     * @param a   array to be sorted
     * @param aux auxiliary array with copy of array a
     * @param lo  first part of array to be sorted
     * @param hi  last part of the array to be sorted
     */
    private static void sort(int[] a, int[] aux, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int mid = lo + (hi - lo) / 2;          // compute the mid point
        sort(a, aux, lo, mid);                 // sort the first half of array
        sort(a, aux, mid + 1, hi);         // sort the second half of the array
        merge(a, aux, lo, mid, hi);            // merge the sorted array

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
