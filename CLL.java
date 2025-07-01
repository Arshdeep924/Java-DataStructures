
import java.util.Scanner;

public class CLL{
    String choice;
    Scanner s=new Scanner(System.in);
    node start=null,ptr,prev,newnode;
    class node
    {
        int data;
        node next;
    }
    void create(){
        do { 
            newnode = new node();
            System.out.println("Enter number to add: ");
            newnode.data = s.nextInt();
            s.nextLine();
            if(start == null){
                start = newnode;
                ptr = newnode;
                newnode.next = start;
            }else{
                ptr.next = newnode;
                newnode.next = start;
                ptr = newnode;
            }
            System.out.println("Want to enter more nodes?");
            choice = s.nextLine().toLowerCase();  
        } while (choice.equals("y"));
    }
    
    void showList()
    {
        System.out.println("Elements of list ");
        ptr=start;
        System.out.println(ptr.data+" ");
        ptr=ptr.next;
        while(ptr!=start)
        {
            System.out.println(ptr.data+" ");
            ptr=ptr.next;
        }
    }

    void addFront(){
        newnode = new node();
        System.out.println("Enter a number: ");
        newnode.data = s.nextInt();
        ptr = start;
        ptr = ptr.next;
        while(ptr.next!= start){
            ptr = ptr.next;
        }
        ptr.next = newnode;
        newnode.next=start;
        start = newnode;
    }

    void addLast(){
        newnode = new node();
        System.out.println("Enter number to be inserted: ");
        newnode.data = s.nextInt();
        ptr = start;
        ptr = ptr.next;
        while(ptr.next!=start){
            ptr = ptr.next;
        }
        ptr.next = newnode;
        newnode.next = start;
    }

    void middleB(){
        int counter = 0;
        newnode = new node();
        System.out.println("ENter a number to be inserted: ");
        newnode.data = s.nextInt();
        ptr = start;
        prev=ptr;
        ptr = ptr.next;
        System.out.println("ENter number to where input number is to be inserted in front of: ");
        int no = s.nextInt();
        while(ptr.next != start){
            if(ptr.data == no){
                counter = 1;
                break;
            }
            prev = ptr;
            ptr = ptr.next;
        }
        System.out.println(prev.data);
        if(counter == 1){
            newnode.next = prev.next;
            prev.next = newnode;
        }else{
            System.out.println("number doesn't exist");
        }
    }

    void middleA(){
        int counter = 0;
        newnode = new node();
        System.out.println("ENter a number to be inserted: ");
        newnode.data = s.nextInt();
        ptr = start;
        prev = ptr;
        ptr = ptr.next;
        System.out.println("ENter number to where input number is to be inserted afterwards: ");
        int no = s.nextInt();
        while(ptr != start){
            System.out.println(ptr.data);
            if(ptr.data == no){
                counter = 1;
                break;
            }
            ptr = ptr.next;
        }
        System.out.println(prev.data);
        if(counter == 1){
            newnode.next = ptr.next;
            ptr.next = newnode;
        }else{
            System.out.println("number doesn't exist");
        }
    }
    void deleteF(){
        ptr = start;
        ptr = ptr.next;
        while(ptr.next != start){
            ptr = ptr.next;
        }
        ptr.next = start.next;
        start = start.next;
    }
    
    void deleteL(){
        ptr = start;
        ptr = ptr.next;
        while(ptr.next != start){
            prev=ptr;
            ptr = ptr.next;
        }
        prev.next=start;
    }

    void deleteM(){
        int counter = 0;
        System.out.println("Enter the number to be searched: ");
        int no = s.nextInt();
        ptr = start;
        ptr = ptr.next;
        while(ptr != start){
            if(ptr.data == no){
                counter = 1;
                break;
            }
            prev = ptr;
            ptr = ptr.next;
        }

        if(counter == 1){   
            prev.next = ptr.next;
        }else{
            System.out.println("No. doesnt exist!");
        }
    }


    

    public static void main(String arg[])
    {
        CLL ob=new CLL();
        ob.create();
        ob.showList();
        // ob.addFront();
        // ob.showList();
        // ob.addLast();
        // // ob.showList();
        // ob.middleB();
        // ob.showList();
        // ob.middleA();
        // ob.showList();
        //ob.deleteF();
        //ob.showList();
        ob.deleteL();
        ob.showList();
        ob.deleteM();
        ob.showList();
    }
}
