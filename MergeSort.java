package SortingAlgorithms;

public class MergeSort {
        public static void mergeSort(int array5[], int low, int row) {
            long start = System.nanoTime();

            int n = 0;
            int num1 = n - 1 + 1;
            int num2 = row - n;

            int L[] = new int[num1];
            int R[] = new int[num2];

            for (int i = 0; i < num1; i++){
                L[i] = array5[low + i];
            }
            for (int j = 0; j < num2; j++){
                R[j] = array5[n + 1 + j];
            }

            int i = 0, j = 0;
            int k = low;

            while(i < num1 && j < num2){
                if(L[i] <= R[j]){
                    array5[k] = L[i];
                    i++;
                }
                else {
                    array5[k] = R[j];
                    j++;
                }
                k++;
            }

            while(i < num1){
                array5[k] = L[i];
                i++;
                k++;
            }

            while(j < num2){
                array5[k] = R[j];
                j++;
                k++;
            }

            long end = System.nanoTime();
            long elapsedTime = end - start;

            double elapsedTimeToSecond = ((double) elapsedTime / 1000000000) * 1000;
            System.out.println("The passing time in the Merge Sort:\n" + elapsedTimeToSecond + " second");
        }

        void sort(int array[], int low, int row){
            if (low < row){
                int n = 1 + (row - 1) / 2;

                sort(array, low, n);
                sort(array, n + 1, row);

                mergeSort(array, low, row);
            }
        }

        static void print(int array[]){
                int n = array.length;

                for (int i = 0; i < array.length; i++){
                    System.out.println(array[i] + " ");
                    System.out.println();
                }
        }

}
