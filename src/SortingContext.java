 class SortingContext {
    Sorter sorter;

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public void executSorter(int[] array) {
        sorter.sort(array);


    }
}
