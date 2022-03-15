package SortingAlgorithms;

public class QuickSort {
    public static void QuickSort(int[] array4, int low, int high){
        long start = System.nanoTime();
            if (low >= high) {
                return;
            }

            int pivotPosition = partition(array4, low, high);

            quicksort(array4,low, pivotPosition-1);
            quicksort(array4, pivotPosition+1, high);

        long end = System.nanoTime();
        long elapsedTime = end - start;

        double elapsedTimeToSecond = ((double) elapsedTime / 1000000000) * 1000;
        System.out.println("The passing time in the Quick Sort:\n" + elapsedTimeToSecond + " second");
        }

    private static void quicksort(int[] arr, int low, int i) {
        return;
    }

    private static int partition(int[] arr, int low, int high) {
        return low;
    }
}





