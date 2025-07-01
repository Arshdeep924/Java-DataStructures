import java.util.Scanner;

public class BinarySeach
{
    int beg = 0, end, mid = 0;
    int counter = 0,ele;
    int arr[];
    Scanner s = new Scanner(System.in);

    void info(){
        System.out.println("Enter size of array");
        int n = s.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println("Enter element " + i + ": ");
            arr[i] = s.nextInt();            
        }
    }
    void bSearch(){
        System.out.println("Enter the element you want to search");
        ele = s.nextInt();
        end=arr.length;
        while(beg<end)
        {
            mid = (beg+end)/2;
            if(arr[mid]<ele)
            {
                beg = mid+1;
            }
            else if(arr[mid]>ele)
            {
                end = mid-1;
            }
            else
            {
                System.out.println(arr[mid] + " is found at index " + mid);
                counter = 1;
                break;
            }
        }
        if(counter == 0)
        {
            System.out.println("The element is not found in the array");
        }
    }
    public static void main(String[] args) {
        BinarySeach ob = new BinarySeach();
        ob.info();
        ob.bSearch();       
    }
}