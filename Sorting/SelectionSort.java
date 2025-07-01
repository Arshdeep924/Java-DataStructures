import java.util.Scanner;

public class SelectionSort{
    int arr[];
    Scanner s = new Scanner(System.in);
    int n,temp,i,j;
    void info(){
        System.out.println("Enter size of array");
        n = s.nextInt();
        arr = new int[n];
        for (i = 0; i < arr.length; i++) 
        {
            System.out.println("Enter element " + (i+1) + ": ");
            arr[i] = s.nextInt();            
        }
    }

    void SelectionSorting(){
        for(i=0;i<n-1;i++)
        {
            int idx = i;
            for(j = i+1; j < n; j++)
            {
                if(arr[j]<arr[idx])
                {
                    idx = j;
                }
            }
            temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }
    void showArray()
    {
        System.out.println("The sorted array is- ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        ob.info();
        ob.SelectionSorting();
        ob.showArray();
    }
}