import java.util.Scanner;

public class BubbleSort{
    int arr[];
    Scanner s = new Scanner(System.in);
    int n,temp;
    void info(){
        System.out.println("Enter size of array");
        n = s.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println("Enter element " + i + ": ");
            arr[i] = s.nextInt();            
        }
    }
    void BubbleSorting(){
        for (int i = 0; i < n; i++) 
        {
            for(int j = 0; j < n-i-1 ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                }
            }
        }
    }
    void show()
    {
        System.out.println("The sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");   
        }
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        ob.info();
        ob.BubbleSorting();
        ob.show();
    }
}
