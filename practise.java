
import java.util.Scanner;



class practise{
    public static int printFib(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        return printFib(n-1)+printFib(n-2);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int n = s.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println(printFib(i));
        }
       }
}