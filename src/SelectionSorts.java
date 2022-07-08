import java.util.Arrays;

public class SelectionSorts implements Sorter {
    @Override
    public int [] sort(int[] array) {

       for (int x = 0; x < array.length - 1; x++) {
            for (int i = x + 1; i < array.length; i++) {
                if (array[i] < array[x]) {
                    int a = array[i];
                    array[i] = array[x];
                    array[x] = a;
                }
            }
       }return array;

    }
}
