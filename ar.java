
import java.util.Scanner;

public class ar{
    int arr[] = new int[10];
    Scanner s = new Scanner(System.in);
    double sum = 0;
    double avg = 0;
    int min;
    int max;
    void input(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + i + ": ");
            arr[i] = s.nextInt();
        }
        min=arr[0];
        max = arr[0];
    }
    void calculate(){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] < min){
                min = arr[i];
            }
            else if(arr[i] > max ){
                max = arr[i];
            }
            sum = sum + arr[i];
        }
        avg = (sum/arr.length);
        System.out.println("The min element is " + min);
        System.out.println("The max element is " + max);
        System.out.println("Sum of elements is " + sum);
        System.out.println("The avg is " + avg);
    }
    public static void main(String[] args) {
        ar ob = new ar();
        ob.input();
        ob.calculate();
    }
}