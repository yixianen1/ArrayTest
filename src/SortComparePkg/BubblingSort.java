package SortComparePkg;

public class BubblingSort implements Sort {
    int numbers[];

    public BubblingSort(int[] number) {
        this.numbers = number;
    }

    @Override
    public void sort() {
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length - j - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }

    @Override
    public int[] values() {
        return numbers;
    }
}
