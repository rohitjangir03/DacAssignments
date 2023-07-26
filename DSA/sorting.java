public class sorting {

    public void BubbleSort(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        display(arr);
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }

                int se = arr[min];
                arr[min] = arr[j];
                arr[j] = se;
            }
        }
        display(arr);
    }

    public static void insertionSort(int arr[]) {
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        display(arr);
    }
    
    //merge sort
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    private static void conquer(int[] arr, int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
    /*
     * public static void quickSort(int arr[], int low, int high) {
     * if (low < high) {
     * int pivotindex = partition(arr, low, high);
     * quickSort(arr, low, pivotindex - 1);
     * quickSort(arr, pivotindex + 1, high);
     * }
     * }
     * 
     * public static int partition(int arr[], int low, int high) {
     * int pivot = arr[high];
     * int i = low - 1;
     * 
     * for (int j = low; j <=high-1; j++) {
     * if (arr[j] < pivot) {
     * i++;
     * // swap
     * int temp = arr[i];
     * arr[i] = arr[j];
     * arr[j] = temp;
     * }
     * }
     * i++;
     * int temp = arr[i];
     * arr[i] = pivot;
     * pivot= temp;
     * return i;
     * }
     */
    /*
     * static void swap(int[] arr, int i, int j)
     * {
     * int temp = arr[i];
     * arr[i] = arr[j];
     * arr[j] = temp;
     * }
     */
    
     //quickSort
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    //display method
    public static void display(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2, 6, 9 };
        int n = arr.length - 1;
        // insertionSort(arr);
        // selectionSort(arr);

        /// divide(arr, 0, arr.length - 1);
        // display(arr);

        quickSort(arr, 0, n);
        display(arr);
    }
}