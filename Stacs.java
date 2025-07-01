import java.util.Scanner;

class Stacs{
    int sta[];
    int size, top = -1, n;
    Scanner s = new Scanner(System.in);

    // void info(){
    //     System.out.println("Enter size of stack");
    //     size = s.nextInt();
    //     sta = new int[size];
    // }

    // void push(){        
    //     System.out.println("Enter elements: ");
    //     n = s.nextInt();
    //     isfull();
    // }

    // void isfull(){
    //     try
    //     {
    //     if(top<size)
    //     {
    //         top++;
    //         sta[top] = n;   
    //     } 
    // }
    // catch(Exception ex)
    // {
    //         System.out.println("Stack is full!");   
    // }
    // }

    // void show(){
    //     isempty();
    //     try
    //     {
    //     for (int i = top; i >= 0; i--){
    //         System.out.println(sta[i]);
    //     }
    //     }
    //     catch(Exception ex)
    //     {
    //     }
    // }

    // void isempty()
    // {
    //     if(top==-1)
    //     {
    //         System.out.println("Stack is empty");
    //     }
    // }

    // void peek()
    // {
    //     try{
    //     isempty();
    //     System.out.println("Top most stack element="+sta[top]);}
    //     catch(Exception ex)
    //     {
    //     }
    // }
    
    // void pop(){
    //     try{
    //     isempty();
    //     System.out.println(sta[top]);
    //     top--;
    //     }
    //     catch(Exception ex)
    //     {}
    // }
    // public static void main(String[] args) {
    //     int choice=0;
    //     Scanner s=new Scanner(System.in);
    //     Stacs ob = new Stacs();
    //     ob.info();
    //     while(choice!=5)
    //     {
    //         System.out.println("1.Push");
    //         System.out.println("2.Pop");
    //         System.out.println("3.Peek");
    //         System.out.println("4.Show Stack Elements");
    //         System.out.println("5.Exit");
    //         System.out.println("Enter Your Choice");
    //         choice=s.nextInt();
    //         if(choice==1)
    //         {
    //             ob.push();
    //         }
    //         else if(choice==2)
    //         {
    //             System.out.println("Remove an element");

    //             ob.pop();
    //         }
    //         else if(choice==3)
    //         {
    //             ob.peek();
    //         }
    //         else if(choice==4)
    //         {
    //             System.out.println("Element of stack: ");
    //             ob.show();
    //         }
    //     }
    // }


    // --------------------------------------------------------------------------------

    String stac[];
    String str="";

    void info(){
        System.out.println("Enter the size of stack");
        size = s.nextInt();
        stac = new String[size];
    }

    void push(){
        System.out.println("Enter String elements");
        str = s.next();
        isfull();
    }

    void isfull(){
        try {
            if(top<size){
                top++;
                stac[top] = str;
            }
        } catch (Exception e) {
            System.out.println("Stack is full");
        }
    }

    void isempty(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
    }

    void pop(){
        try {
            isempty();
            System.out.println("Top most stack element " + stac[top] + " is now popped");
            top--;
        } catch (Exception e) {
        }
    }
    
    void peek(){
        try {
            isempty();
            System.out.println(stac[top]);
        } catch (Exception e) {
        }
    }

    void checkPalind(){
        isempty();
        String newstr = "";
        for (int i = top; i >= 0; i--) 
        {
            str=stac[i];
            newstr="";
            for(int j = str.length()-1; j >= 0; j--){
                newstr = newstr + str.charAt(j);
            }
            if(newstr.equalsIgnoreCase(str)){
                System.out.println("The palindrome strings are: " + newstr);
            }
        }
    }

    void doRev(){
        isempty();
        String newstrs = "";
        for(int i = top; i >= 0; i--){
            newstrs="";
            for(int j = stac[i].length()-1; j >= 0; j--){
                newstrs = newstrs + stac[i].charAt(j);
            }
            System.out.println(newstrs);
        } 
    }
    
    void searchStac(){
        s.nextLine();
        System.out.println("Enter a string to be searched among stack elements: ");
        String sr = s.nextLine();
        int counter = 0;
        for(int i = top; i >= 0; i--){
            if(sr.equals(stac[i])){
                counter = 1;
                System.out.println(stac[i]+" found in stack");
                break;
            }
        }
        if(counter == 0){
            System.out.println("Not found");
        }
    }

    void show(){
        isempty();
        try {
            for(int i = top; i >= 0; i--){
                System.out.println("The elements are: " + stac[i]);
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        int choice = 0;
        Scanner se = new Scanner(System.in);
        Stacs ob = new Stacs();
        ob.info();
        while(choice != 8){
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEK");
            System.out.println("4. SHOW ELEMENTS");
            System.out.println("5. PRINT PALINDROME STRINGS");
            System.out.println("6. PRINT REVERSED STRING ELEMENTS");
            System.out.println("7. SEARCH STRING ELEMENTS");
            System.out.println("8. Exit\nCHOOSE ANY OPTION");
            choice = se.nextInt();
            if(choice ==1){
                ob.push();
            }else if (choice ==2) {
                ob.pop();
            }else if(choice ==3){
                ob.peek();
            }else if(choice ==4){
                ob.show();
            }else if(choice ==5){
                ob.checkPalind();
            }
            else if(choice==6){
                ob.doRev();
            }else if(choice == 7){
                ob.searchStac();
            }
        }
    }
}