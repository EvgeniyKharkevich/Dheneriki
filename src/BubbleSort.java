
public class BubbleSort implements Sorter {

    @Override
    public int[] sort(int[] array) {
        for (int x = array.length - 1; x >= 1; x--) {
            for (int i = 0; i < x; i++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
        }
        return array;
    }
}
