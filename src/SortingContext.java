class SortingContext {
    Sorter sorter;

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public int[] executSorter(int[] array) {
        sorter.sort(array);


        return array;
    }
}
