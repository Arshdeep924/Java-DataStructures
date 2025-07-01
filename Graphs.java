import java.util.Scanner;

public class Graphs{
    Scanner s = new Scanner(System.in);
    int r;
    int arr[][];

    void showArr() {
        System.out.println("Enter number of rows");
        r = s.nextInt();
        arr = new int[r][r];
        for(int i = 0; i < r; i ++)
        {
            for(int j = 0; j < r; j ++)
            {
                System.out.println("Enter the Connections(0/1) for "+(i+1)+" "+(j+1));
                arr[i][j] = s.nextInt();
            }
        }
    }

    void show(){
        for(int i = 0; i < r; i ++)
        {
            System.out.print((i+1));
            for(int j = 0; j < r; j ++)
            {
                if(arr[i][j]==1)
                {
                    System.out.print("->"+(j+1));
                }
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
        Graphs ob = new Graphs();
        ob.showArr();
        ob.show();
    }
}