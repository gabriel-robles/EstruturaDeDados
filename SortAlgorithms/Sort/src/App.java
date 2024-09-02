import fateczl.gabrielrobles.sort.QuickSort;
import fateczl.gabrielrobles.sort.BubbleSort;
import fateczl.gabrielrobles.sort.MergeSort;
import fateczl.gabrielrobles.sort.PivotType;

public class App {
    public static void main(String[] args) throws Exception {
        var quickSort = new QuickSort();
        var mergeSort = new MergeSort();
        var bubbleSort = new BubbleSort();

        int [] array = generateRandomArray(1500);

        long quickSortMiddleStartTime = System.nanoTime();
        quickSort.sort(array, PivotType.MIDDLE);
        long quickSortMiddleEndTime = System.nanoTime();

        long quickSortFirstStartTime = System.nanoTime();
        quickSort.sort(array, PivotType.FIRST);
        long quickSortFirstEndTime = System.nanoTime();

        long quickSortRandomStartTime = System.nanoTime();
        quickSort.sort(array, PivotType.RANDOM);
        long quickSortRandomEndTime = System.nanoTime();

        long mergeSortStartTime = System.nanoTime();
        mergeSort.sort(array);
        long mergeSortEndTime = System.nanoTime();

        long bubbleSortStartTime = System.nanoTime();
        bubbleSort.sort(array);
        long bubbleSortEndTime = System.nanoTime();

        System.out.println("Quick Sort (Middle Pivot): " + ((float) (quickSortMiddleEndTime - quickSortMiddleStartTime) / 1000000) + " ms");
        System.out.println("Quick Sort (First Pivot): " + ((float) (quickSortFirstEndTime - quickSortFirstStartTime) / 1000000) + " ms");
        System.out.println("Quick Sort (Random Pivot): " + ((float) (quickSortRandomEndTime - quickSortRandomStartTime) / 1000000) + " ms");
        System.out.println("Merge Sort: " + ((float) (mergeSortEndTime - mergeSortStartTime) / 1000000) + " ms");
        System.out.println("Bubble Sort: " + ((float) (bubbleSortEndTime - bubbleSortStartTime) / 1000000) + " ms");
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000) + 1;
        }

        return array;
    }
}
