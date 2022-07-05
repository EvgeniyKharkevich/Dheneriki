import java.util.Arrays;

public class SelectionSorts implements Sorter {
    @Override
    public void sort(int[] array) {
        System.out.println("—ортировка выборками");
        System.out.println("расстановка до сортировки :\t" + Arrays.toString(array));
        for (int x = 0; x < array.length - 1; x++) {
            for (int i = x + 1; i < array.length; i++) {
                if (array[i] < array[x]) {
                    int a = array[i];
                    array[i] = array[x];
                    array[x] = a;
                }
            }
        }
        System.out.println("–ассановка после сортировки :\t" + Arrays.toString(array));

    }
}
