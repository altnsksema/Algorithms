package SortingAlgorithms;

public class BubbleSort {
    public static void bubbleSort (int [] array1){
        long start = System.nanoTime();
        for(int i = 0;i < array1.length; i++){
            for(int j=0;j < (array1.length) - 1; j++){
                if(array1[j] > array1[j+1]){
                    int temp = array1[j];
                    array1[j] = array1[j+1];
                    array1[j+1] = temp;
                }
            }
        }
        long end = System.nanoTime();
        long elapsedTime = end - start;

        double elapsedTimeToSecond = ((double) elapsedTime / 1000000000) * 1000;
        System.out.println("The passing time in the Bubble Sort:\n" + elapsedTimeToSecond + " second");

    }
}
