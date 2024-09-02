package fateczl.gabrielrobles.sort;

/**
 * The MergeSort class provides a method to sort an array of integers using the Merge Sort algorithm.
 */
public class MergeSort {
    /**
     * Sorts an array of integers using the Merge Sort algorithm.
     * 
     * @param array the array of integers to be sorted
     */
    public void sort(int[] array) {
        mergeSort(array);
    }

    private static void mergeSort(int[] array) {
        if (array.length > 1) {
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
    }

    private static void merge(int[] result, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int length = result.length;

        for (int k = 0; k < length; k++) {
            if (j >= right.length || (i < left.length && left[i] < right[j])) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
        }
    }

    private static int[] leftHalf(int[] array) {
        int length = array.length / 2;
        int[] left = new int[length];
        for (int i = 0; i < length; i++) {
            left[i] = array[i];
        }
        return left;
    }

    private static int[] rightHalf(int[] array) {
        int length1 = array.length / 2;
        int length2 = array.length - length1;
        int[] right = new int[length2];
        for (int i = 0; i < length2; i++) {
            right[i] = array[i + length1];
        }
        return right;
    }
}
