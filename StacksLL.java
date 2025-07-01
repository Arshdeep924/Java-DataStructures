import java.util.Scanner;

public class StacksLL{
    node top=null;
    int counter=0;
    Scanner s=new Scanner(System.in);
    class node{
        int data;
        node next;
    }
    void push()
    {
        if(counter<=10)
        {
        node newnode=new node();
        System.out.println("Enter value to add in stack:");
        newnode.data=s.nextInt();
        if(top==null)
        {   newnode.next=null;
            top=newnode;
            counter++;
        }
        else
        {
            newnode.next=top;
            top=newnode;
            counter++;
        }
        }
        else
        {
            isfull();
        }
    }

    void isfull()
    {
        if(counter==10)
        System.out.println("Stack is full");
    }

    void isempty(){
        if(top == null){
            System.out.println("Stack is empty");
        }
    }

    void pop()
    {
        try{
        isempty();
        System.out.println("The top element " + top.data + " is now popped" );
        top = top.next;
        }
        catch(Exception ex){}
        }

    void peek(){
        try{
        isempty();
        System.out.println("The top element is " + top.data);
        }
        catch(Exception ex)
        {}
    }

    void showStack()
    {
        while(top!=null)
        {
            System.out.println("Stack elements are: " + top.data);
            top=top.next;
        }
    }

    public static void main(String[] args) {
        StacksLL ob=new StacksLL();
        int choice=0;
        Scanner s=new Scanner(System.in);
        while(choice!=5)
        { 
            System.out.println("1.Push");
            System.out.println("2.Show Stack");
            System.out.println("3.Pop");
            System.out.println("4.Peek");
            System.out.println("5.Exit");
            System.out.println("Enter ur choice:");
            choice=s.nextInt();
            if(choice==1)
                ob.push();
            else if(choice==2)
                ob.showStack();
            else if(choice==3)
                ob.pop();
            else if(choice==4)
                ob.peek();
        }
    }
}