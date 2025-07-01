
import java.util.Scanner;


class recursion2{
    // // FACTORIAL OF A NUMBER - For integer type argument(i.e. only till 16! as anymore will overflow)
    // public static int countFac(int n){
    //     if(n == 0 || n == 1){
    //         return 1;
    //     }else if(n<0){
    //         throw new IllegalArgumentException("Factorial is not defined for negative integers");
    //     }
    //     int ans = n * countFac(n-1);
    //     return ans;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number to find factorial: ");
    //     int n = sc.nextInt();
    //     System.out.println("The factorial of " + n + " is: " + countFac(n));
    // }

    
    // // SUM OF N NATURAL NUMBERS
    // public static int findSum(int n) {
    //     if(n == 0){
    //         return 0;
    //     }
    //     int ans = n + findSum(n-1);
    //     return ans;
    // }
    // public static void main(String [] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the count of numbers till sum up is required: ");
    //     int n = sc.nextInt();
    //     System.out.println("The sum of first " + n + " numbers is: " + findSum(n));
    // }


    // TO PRINT NUMBERS 1 TO N
    // public static void printNos(int n){
    //     if(n == 0){
    //         return;
    //     }
    //     printNos(n-1);
    //     System.out.print(n + " ");
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter till you want the nos to be printed");
    //     int n = sc.nextInt();
    //     printNos(n);
    // }


    // // REVERSE A STRING 
    // public static String revString(String str){
    //     if(str.isEmpty()){
    //         return str;
    //     }
    //     return revString(str.substring(1)) + str.charAt(0);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the string to be reversed");
    //     String str = sc.next();
    //     System.out.println("The reverse of " + str + " is: " + revString(str));
    // }


    // FIBONACCI NUMBERS UPTO N
    // public static int printFib(int n){
    //     if(n == 0){
    //         return 0;
    //     }else if (n == 1) {
    //         return 1;
    //     }
    //     return printFib(n-1) + printFib(n-2);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter count of Fibonacci nos required: ");
    //     int n = sc.nextInt();
    //     for (int i = 0; i <= n; i++) {
    //         System.out.print(printFib(i) + " ");
    //     }
    // }

    

    



}