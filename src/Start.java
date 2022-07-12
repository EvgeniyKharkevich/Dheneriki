import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        SortingContext array0 = new SortingContext();

        int[] array1 = {2, 1, 4, 3, 5, 6};
        array0.setSorter(new SelectionSorts());
        array0.executSorter(array1);

        int[] array2 = {25, 15, 48, 26};
        array0.setSorter(new BubbleSort());
        array0.executSorter(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
