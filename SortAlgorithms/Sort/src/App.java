import fateczl.gabrielrobles.sort.QuickSort;
import fateczl.gabrielrobles.sort.PivotType;

public class App {
    public static void main(String[] args) throws Exception {
        var quickSort = new QuickSort();

        int[] array1 = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
        int[] array2 = { 44, 43, 42, 41, 40, 39, 38 };
        int[] array3 = { 31, 32, 33, 34, 99, 98, 97, 96 };

        quickSort.sort(array1, PivotType.LAST);
        quickSort.sort(array2, PivotType.MIDDLE_OF_THREE);
        quickSort.sort(array3, PivotType.RANDOM);

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
