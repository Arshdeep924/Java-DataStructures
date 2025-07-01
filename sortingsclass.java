class sortings{
    // // MERGE SORT
    // //  DECLARING CONQUER FUNCTION
    // public static void conquer(int arr[], int si, int mid, int ei) {
    //     int merger[] = new int[ei - si + 1];
    //     int idx1 = si;
    //     int idx2 = mid + 1;
    //     int x = 0;
    //     while(idx1<=mid && idx2<=ei){
    //         if(arr[idx1] <= arr[idx2]){
    //             merger[x] = arr[idx1];
    //             x++; idx1++;
    //         } else {
    //             merger[x] = arr[idx2];
    //             x++; idx2++;
    //         }

    //         while(idx1<=mid){
    //             merger[x++] = arr[idx1++];
    //         }
    //         while(idx2<=ei){
    //             merger[x++] = arr[idx2++];
    //         }
    //         for(int i = 0, j =si; i<merger.length; i++, j++){
    //             arr[j] = merger[i];
    //         }
    //     }
    // }
    // // DECLARING DIVIDING FUNCTION
    // public static void divide(int arr[], int si, int ei){
    //     if(si = ei){
    //         return;
    //     }
    //     int mid = si + (ei-si)/2; 
    //     divide(arr, si, mid);
    //     divide(arr, mid+1, ei);
    //     conquer(arr, si, mid, ei);
    // }
    // public static void main(String[] args){
    //     // DECLARING ARRAY
    //     int arr[] = {6,3,9,5,2,8};
    //     int n = arr.length;
    //     divide(arr, 0, n-1);
    //     // PRINTING
    //     for(int i = 0; i<n; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }


    // QUICK SORT
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for(int j = 0; j < high-1; j++) {
            if(arr[j] < pivot){
                i++;
                // swapping 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //pivot index
    }
    public static void quickSort(int arr[], int low, int high) {
        if(low<high) {
            int pivotidx = partition(arr, low, high);

            quickSort(arr, low, pivotidx-1);
            quickSort(arr, pivotidx+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;

        quickSort(arr, 0, n-1);

        // print
        for(int i = 0;i < n; i++) {
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
}