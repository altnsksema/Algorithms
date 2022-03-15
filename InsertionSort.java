package SortingAlgorithms;

public class InsertionSort {
    public static void insertionSort (int [] array2){
        long start = System.nanoTime();
        for(int i = 1;i < array2.length; i++) {
            int j = i;
            while(j > 0 && array2[j] < array2[j-1]) {
                int temp = array2[j];
                array2[j] = array2[j-1];
                array2[j-1] = temp;
                j--;
            }
        }
        long end = System.nanoTime();
        long elapsedTime = end - start;

        double elapsedTimeToSecond = ((double) elapsedTime / 1000000000) * 1000;
        System.out.println("The passing time in the Insertion Sort:\n" + elapsedTimeToSecond + " second");
    }
}
