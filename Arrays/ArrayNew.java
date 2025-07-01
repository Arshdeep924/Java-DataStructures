import java.util.Scanner;

class ArrayNew {
    Scanner sc = new Scanner(System.in);
    int i;
    int ele;
    double sum = 0.0;
    double avg;
    int arr[];
    void printArr() 
    {
        System.out.println("Enter no. of elements you need:");
        ele=sc.nextInt();
        arr=new int[ele];
        for(i = 0; i < arr.length; i++) {
            System.out.println("Enter Array elements: ");
            arr[i] = sc.nextInt();
        }
    } 
    // void showArr() {
    //     for(i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //         sum += arr[i];
    //     }
    //     avg =(sum/arr.length);
    //     System.out.println("\nThe sum of elements of the array is: " + sum);
    //     System.out.println("The average of elements of the array is: " + avg);
    // }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.printArr();
    //     ob.showArr();
    // }

    // // WAP TO INPUT ELEMENTS IN AN ARRAY AND PRINT ONLY THOSE DIVISIBLE BY 9 AND 5 
    // void printArr() {
    //     System.out.println("Enter number of elements needed: ");
    //     ele =  sc.nextInt();
    //     arr = new int[ele];
    //     for (i = 0; i < arr.length; i ++) {
    //         System.out.println("Enter element " + i + " : ");
    //         arr[i] = sc.nextInt();
    //     }
    // }
    // void showArr() {
    //     System.out.println("The eligible elements are : ");
    //     for(i = 0; i < arr.length; i++) {
    //         if(arr[i]%5 == 0 && arr[i]%9 == 0){
    //             System.out.println(arr[i]);
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.printArr();
    //     ob.showArr();
    // }

    // WAP TO INPUT ELEMENTS IN AN ARRAY AND PRINT ONLY THOSE BEING PALINDROMES
    // void printArr() {
    //     System.out.println("Enter number of elements needed: ");
    //     ele =  sc.nextInt();
    //     arr = new int[ele];
    //     for (i = 0; i < arr.length; i ++) {
    //         System.out.println("Enter element " + i + " : ");
    //         arr[i] = sc.nextInt();
    //     }
    // }
    // int rev = 0;
    // void showArr() {
    //     System.out.println("The eligible elements are : ");
    //     for(i = 0; i < arr.length; i++) {
    //         int n=arr[i];
    //         rev=0;
    //         while(n>0) {
    //         int rem = n%10;
    //         rev = rev*10 + rem;
    //         n=n/10;
    //         } if(rev==arr[i]) {
    //             System.out.println(arr[i]);
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.printArr();
    //     ob.showArr();
    // }

    // // WAP TO INPUT ELEMENTS AND PRINT THEM IN REV ORDER
    // void printArr() {
    //     System.out.println("Enter number of elements needed: ");
    //     ele =  sc.nextInt();
    //     arr = new int[ele];
    //     for (i = 0; i < arr.length; i ++) {
    //         System.out.println("Enter element " + i + " : ");
    //         arr[i] = sc.nextInt();
    //     }
    // }
    // int rev = 0;
    // void showArr() {
    //     System.out.println("The reversed elements are : ");
    //     for(i = 0; i < arr.length; i++) {
    //         int n=arr[i];
    //         rev=0;
    //         while(n>0) {
    //         int rem = n%10;
    //         rev = rev*10 + rem;
    //         n=n/10;
    //         } 
    //         System.out.println(rev);
    //     }
    // }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.printArr();
    //     ob.showArr();
    // }

    // WAP TO INPUT ELEMENTS AND A SINGLE ELEMENT AND CHECK IF THAT SINGLE ELEMENT IS A PART OF THE ARRAY
    // int x,c=0;
    // void printArr() {
    //     System.out.println("Enter number of elements needed: ");
    //     ele =  sc.nextInt();
    //     arr = new int[ele];
    //     for (i = 0; i < arr.length; i ++) {
    //         System.out.println("Enter element " + i + " : ");
    //         arr[i] = sc.nextInt();
    //     }
    //     System.out.println("Enter the verifying element: ");
    //     x = sc.nextInt();
    // }
    // void showArr() {
    //     for(i = 0; i < arr.length; i++) {
    //         if(arr[i] == x) {
    //             System.out.println("The element " + x + " exists at " + i);
    //             c=1;
    //          //   break;
    //         }
    //         }
    //         if(c==0)
    //         {
    //             System.out.println("The element doesnt exist");
    //         }
    // }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.printArr();
    //     ob.showArr();
    // }
    

