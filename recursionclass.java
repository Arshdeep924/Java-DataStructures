class recursion{
    // // TO PRINT NOS 5 TO 1
    // public static void printNumb(int n){   
    //     if(n == 0){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumb(n-1);
    // }
    // public static void main(String args[]){
    //     int n = 5;
    //     printNumb(n);
    // }

    // // TO PRINT NOS FROM 1 TO 5
    // public static void printNumb(int n){
    //     if(n == 6){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumb(n+1);
    // }
    // public static void main(String[] args) {
    //     int n = 1;
    //     printNumb(n);
    // }


    // // TO PRINT SUM OF N NOS.
    // public static void printSum(int i, int n, int sum) {
    //     if(i == n){
    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += i;
    //     printSum(i+1, n, sum);
    // }
    // public static void main(String[] args) {
    //     printSum(1, 5, 0);
    // }

    // // TO PRINT FACTORIAL OF A NUMBER
    // public static int calculateFactorial(int n){ 
    //     if(n == 1 || n == 0){
    //         return 1; 
    //     }
    //     int fact_nm1 = calculateFactorial(n-1);
    //     int fact_n = n*fact_nm1;
    //     return fact_n;
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     int ans = calculateFactorial(n);
    //     System.out.println(ans);
    // }

    // // TO CREATE A FIBONACCI SERIES
    // public static void printFib(int a,int b,int n) {
    //     if(n==0){
    //         return;
    //     }
    //     int c = a+b;
    //     System.out.println(c);
    //     printFib(b, c, n-1);
    // }
    // public static void main(String[] args) {
    //     int a = 0, b = 1;
    //     System.out.println(a);
    //     System.out.println(b);
    //     int n = 7;
    //     printFib(a, b, n-2);
    // }

    // // FIBONACCI BY ITERATION
    // public static void main(String[] args) {
    //     int a = 0, b = 1;
    //     int n = 7;
    //     System.out.println(a);
    //     System.out.println(b);
    //     for(int i = 2; i < n; i++){
    //         int c = a+b;
    //         System.out.println(c);
    //         a = b;
    //         b = c;
    //     }

    // // TO CALCULATE x^n with stack height(n)
    // public static int calcPow(int x, int n) {
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(x == 0){
    //         return 0;
    //     }
    //     int xPownm1 = calcPow(x, n-1);
    //     int xPown = x * xPownm1;
    //     return xPown;
    // }
    // public static void main(String[] args) {
    //     int x =2, n = 12;
    //     int ans = calcPow(x, n);
    //     System.out.println(ans);
    // }

    // TO CALCULATE x^n WITH STACK HEIGHT Log(n)
    // public static int calcPow(int x, int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(x == 0){
    //         return 0;
    //     }
    //     // if n is even
    //     if(n % 2 == 0){
    //         return calcPow(x, n/2) * calcPow(x, n/2);
    //     }
    //     else{ // n is odd
    //         return calcPow(x, n/2) * calcPow(x, n/2) * x;
    //     }
    // }
    // public static void main(String[] args) {
    //     int x = 2, n = 5;
    //     int ans = calcPow(x, n);
    //     System.out.println(ans);
    // }

    // TO DO LIST==================================
    // JVM QUESTION - 10 MARKS IN PAPER============
    // CLASSLOADER
    // BYTE CODE 
    // BYTE CODE GENERATION
    // javap -c prints out disassembeled code for each method in the class,
    // Disassembeled code means the instructions that comprise the java bytecodes

    // // CLASSIC TOWER OF HANOI PROBLEM
    // public static void towerOfHanoi(int n, String src, String helper, String dest) {
    //     if(n == 1){
    //         System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    //         return;
    //     }
    //     towerOfHanoi(n-1, src, dest, helper);  //use n-1 for first time, use dest as helper and helper as dest
    //     System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    //     towerOfHanoi(n-1, helper, src, dest);
    // } 
    // public static void main(String[] args) {
    //     int n = 4;
    //     towerOfHanoi(n, "S", "H", "D");
    // }

    // // PRINT A STRING IN REVERSE 
    // public static void printRev(String str, int idx){
    //     if(idx == 0){
    //         System.out.println(str.charAt(idx));
    //         return;
    //     }
    //     System.out.println(str.charAt(idx));
    //     printRev(str, idx-1);   //idx-1 because string length n = n-1 in index
    // }   
    // public static void main(String[] args) {
    //     String str = "abcd";
    //     printRev(str,str.length()-1);
    // }

    // TO FIND FIRST AND LAST OCCURENCE OF AN ELEMENT IN A STRING "abaacdaefaah", element = 'a'
    // we use static vairables in this problem

    // public static int  first = -1;
    // public static int last = -1;
    // public static void findOccurence(String str, int idx, char element){
    //     if(idx == str.length()){
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(currChar == element){
    //         if(first == -1){
    //             first = idx;
    //         }else{
    //             last = idx;
    //         }
    //     }findOccurence(str, idx+1, element);
    // }
    // public static void main(String[] args) {
    //     String str = "abaacdaefaah";
    //     findOccurence(str, 0, 'a');
    // }




    }

 






    
