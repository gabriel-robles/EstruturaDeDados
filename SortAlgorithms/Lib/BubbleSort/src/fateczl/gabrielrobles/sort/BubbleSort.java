package fateczl.gabrielrobles.sort;

/**
 * The BubbleSort class provides a method to sort an array of integers using the Bubble Sort algorithm.
 */
public class BubbleSort {
    /**
     * Sorts an array of integers using the Bubble Sort algorithm.
     * 
     * @param array the array of integers to be sorted
     */
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    swap(array, j-1, j);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