    // // WAP TO INPUT ELEMENSTS IN AN ARRAY, A NO. AND A POSITION AND ADD THE NUMBER AT THE SPECIFIED POSITION
    // int f,g;
    // void printArr() {
    //     System.out.println("Enter number of elements needed: ");
    //     ele =  sc.nextInt();
    //     arr = new int[ele+1];
    //     for (i = 0; i < arr.length-1; i ++) {
    //         System.out.println("Enter element " + i + " : ");
    //         arr[i] = sc.nextInt();
    //     }
    //     System.out.println("Enter the Additional element: ");
    //     f = sc.nextInt();
    //     System.out.println("Enter the position where you want to insert it: ");
    //     g = sc.nextInt();
    //     if(g>=0 && g<arr.length)
    //     {
    //         for(i=arr.length-1;i>g;i--)
    //         {
    //             arr[i]=arr[i-1];
    //         }
    //         arr[i]=f;
    //         showArr();
    //     }
    //     else{
    //         System.out.println("Invalid array index");
    //     }
    // }
    // void showArr() {
    //     System.out.println("The elements are: ");
    //     for(i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i]);
    //     }
    // }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.printArr();
    //     //ob.showArr();
    // }


    // // WAP TO INPUT ELEMENTS IN AN ARRAY AND COPY THE EVEN AND ODD ELEMENTS IN DIFF ARRAYS AND PRINT THEM
    // int evenArr[];
    // int oddArr[];
    // void showArr() {
    //     System.out.println("Enter no. of elements needed: ");
    //     ele = sc.nextInt();
    //     arr = new int[ele];
    //     for(i = 0; i < arr.length; i++) {
    //         System.out.println("Enter element" + i + " : ");
    //         arr[i] = sc.nextInt();
    //     }
    //     evenArr=new int[ele];
    //     oddArr=new int[ele];
    // }
    // int evenCount = 0;
    // int oddCount = 0;
    // void printArr() {
    //     for(i = 0; i < arr.length; i++) {
    //         if(arr[i]%2 == 0){
    //             evenArr[evenCount]=arr[i];
    //             evenCount++;
    //         }else{
    //            oddArr[oddCount]=arr[i];
    //            oddCount++;
    //         }
    //     }
    //     System.out.println("Even elements: ");
    //     for(i = 0; i<evenCount; i++) {
    //         System.out.println(evenArr[i]);
    //     }
    //     System.out.println("Odd elements: ");
    //     for(i = 0; i < oddCount; i++) {
    //         System.out.println(oddArr[i]);
    //     }
    // }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.showArr();
    //     ob.printArr();
    // }


    // // WAP TO INPUT ELEMENTS AND PRINT ONLY THOSE THAT CONTAIN ZERO
    // void showArr() {
    //     System.out.println("Enter number of elements needed: ");
    //     ele = sc.nextInt();
    //     arr = new int[ele];
    //     for(i = 0; i < arr.length; i++) {
    //         System.out.println("Enter element " + i + " : ");
    //         arr[i] = sc.nextInt();
    //     }
    // }
    // int rem;
    // void printArr() {
    //     System.out.println("The elements containing 0 are: ");
    //     for(i = 0; i < arr.length; i++) {
    //         int n = arr[i];
    //         while(n>0) {
    //             rem = n%10;
    //             n /= 10;
    //             if(rem == 0){
    //                 System.out.println(arr[i]);
    //             }
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.showArr();
    //     ob.printArr();
    // }


    // // WAP TO INPUT ELEMENTS IN AN ARRAY AND PRINT ONLY ALTERNATE ELEMENTS
    // void showArr() {
    //     System.out.println("Enter the no. of elements needed:");
    //     ele = sc.nextInt();
    //     arr = new int[ele];
    //     for(i = 0; i< arr.length; i++) {
    //         System.out.println("Enter element " + i + ": ");
    //         arr[i] = sc.nextInt();
    //     }
    // }
    // void printArr() {
    //     System.out.println("The alternative elements are: ");
    //     for(i = 0; i < arr.length; i += 2){
    //         System.out.println(arr[i]);
    //     }
    // }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.showArr();
    //     ob.printArr();
    // }


