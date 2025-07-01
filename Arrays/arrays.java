
class Firstclass{
//     @SuppressWarnings("empty-statement")
//     public static void main(String args[]) {
        // output 
        // String name = "Tony Stark";
        // int a = 25;
        // int b = 10;
        // double price = 25.25;
        // int sum  = a+b;
        // int diff = a-b;
        // System.out.println(sum);
        // System.out.println(diff);
        // int ans = (a*b)/(a-b);
        // System.out.println(ans);
        // INPUT - for string **************************
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println(name);
        // INPUT - for int, float **********************
        // int name = sc.nextInt();
        // float name = sc.nextFloat();
        // **********************************************
        // CODE TO INPUT 2 NOS AND OUTPUT THEIR SUM
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println(sum);
        // ***********************************************
        // PROGRAM TO FIND ADULT OR NOT WITH INPUT AGE
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age>18) {
        //     System.out.println("Adult");
        // } else {
        //     System.out.println("Not adult");
        // }
        // ************************************************
        // PROGRAM TO CHECK ODD OR EVEN NO.
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // if(x%2 == 0){
        //     System.out.println("Even Number");
        // }  else{
        //         System.out.println("Odd number");
        // }
        // ************************************************
        // PROGRAM TO TAKE 2 NOS AS INPUT AND CHECK IF >,<,=
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a>b){
        //     System.out.println("A is greater than b");
        // } else if(a<b){
        //     System.out.println("A is lesser then b");
        // } else{
        //     System.out.println("A is equal to B");
        // }
        // ************************************************
        // PROGRAM TO PRINT THE GREETING BY INPUTTING SPECIFIC NUMBER

        // WITH IF ELSE*******
        // Scanner sc = new Scanner(System.in);
        // int button  = sc.nextInt();
        // if(button == 1){
        //     System.out.println("Hello");
        // } else if(button == 2){
        //     System.out.println("Namaste");
        // } else if(button == 3){
        //     System.out.println("Bonjour");
        // } else{
        //     System.out.println("Hola");
        // }

        // WITH SWITCH STATEMENT*******
        // Scanner sc = new Scanner(System.in);
        // int button = sc.nextInt();
        // switch(button){
        // case 1: System.out.println("Hello");
        // break;
        // case 2: System.out.println("Namaste");
        // break;
        // case 3: System.out.println("bonjour");
        // break;
        // default: System.out.println("Good morning");
        // }

        // FOR LOOPS*****************************
        // TO PRINT HELLO NO. OF TIMES
        // for(int counter = 0;counter<10;counter = counter+1){
        //     System.out.println("Hello");
        // }
        // // TO PRINT NOS 0-10
        // for(int counter = 0; counter<11; counter ++){
        //     System.out.println(counter);
        // }
        
        // WHILE LOOP***************************
        // TO PRINT 0-10
        // int i = 0;
        // while(i<11){
        //     System.out.println(i);
        //     i ++;
        // }

        // DO WHILE LOOP***************************
        // int i = 0;
        // do { 
        //     System.out.println(i);
        //     i ++;
        // } while (i<11);

        // TO PRINT SUM OF FIRST n NATURAL NOS.
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i = 0;i<=n;i++){
        //     sum = sum+i;
        // }
        // System.out.println(sum);
        
        // PRINT TABLE OF A NUMBER INPUT BY USER
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for(int i = 1;i<=10;i++){
        // System.out.println(n*i);
        //  }
   
        public static void main(String[] args) {
            String str1 = "hello Good morning";
            String old_str = "Good";
            String new_str = "Very good";

            String resultstr = str1.replaceAll(old_str, new_str);
            System.out.println(resultstr);
        }






}


