import java.util.Arrays;

public class BubbleSort implements Sorter {
    @Override
    public void sort(int[] array) {
        System.out.println("���������� ���������");
        System.out.println("����������� �� ���������� :\t" + Arrays.toString(array));
        for (int x = array.length - 1; x >= 0; x--) {
            for (int i = 0; i < x; x++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
        }
        System.out.println("���������� ����� ���������� :\t" + Arrays.toString(array));

    }
}