    // // WAP TO INPUT ELEMEMTS AND A NUMBER, DELETE THE NUMBER FROM THE ARRAY IF EXISTS
    // int f,g=-1;
    // void printArr() {
    //     System.out.println("Enter number of elements needed: ");
    //     ele =  sc.nextInt();
    //     arr = new int[ele+1];
    //     for (i = 0; i < arr.length-1; i ++) {
    //         System.out.println("Enter element " + i + " : ");
    //         arr[i] = sc.nextInt();
    //     }
    //     System.out.println("Enter the Additional element: ");
    //     f = sc.nextInt();
    //     for(i=0;i<arr.length;i++)
    //     {
    //         if(arr[i]==f)
    //         {
    //             g=i;
    //             break;
    //         }
    //     }
    //     if(g==-1)
    //     {
    //         System.out.println(f+" Not Exist In Array");
    //     }
    //     else
    //     {
    //         for(i=g;i<arr.length;i++)
    //         {
    //             if(i<arr.length-1)
    //             {
    //                 arr[i]=arr[i+1];
    //             }
    //         }
    //         showArr();
    //     }
    // }
    // void showArr() {
    //     System.out.println("The elements are: ");
    //     for(i = 0; i < arr.length-1; i++) 
    //     {
    //         System.out.println(arr[i]);
    //     }
    // }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.printArr();
    //     ob.showArr();
    // }
    // -----------------------------------------------------------------------------------------------------------------

    // // 2D ARRAYS
    int j;
    int r;
    int c;
    int ar[][];
    // // WAP TO INPUT ELEMENTS IN A 2D ARRAY AND PRINT THEM
    // void showArr() {
    //     System.out.println("Enter number of rows");
    //     r = sc.nextInt();
    //     System.out.println("Enter number of columns");
    //     c = sc.nextInt();
    //     ar = new int[r][c];
    //     for(i = 0; i < r; i++){
    //         for(j = 0; j < c; j++){
    //             System.out.println("Enter the elements: ");
    //             ar[i][j] = sc.nextInt();
    //         }
    //     }
    // }
    // void printArr() {
    //     System.out.println("The elements are: ");
    //     for(i = 0; i < r; i++) {
    //         for(j = 0; j < c; j++) {
    //             System.out.print(ar[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.showArr();
    //     ob.printArr();
    // }


    // // WAP TO INPUT ELEMENTS IN A 2D ARRAY AND PRINT THEM IN REV ORDER
    // void showArr() {
    //     System.out.println("Enter the number of rows: ");
    //     r = sc.nextInt();
    //     System.out.println("Enter the number of columns: ");
    //     c = sc.nextInt();
    //     ar = new int[r][c];
    //     for(i = 0; i < r; i++) {
    //         for(j = 0; j < c; j++) {
    //             System.out.println("Enter the elements: ");
    //             ar[i][j] = sc.nextInt();
    //         }
    //     }
    // }
    // void printArr() {
    //     System.out.println("The elements are: ");
    //     for(i = r-1; i >= 0; i--){
    //         for(j = c-1; j >= 0; j--){
    //             System.out.print(ar[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.showArr();
    //     ob.printArr();
    // }

    
    // // WAP TO INPUT ELEMENTS IN A 2D ARRAY AND PRINT THE DIAGONAL ELEMENTS
    // void showArr() {
    //     System.out.println("Enter the number of rows: ");
    //     r = sc.nextInt();
    //     System.out.println("Enter the number of columns: ");
    //     c = sc.nextInt();
    //     ar = new int[r][c];
    //     for(i = 0; i < r; i++) {
    //         for(j = 0; j < c; j++) {
    //             System.out.println("Enter the elements: ");
    //             ar[i][j] = sc.nextInt();
    //         }
    //     }
    // }
    // void printArr() {
    //     System.out.println("The elements are: ");
    //     for(i = 0; i < r; i++){
    //         for(j = 0; j < c; j++){
    //             if(i == j){
    //                 System.out.print(ar[i][j] + " ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.showArr();
    //     ob.printArr();
    // }

