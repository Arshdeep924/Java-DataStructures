
import java.util.Scanner;


class oneclass {
    
//     int c = 0;
//     void countEven(int st, int n){
//         if(st<=n) {
//             if(st%2 == 0) {
//                 System.out.print(st+" ");
//                 c++;
//             }
//         st++;
//         countEven(st, n);
//     }
//     else {
//         System.out.println("\nTotal number of even nos. = " + c);
//     }
// }
//     public static void main(String[] args) {
//         int n = 40;
//         oneclass obj = new oneclass();
//         obj.countEven(1, n);
//     }

// // WAP TO INPUT A NUMBER AND PRINT ITS FACTORIAL

    // public static long countFactorial(int n) {
    //     if(n == 0 || n == 1) {
    //         return 1;
    //     }
    //     long fact_nm1 = countFactorial(n-1);
    //     long fact_n = n*fact_nm1;
    //     return fact_n;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int n = sc.nextInt();
    //     long ans = countFactorial(n);
    //     System.out.println("It's Factorial = " + ans);
    // }


    // // WAP TO PRINT A MULTIPLICATION TABLE OF INPUT NUMBER
    // public static void printTable(int n, int mult) {
    //     if(mult > 10) {
    //         return;
    //     }
    //     System.out.println(n + " X " + mult + " = " + (n*mult));
    //     printTable(n, mult + 1);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a Number: ");
    //     int n = sc.nextInt();
        
    //     System.out.println("Multiplication of " + n + " : ");
    //     printTable(n, 1);
    // }


    // WAP TO FIND IF INPUT NUMBER IS PERFECT NUMBER OR NOT
    // int s = 0;
    // int n;
    // Scanner sc = new Scanner(System.in);
    // void getInput() {
    //     System.out.println("Enter a number: ");
    //     n = sc.nextInt();
    // }
    // void perfectNo(int t) {
    //     if(t<n) {
    //         if(n%t == 0) {
    //             s = s + t;
    //         }
    //         t++;
    //         perfectNo(t);
    //     } else {
    //         if(s == n) {
    //             System.out.println("It is Perfect number");
    //         } else {
    //             System.out.println("It is not");
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     oneclass no = new oneclass();
    //     no.getInput();
    //     no.perfectNo(1);
    // }

    // // WAP TO CHECK IF INPUT NUMBER IS SPY NUMBER OR NOT
    // int s = 0; int p = 1; int r;
    // void check(int n){
    //     if(n>0) {
    //         r = n%10;
    //         s += r;
    //         p *= r;
    //         n /= 10;
    //         check(n);
    //     } else {
    //         if (s == p) {
    //             System.out.println("It is spy number");
    //         } else {
    //             System.out.println("It is not");
    //         }  
    //     }
    // }
    // public static void main(String[] args) {
    //     oneclass ob = new oneclass();
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter test Number");
    //     int n = sc.nextInt();
    //     ob.check(n);
    // }

    // // WAP TO INPUT TWO NOS AND PRINT THE NOS BETWEEEN THEM
    // void printN(int m, int n) {
    //     if(m<n) {
    //         System.out.print(m + " ");
    //         m++;
    //         printN(m, n);
    //     }
    // }
    // public static void main(String[] args) {
    //     oneclass ob = new oneclass();
    //     Scanner sc =  new Scanner(System.in);
    //     System.out.println("Enter lower bound m: ");
    //     int m =  sc.nextInt();
    //     System.out.println("Enter upper bound n: ");
    //     int n = sc.nextInt();
    //     ob.printN(m + 1, n);
    // }


    // // WAP TO PRINT A SERIES OF INPUT EX = 5, OUTPUT = 5 + 55 + 555 + 5555
    // int s = 0;
    // void pattern(int i, int n) {
    //     if(i<5) {
    //         if(i<4) {
    //             System.out.print((s = s*10 + n) + " + ");
    //         }else {
    //             System.out.print(s = s*10 + n);
    //         }
    //         i++;
    //         pattern(i, n);
    //     }
    // }
    // public static void main(String[] args) {
    //     oneclass ob = new oneclass();
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number");
    //     int n = sc.nextInt();
    //     ob.pattern(0, n);
    // }


//     // WAP TO FIND NUMBER OF VOWELS IN A STRING INPUT 
//     int count=0;
//     void countVowels(String n,int i){
//         if(i<n.length())
//         {char a = n.charAt(i);
//         if(a == 'a'|| a=='e'||a=='i'||a=='o'||a=='u'){
//             count++;
//         }
//         i++;
//         countVowels(n, i);
//     }
//     else{
//         System.out.println("The no. of vowels are: " + count);
//     }
// }
//     public static void main(String[] args) {
//         oneclass ob = new oneclass();
//         Scanner sc = new Scanner(System.in);
//         String n = sc.nextLine();
//         ob.countVowels(n, 0);
//     }
    

    // // WAP TO INPUT A NUMBER AND REVERSE IT
    // int n; int rem; int rev = 0;
    // void printRev(int n) {
    //     if(n>0) {
    //         rem = n%10;
    //         rev = rev*10 + rem;
    //         n = n/10;
    //         printRev(n);
    //     }else {
    //         System.out.println("The reversed number is " + rev);
    //     } 
    // }
    // public static void main(String[] args) {
    //     oneclass ob = new oneclass();
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number: ");
    //     int n =  sc.nextInt();
    //     ob.printRev(n);
    // }


    // // WAP TO INPUT A NUMBER '2' AND PRINT - 2,4,8,16,32,64....n
    // void printSeries(int n,int i) {
    //     if(i<10) {
    //         System.out.print(n*i + ",");
    //         printSeries(n, i+1);
    //     }
    // }
    // public static void main(String[] args) {
    //     oneclass ob = new oneclass();
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number: ");
    //     int n = sc.nextInt();
    //     ob.printSeries(n, 1);
    // }

    
    // // WAP TO INPUT TWO NOS AND FIND a^b
    // int printPow(int a, int b) {
    //     if(b==0) {
    //         return 1;
    //     }
    //     return a*printPow(a, b-1);  
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter number a: ");
    //     int a = sc.nextInt();
    //     System.out.println("Enter number b: ");
    //     int b =  sc.nextInt();
    //     oneclass ob = new oneclass();
    //     int result = ob.printPow(a, b);
    //     System.out.println(result);
    // }










}




