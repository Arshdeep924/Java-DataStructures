import java.util.Scanner;

public class InsertionSort{
    Scanner s = new Scanner(System.in);
    int i;
    int n;
    int arr[];
    void info(){
        System.out.println("Enter size of array");
        n = s.nextInt();
        arr = new int[n];
        for(i = 0; i < arr.length; i++)
        {
            System.out.println("Enter element " + i + ": ");
            arr[i] = s.nextInt();
        }
    }

    void insertionSorting(){   
        int key;    
        for(i = 1; i <arr.length; i++)
        {
            key = arr[i];
            int j=i-1;
            while((j>-1) && (arr[j] > key))
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    void showArray()
    {
        for (i =0; i <arr.length ; i++) 
        {
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        InsertionSort ob=new InsertionSort();
        ob.info();
        ob.insertionSorting();
        ob.showArray();
    }

}