    // // WAP TO INPUT ELEMENTS IN A 2D ARRAY AND PRINT REV DIAGNOLS
    // void showArr() {
    //     System.out.println("Enter the number of rows: ");
    //     r = sc.nextInt();
    //     System.out.println("Enter the number of columns: ");
    //     c = sc.nextInt();
    //     ar = new int[r][c];
    //     for(i = 0; i < r; i++) {
    //         for(j = 0; j < c; j++) {
    //             System.out.println("Enter the elements: ");
    //             ar[i][j] = sc.nextInt();
    //         }
    //     }
    // }
    // void printArr() {
    //     System.out.println("The elements are: ");
    //     c--;
    //     for(i = 0; i < r; i++){
    //         System.out.print(ar[i][c] + " ");
    //         c--;
    //     }
    //     System.out.println();
    // }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.showArr();
    //     ob.printArr();
    // }
    

    // // WAP TO INPUT ELEMENTS IN A 2D ARRAY AND PRINT THE TRANSPOSE OF THE MATRIX
    // void showArr() {
    //     System.out.println("Enter the number of rows: ");
    //     r = sc.nextInt();
    //     System.out.println("Enter the number of columns: ");
    //     c = sc.nextInt();
    //     ar = new int[r][c];
    //     for(i = 0; i < r; i++) {
    //         for(j = 0; j < c; j++) {
    //             System.out.println("Enter the elements: ");
    //             ar[i][j] = sc.nextInt();
    //         }
    //     }
    // }
    // void printArr() {
    //     if(i == j){
    //         System.out.println("The elements are: ");
    //         for(i = 0; i < r; i++){
    //             for(j = 0; j < c; j++){
    //                 System.out.print(ar[j][i] + " ");
    //             }
    //         System.out.println();
    //         }
    //     }else{
    //         System.out.println("Transpose possible only for matrix with no. of rows == columns");
    //         System.out.println("The original matrix is: " + ar[i][j]);
    //     }
    // }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.showArr();
    //     ob.printArr();
    // }


    // // WAP TO INPUT ELEMENTS IN A MATRIX AND INVERTED RIGHT TRIANGLE PATTERN
    // void showArr() {
    //     System.out.println("Enter the number of rows: ");
    //     r = sc.nextInt();
    //     System.out.println("Enter the number of columns: ");
    //     c = sc.nextInt();
    //     ar = new int[r][c];
    //     for(i = 0; i < r; i++) {
    //         for(j = 0; j < c; j++) {
    //             System.out.println("Enter the elements: ");
    //             ar[i][j] = sc.nextInt();
    //         }
    //     }
    // }
    // void printArr() {
    //         System.out.println("The elements are: ");
    //         for(i = 0; i <r; i++) {
    //             for(j = 0; j < c; j++){
    //                 System.out.print(ar[i][j] + " ");
    //             }
    //             c--;
    //             System.out.println();
    //         }
    //     }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.showArr();
    //     ob.printArr();
    // }


    // // WAP TO INPUT ELEMENTS IN AN ARRAY AND PRINT RIGHT TRIANGLE PATTERN
    // void showArr() {
    //     System.out.println("Enter the number of rows: ");
    //     r = sc.nextInt();
    //     System.out.println("Enter the number of columns: ");
    //     c = sc.nextInt();
    //     ar = new int[r][c];
    //     for(i = 0; i < r; i++) {
    //         for(j = 0; j < c; j++) {
    //             System.out.println("Enter the elements: ");
    //             ar[i][j] = sc.nextInt();
    //         }
    //     }
    // }
    // void printArr() {
    //         System.out.println("The elements are: ");
    //         for(i = 0; i <r; i++) {
    //             for(j = 0; j <= i; j++){
    //                 System.out.print(ar[i][j] + " ");
    //             }
    //             System.out.println();
    //         }
    //     }
    // public static void main(String[] args) {
    //     ArrayNew ob = new ArrayNew();
    //     ob.showArr();
    //     ob.printArr();
    // }
    

    


}