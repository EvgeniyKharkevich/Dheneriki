import java.util.Arrays;

public class BubbleSort implements Sorter {
    @Override
    public void sort(int[] array) {
        for (int x = array.length - 1; x >= 1; x--) {
            for (int i = 0; i < x; i++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
        }
        System.out.println("Рассановка после сортировки :\t" + Arrays.toString(array));

    }
}
