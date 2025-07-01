import java.util.Scanner;

public class loops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = 0;
        // int n=20;
        // for(int i = 1; i < n; i ++) 
        // {
        //     System.out.print(a + " ");
        //     a=a+i;
        // }

        // int a = 0;
        // int b = 3;
        // for(int i = 0; i < 15; i++){
        //     System.out.print(a + " ");
        //     a = a + b;
        //     b = b + 2;
        // }

        // int a = 1;
        // for(int i = 1; i < 10; i++) {
        //     System.out.print(a + " ");
        //     a = a*2;
        // }

        // int a = 0;
        // for (int i = 1; i < 10; i++) {
        //     System.out.print(i*i + " ");
        //     a = a + (i*i);
        // }
        // System.out.println("\n" + a);

        // int a =  0;
        // for (int i = 1; i <=10; i++) 
        // {
        //     if(i<10)
        //     System.out.print("(" + i + "*" + i + ") + " );
        //     else
        //     System.out.print("(" + i + "*" + i + ")" );
        //     a = a+(i*i);
        // }
        // System.out.println("\n" + a);
        
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // int a = 1;
        // for (int i = n; i >= 1; i--) {
        //     a = a*i;
        // }
        // System.out.println(a);

        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // int a = 0;
        // for (int i = 1; i <= 10; i++) {
        //     a = n*i;
        //     System.out.println(n + "*" + i + "=" + a);
        // }

        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // int rev = 0;
        // int rem;
        // int a = n;
        // int sum = 0;
        // while(n>0) {
        //     rem = n%10;
        //     rev = rev*10+rem;
        //     n = n/10;
        //     sum = sum + rem;
        // }
        // if(rev == a ){
        //     System.out.println(a + " is Palindrome");
        // }else {
        //     System.out.println("Not Palindrome");
        // }
        // System.out.println("Sum of digits" + sum);

        // // 9.
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // int a = 0;
        // int rem;
        // while(n>0){
        //     rem = n%10;
        //     n = n/10;
        //     a = (a + rem);
        // }
        // System.out.println(a);

        // // 10.
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // int Oddsum = 0;
        // int Evensum = 0;
        // for (int i = 1; i <= n; i ++) {
        //     if(i%2 == 0){
        //         Evensum = Evensum + i;
        //     }else{
        //         Oddsum = Oddsum + i;
        //     }
        // }
        // System.out.println("Sum of Odd nos upto " + n + " = " + Oddsum);
        // System.out.println("Sum of Even nos upto " + n + " = " + Evensum);

        // // 11.
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // int count = 0;
        // if(n == 0){
        //     count = 1;
        // }else{
        //     while(n > 0){
        //         n = n/10;
        //         count ++;
        //     }
        // }
        // System.out.println("Count of digits = " + count);

        // // 12.
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // int count = 0;
        // if(n>1){
        //     for(int i = 1; i <= n; i++){
        //         if(n%i == 0){
        //             count ++;
        //         }
        //     }
        //     if(count == 2){
        //         System.out.println(n + " is Prime");
        //     }else{
        //         System.out.println(n + " is not Prime");
        //     }
        // }else{
        //     if(n == 0 || n == 1){
        //         System.out.println(n + " is not Prime");
        //     }else{
        //         System.out.println("Enter a positive number");
        //     }
        // }

        // //13.
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // for(int i = 1; i <= n; i ++){
        //     System.out.println("Cube of " + i + " = " + (i*i*i));
        // }

        // // 14.
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i = 1; i <= n; i += 2){
        //     System.out.print(i + " ");
        //     sum = sum + i;
        // }
        // System.out.println("\nSum of ODD integers upto " + n + " = " + sum);

        // // 17.
        // for(int i = 1; i <= 100; i++){
        //     if(i%3 == 0 && i%5 == 0){
        //         System.out.print("FIZZBUZZ ");
        //     }else if(i%5 == 0){
        //         System.out.print("BUZZ ");
        //     }else if(i%3 == 0){
        //         System.out.print("FIZZ ");
        //     }else {
        //         System.out.print(i + " ");
        //     }
        // }

        // //18.
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // for (int i = 1; i <=1000; i++) {
        //     if((i*(i+1)) == n){
        //         System.out.println("It is pronic");
        //         return;
        //     }
        // }
        // System.out.println("It is not Pronic");


        // //15.
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // int x = n;
        // int a;
        // int sum = 0;
        // while(n>0) {
        //     a = n%10;
        //     sum = sum + (a*a*a);
        //     n = n/10;
        // }
        // if(sum == x) {
        //     System.out.println("it is armstrong");
        // }else{
        //     System.out.println("It is not");
        // }
            
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // int a = 0;
        // int b = 1;
        // int c;
        // System.out.print("0 1 ");
        // while(n>0){
        //     c=a+b;
        //     System.err.print(c+" ");
        //     a=b;
        //     b=c;
        //     n--;
        // }


        // //   PYTHON LAB ASSIGNMENT WHILE LOOP
        // // NIVEN NUMBER
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // int a = n;
        // int rem;
        // int x = 0;
        // while(n>0){
        //     rem = n%10;
        //     x += rem;
        //     n = n/10;
        // }
        // if(a%x == 0){
        //     System.out.println("It is Niven Number");
        // }else{
        //     System.out.println("It is not");
        // }

        // // SPY NUMBER
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // int sum = 0;
        // int prod = 1;
        // int x;
        // while(n>0){
        //     x = n%10;
        //     sum = sum + x;
        //     prod = prod * x;
        //     n = n/10;
        // }
        // if(sum == prod){
        //     System.out.println("It is Spy number");
        // }else{
        //     System.out.println("It is not");
        // }

        // // CHECKING NO. OF POS, NEG TERMS AND THEIR SUMS
        // int pc=0,psum=0,nc=0,nsum=0;
        // for(int i = 1; i <= 5; i++){
        //     System.out.print("Enter number " + i + ": ");
        //     int n = sc.nextInt();
        //     if(n>0) {
        //         pc++;
        //         psum += n;
        //     }else{
        //         nc++;
        //         nsum += n;
        //     }
        // }
        // System.out.println("No. of POSITIVE terms: " + pc);
        // System.out.println("Sum of POSITIVE terms: " + psum);
        // System.out.println("No. of NEGATIVE terms: " + nc);
        // System.out.println("Sum of NEGATIVE terms: " + nsum);


        // // TO FIND SUM OF ODD NOS AND EVEN NOS BETWEEN INPUT RANGE M AND N
        // System.out.println("Enter m: ");
        // int m = sc.nextInt();
        // System.out.println("Enter n: ");
        // int n = sc.nextInt();
        // int oddSum = 0;
        // int evenSum = 0; 
        // if(m<n){
        // for (int i = m; i <= n; i++) {
        //     if(i%2 == 0){
        //         evenSum = evenSum + i;
        //     }else{
        //         oddSum = oddSum + i;
        //     }
        // }
        // System.out.println("Sum of even terms: " + evenSum);
        // System.out.println("Sum of odd terms: " + oddSum);
        // }else{
        //     System.out.println("M should be lesser than n");
        // }

        // // TO ENTER ANY 10 NOS AND CHECK IF THEY DIV BY 5 OR NOT
        // int count = 0;
        // String endWith5 = "";
        // for(int i = 1; i <= 5; i++) {
        //     System.out.print("Enter number " + i + ": ");
        //     int n = sc.nextInt();
        //     if(n%5 == 0){
        //         if(n%10 == 5) {
        //             endWith5 = endWith5 + n + " ";
        //         }else if(n%10 == 0){
        //             count++;
        //         }
        //     }else{
        //         System.out.println("It is not divisible by 5");
        //     }
        // }
        // System.out.println("Terms ending with 5 are: " + (endWith5.isEmpty() ? "None" : endWith5));
        // System.out.println("Number of terms ending with 0 are " + count);

        // // WAP to display buzz numbers between p and q (p<q)
        // System.out.println("Enter lower bound p: ");
        // int p = sc.nextInt();
        // System.out.println("Enter upper bound q: ");
        // int q = sc.nextInt();
        // String divBy7 = "";
        // String endWith7 = "";
        // for(int i = p; i < q; i ++) {
        //     if(i%7 == 0){
        //         divBy7 = divBy7 + i + " ";
        //     }else if(i%10 == 7){
        //         endWith7 = endWith7 + i + " ";
        //     }
        // }
        // System.out.println("Terms div by 7 are: " + (divBy7.isEmpty() ? "none" : divBy7));
        // System.out.println("Terms ending with 7 are: " + (endWith7.isEmpty() ? "none" : endWith7));


        // //WAP TO INPUT A NUMBER AND COUNT AND DISPLAY THE NUMBER OF DIGITS
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();
        // int count = 0;
        // while(n>0){
        //     n /= 10;
        //     count++;
        // }
        // System.out.println("No. of digits = " + count);
        // if(count%2 == 0){
        //     System.out.println("There are odd number of digits");
        // }else{
        //     System.out.println("There are even no. of digits");
        // }

        // // WAP TO INPUT A NO. AND DISPLAY AND SUBTRACT REVERSE OF IT
        // System.out.println("Enter your number");
        // int n = sc.nextInt();
        // int a = n;
        // int rev = 0;
        // while(n>0){
        //     rev = rev*10 + (n%10);
        //     n /= 10;
        // }
        // System.out.println("The reversed number is: " + rev);
        // System.out.println("The difference of both is: " + Math.abs(a-rev));


        // // LAB ASSIGNMENT
        // // WAP TO CHECK WETHER ABUNDANT NUMBER OR NOT
        // System.out.println("Enter your number: ");
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i = 1; i < n; i++) {
        //     if(n%i == 0) {
        //         sum = sum + i;
        //     }
        // }
        // if(sum>n) {
        //     System.out.println("It is an abundant number");
        // }else{
        //     System.out.println("It is not an abundant number");
        // }

        // // TO FIND IF TWO NOS ARE FRIENDLY PAIRS(AMICABLE) OR NOT
        // System.out.println("Enter number 1: ");
        // int n = sc.nextInt();
        // System.out.println("Enter number 2: ");
        // int m = sc.nextInt();
        // int sumN = 0;
        // int sumM = 0;
        // for(int i = 1; i < n; i++) {
        //     if(n%i == 0) {
        //         sumN = sumN + i;
        //     }
        // }
        // for(int j = 1; j < m; j++) {
        //     if(m%j == 0) {
        //         sumM = sumM + j;
        //     }
        // }
        // if((sumN/n) == (sumM/m)) {
        //     System.out.println("The numbers are friendly pairs(Amicable)");
        // }else{
        //     System.out.println("The numbers are not friendly pairs");
        // }

        // // WAP TO CONVERT A NUMBER FROM DECIMAL TO BINARY
        // System.out.println("Enter decimal number: ");
        // int n = sc.nextInt();
        // int a = n;
        // String bin = "";
        // if(n == 0){
        //     bin = "0";
        // }else{
        //     while(n>0) {
        //         bin = (n%2) + bin;
        //         n /= 2;
        //     }
        // }
        // System.out.println("The binary equivalent of " + a + " = " + bin);
        

        // // WAP TO REPLACE ALL 0S WITH 1S IN A GIVEN INTEGER
        // System.out.println("Enter any integer:");
        // int n=sc.nextInt();
        // String num=""+n;
        // String newStr="";
        // System.out.println(num);       
        // for(int i=0;i<num.length();i++) {
        //     char ch=num.charAt(i);
        //     if(ch=='0') {
        //         newStr=newStr+'1';
        //     }else {
        //         newStr+=ch;
        //     }
        // }
        // System.out.println("After replacement="+newStr);
        
        // // WAP TO OUTPUT DAYS IN GIVEN MONTH OF GIVEN YEAR
        // System.out.println("Enter Month(1-12): ");
        // int m = sc.nextInt();
        // System.out.println("Enter the year: ");
        // int y = sc.nextInt();

        // if(y%4==0 && y%100!=0 || y%400==0) {
        //     if(m==1 ||m==3||m==5||m==7||m==8||m==10||m==12) {
        //         System.out.println("31 Day");
        //     } else if(m==2) {
        //         System.out.println("29 Day");
        //     } else if(m==4||m==6||m==9||m==11) {
        //         System.err.println("30 Day");
        //     }
        // } else {
        //     if(m==1 ||m==3||m==5||m==7||m==8||m==10||m==12) {
        //         System.out.println("31 Day");
        //     } else if(m==2) {
        //         System.out.println("28 Day");
        //     } else if(m==4||m==6||m==9||m==11) {
        //         System.err.println("30 Day");
        //     }
        // }

        // // WAP TO COUNT HOW MANY TIMES THE DIGIT 3 OCCURS BETWEEN 0-n
        // System.out.println("Enter n");
        // int n = sc.nextInt();
        // int count = 0;
        // for (int i = 0; i <= n; i++) 
        // {
        //     int d=i;
        //     while(d>0)
        //     {
        //         int x = d%10;
        //         if(x == 3) {
        //             count ++;
        //         }
        //         d = d/10;
        //     }
        // }
        // System.out.println("The number of times 3 occurs = " + count);


        // // FIND TOTATL NUMBER OF INTEGERS UPTO n WITH EXACTLY 9 DIVISORS
        // System.out.println("Enter a number n: ");
        // int n = sc.nextInt();
        // int count = 0;
        // int count9div = 0;
        // for(int i = 1; i <= n; i ++) {
        //     int a=1;
        //     count=0;
        //     while(a<=i) {
        //         if(i%a == 0){
        //             count++;
        //         }
        //         a++;
        //     }
        // if(count == 9) {
        //     System.out.println(i+" has 9 divisors");
        //     count9div++;
        //     }
        // }
        // System.out.println("There are total of " + count9div + " numbers with 9 divisors upto " + n);

        
    }
}