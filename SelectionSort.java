package SortingAlgorithms;

public class SelectionSort {
    public static void selectionSort (int [] array3){
        long start = System.nanoTime();
        for(int i = 0; i < array3.length; i++) {
            int minIndex = i;
            for(int j = i+1;j < array3.length; j++) {
                if(array3[j] < array3[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array3[i];
            array3[i] = array3[minIndex];
            array3[minIndex] = temp;
        }

        long end = System.nanoTime();
        long elapsedTime = end - start;

        double elapsedTimeToSecond = ((double) elapsedTime / 1000000000) * 1000;
        System.out.println("The passing time in the Selection Sort:\n" + elapsedTimeToSecond + " second");

    }
}
