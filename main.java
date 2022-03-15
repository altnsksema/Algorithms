package SortingAlgorithms;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Please enter your size of array: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int [] arrays = new int[num];
        for (int i = 0; i < arrays.length; i++){
            arrays[i] = random.nextInt(num);
        }

        BubbleSort.bubbleSort(arrays);
        InsertionSort.insertionSort(arrays);
        SelectionSort.selectionSort(arrays);
        QuickSort.QuickSort(arrays,1, num + 1);
        MergeSort.mergeSort(arrays, 0, arrays.length - 1);

    }
}
