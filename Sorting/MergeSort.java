import java.util.Scanner;

public class MergeSort {
    Scanner s = new Scanner(System.in);
    int n;
    int arr[];
    
    void info() {
        System.out.println("Enter size of array");
        n = s.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + i + ": ");
            arr[i] = s.nextInt();
        }
    }
    
    void merge(int array[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for (int i = 0; i < n1; i++)
            L[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = array[mid + 1 + j];
        
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
    
    void mergeSorting(int array[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSorting(array, left, mid);
            mergeSorting(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }
    
    void showArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        MergeSort ob = new MergeSort();
        ob.info();
        ob.mergeSorting(ob.arr, 0, ob.n - 1);
        ob.showArray();
    }
}
 