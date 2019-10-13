package SortComparePkg;

public class SelectionSort implements Sort {
    int numbers[];

    public SelectionSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void sort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    @Override
    public int[] values() {
        return numbers;
    }
}
