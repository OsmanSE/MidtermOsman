package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here



        int n = list.length;
        for (int i = 1; i < n; ++i) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;





        ///////**
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;
        //implement here
/////
            int n = array.length;
            int temp = 0;

            for(int i=0; i < n; i++)
            {

                for(int j=1; j < (n-i); j++)
                {

                    if(array[j-1] > array[j])
                    {
                        //swap the elements!
                        temp = array[j-1];
                        array[j-1] = array[j];
                        array[j] = temp;
                    }

                }
            }
return array;
        }




    public int[] mergeSort(int[] list, int lowIndex, int highIndex) {
       // int[] list = array;
        //implement here
if(lowIndex==highIndex){return list;}
else{
    int midindex=(lowIndex+highIndex)/2;
    mergeSort(list,lowIndex,highIndex);
    mergeSort(list,midindex+1,highIndex);
    mergeSort(list,lowIndex,midindex+1);

}
return list;
    }

    //qqq
    public static void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    public static void quicksort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = arr[(left + right) / 2];
        int index = partition(arr, left, right, pivot);
        quicksort(arr, left, index - 1);
        quicksort(arr, index, right);

    }

    public static int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
        }
        while (arr[right] > pivot) {
            right--;
        }
        if (left <= right) {
            int t=arr[left];
                arr[left]=arr[right];
                arr[right]=t;
            //swap(arr, left, right);
            left++;
            right--;
        }

    return left;
}


    public int [] heapSort(int [] array){
        final long startTime=System.currentTimeMillis();
        int [] list = array;
        //implement here

        int n = list.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            createHeap(list, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;

           createHeap(list, i, 0);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;

    }
    void createHeap(int list[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && list[l] > list[largest])
            largest = l;


        if (r < n && list[r] > list[largest])
            largest = r;

        if (largest != i) {
            int swap = list[i];
            list[i] = list[largest];
            list[largest] = swap;
            createHeap(list, n, largest);
        }
    }


    public int [] bucketSort(int [] array, int maxValue){
        final long startTime=System.currentTimeMillis();
        int [] list = array;
        //implement here

        int[] bucket = new int[maxValue + 1];
        int[] sortedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }
        int op = 0;
        for (int i = 0; i < bucket.length; i++)
            for (int j = 0; j < bucket[i]; j++)
                sortedArray[op++] = i;


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return sortedArray;


        

    }
    
    public int [] shellSort(int [] array){
        int [] list = array;

        final long startTime = System.currentTimeMillis();

        //implement here
        int n = list.length;

        for (int dif = n / 2; dif> 0; dif /= 2) {
            for (int i = dif; i < n; i += 1) {
                int tmp = list[i];
                int j;
                for (j = i; j >= dif && list[j - dif] > tmp; j -= dif) {
                    list[j] = list[j - dif];
                }
                list[j] = tmp;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }






        ////


    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
