class patternsclass{
    /**
     * @param args
     */
    @SuppressWarnings("empty-statement")
    public static void main(String args[]){

    // PROGRAM TO PRINT SOLID RECTANGLE PATTERN*******************
    //  for(int i = 1;i<=4;i++){
    //     System.out.println("*****");
    //  }

    // MORE COMPLEX BUT GOOD CODING WITH ROWS=OUTER LOOPS AND COLUMNS=INNER LOOPS
    // int n = 4;
    // int m = 5;
    // for(int i = 1;i<=n;i++){
    //     for(int j = 1;j<=m;j++){
    //         System.out.print("x");
    //     }
    //     System.out.println();
    // }

    // PROGRAM TO PRINT HOLLOW RECTANGLE PATTERN******************
    // int n = 4;
    // int m = 5;
    // // OUTER LOOP
    // for(int i = 1;i<=n;i++){
    //     // INNER LOOP
    //     for(int j=1;j<=m;j++){
    //         // MAIN THEORY - PATTERN IS ONLY PRINTED IN AREAS WHERE i and j ARE EITHER 1 OR n
    //         if(i == 1 || j == 1 || i == n || j == m){
    //             System.out.print("*");
    //             }else {
    //                 System.out.print(" ");
    //         }
    //     }System.out.println();

    // PROGRAM TO PRINT HALF PYRAMID/RIGHT-ANGLE TRIANGLE PATTERN**************
    // int n = 4;
    // for(int i = 1;i<=n;i++) {
    //     for(int j = 1;j<=i;j++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // PROGRAM TO PRINT INVERTED HALF PYRAMID
    // int n = 4;
    // for(int i = n;i>=1;i--){
    //     for(int j = 1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // PROGRAM TO PRINT HALF PYRAMID MIRROR IMAGE

    // int n = 4;
    // // OUTER LOOP
    // for(int i = 1;i<=n;i++) {
    //     // INNER LOOP TO PRINT SPACES
    //     for(int j=1; j<=n-i; j++){
    //         System.out.print(" ");
    //     }
    //     // INNER LOOP TO PRINT STARS
    //     for(int j=1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // PROGRAM TO PRINT HALF PYRAMID WITH NUMBERS
    // int n = 5;
    // for(int i =1;i<=n;i++) {
    //     for(int j = 1;j<=i;j++) {
    //         System.out.print(j + " ");
    //     }
    //     System.out.println();
    // }

    // PROGRAM TO PRINT INVERTED HALF PYRAMID WITH NOS.
    // int n = 5;
    // for(int i=n; i>=1; i--){
    //     for(int j = 1; j<=i; j++){
    //         System.out.print(j + " ");
    //     }
    //     System.out.println();
    // }

    // PROGRAM TO PRINT FLOYD'S TRIANGLE
    // int n = 5;
    // int number = 1;
    // // OUTER LOOP
    // for(int i = 1;i<=n;i++){
    //     // INNER LOOP
    //     for(int j = 1;j<=i;j++){
    //         System.out.print(number + " ");
    //         number++;
    //     }
    //     System.out.println();
    // }

    // PROGRAM TO PRINT 0-1 TRIANGLE
    // int n = 5;
    // // OUTER LOOP
    // for(int i = 1;i<=n;i++){
    //     // INNER LOOP
    //     for(int j = 1;j<=i;j++){
    //         if((i+j)%2==0){
    //             System.out.print("1 ");
    //         }
    //         else{
    //             System.out.print("0 ");
    //         }
    //     }
    //     System.out.println();
    // }

    // PROGRAM TO PRINT BUTTERFLY PATTERN
    // int n = 5;
    // // UPPER HALF
    // for(int i=1; i<=n; i++){
    //     // FIRST PART
    //     for(int j = 1; j<=i;j++){
    //         System.out.print("*");
    //     }
    //     // SPACES TO BE PUT IN
    //     int spaces = 2*(n-i);
    //     for(int j = 1; j<=spaces; j++){
    //         System.out.print(" ");
    //     }
    //     // SECOND PART
    //     for(int j = 1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // // LOWER HALF (COPY PASTE UPPER HALF AND REVERSE CONDITIONS IN FOR(INT I) LOOP)
    // for(int i=n; i>=1; i--){
    //     // FIRST PART
    //     for(int j = 1; j<=i;j++){
    //         System.out.print("*");
    //     }
    //     // SPACES TO BE PUT IN
    //     int spaces = 2*(n-i);
    //     for(int j = 1; j<=spaces; j++){
    //         System.out.print(" ");
    //     }
    //     // SECOND PART
    //     for(int j = 1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // PROGRAM TO PRINT SOLID RHOMBUS/TILTED PARALLELOGRAM PATTERN
    int n = 5;
    for(int i=1;i<=n;i++){
        // SPACES 
        for(int j=1; j<=n-i;j++){
            System.out.print(" ");
        }
        


    }





    }
}
