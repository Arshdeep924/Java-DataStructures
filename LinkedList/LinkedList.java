// When asked - want to enter mode nodes, enter 'y' to proceed, 'n' to stop

import java.util.*;     
public class LinkedList     
{
    Scanner s=new Scanner(System.in);       
    node start=null;        // Head node
    node ptr;               // Pointer for traversal
    node prev;              // Previous node for deletion/insertion

    // Inner class representing single node of LinkedList
    class node
    {
        int data;           
        node next;
    }

    // Method to create LinkedList from user Input
    void input()
    {
        String choices;
        char choice='y';
        node newNode;

        // do while loop to initiate element of LL
        do
        {
            newNode = new node();
            System.out.println("Enter Any Value:");
            newNode.data=s.nextInt();
            newNode.next=null;
            if(start==null)
            {
                start=newNode;
                ptr=newNode;
            }
            else
            {
                ptr.next=newNode;
                ptr=newNode;
                s.nextLine();
                System.out.println("Want to add more nodes:");
                choices=s.nextLine();
                choice=choices.charAt(0);
            }
        }while(choice=='y');    //Enter y for adding, n for not adding
    }

    // Method to show elements of LL
    void show()
    {
        if(start==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.print("ELEMENTS OF LIST: ");
            node cur=start;
            while(cur!=null)
            {
                System.out.print(cur.data + " ");
                cur=cur.next;
            }
        }
    }

    // Method to add element in starting of LL
    void addFront()
    {
        node newNode=new node();
        System.out.println("Enter Any Value:");
        newNode.data=s.nextInt();
        newNode.next=start;
        start=newNode;
    }

    // Method to add element in middle, before selected element
    void middleb() {
        int counter = 0;
        System.out.println("Enter number to be searched: ");
        int no = s.nextInt();
        node newNode = new node();
        ptr = start;
        while(ptr.next != null){
            if(ptr.data == no){
                counter = 1;
                break;
            }
            prev = ptr;
            ptr = ptr.next;
        }
        if(counter == 1){
            System.out.println("Enter number to be inserted: ");
            newNode.data = s.nextInt();
            newNode.next = prev.next;
            prev.next = newNode;
        }else {
            System.out.println("Number doesn't exist");
        }
    }

    // Method to add element in middle, after selected element
    void middlea() {
        int counter = 0;
        node newNode = new node();
        System.out.println("Enter the number to be searched: ");
        int no = s.nextInt();
        ptr = start;
        while(ptr!=null) {
            if(ptr.data == no){
                counter = 1;
                break;
            }
            ptr = ptr.next;
        }
        if(counter == 1) {
            System.out.println("Enter number to be inserted: ");
            newNode.data = s.nextInt();
            newNode.next = ptr.next;
            ptr.next = newNode;
        }else{
            System.out.println("number doesn't exist");
        }
    }

    // Method to add element at last
    void addLast()
    {
        node newNode=new node();
        System.out.println("Enter Any Value:");
        newNode.data=s.nextInt();
        newNode.next=null;
        node cur=start;
        while(cur.next!=null)
        {
            cur=cur.next;
        }
        cur.next=newNode;
    }

    // Method to Delete initial element
    void deleteFirst(){
        ptr = start;
        start = ptr.next;
    }

    // Method to delete element at last
    void deleteLast(){
        ptr = start;
        while(ptr.next != null){
            prev = ptr;
            ptr = ptr.next;
        }
        prev.next = null;
    }

    // Method to delete element in middle
    void deletemiddle(){
        int counter = 0;
        System.out.println("Enter element to be deleted: ");
        int no = s.nextInt();
        ptr = start;
        while(ptr.next != null){
            if(ptr.data == no){
                counter = 1;
                break;
            }
            prev=ptr;
            ptr=ptr.next;
        }
        if(counter == 1){
            System.out.println("Element deleted: " + ptr.data);
            prev.next = ptr.next;
        }else{
            System.out.println("The number doesn't exist");
        }
    }

    // Main function
    public static void main(String arg[])
    {
        LinkedList ob=new LinkedList();
        int ch = 01;
        Scanner s = new Scanner(System.in);
        while(ch!=10)
        {
            System.out.println("\n1.Create a List");
            System.out.println("2.Show elements");
            System.out.println("3.Add At Front");
            System.out.println("4.Add At Last");
            System.out.println("5.Add before any element in Middle");
            System.out.println("6.Add after any element in Middle");
            System.out.println("7.Delete first element");
            System.out.println("8.Delete last element");
            System.out.println("9.Delete any element in middle");
            System.out.println("Enter ur choice:");
            ch=s.nextInt();
            if(ch==1)
                ob.input();
            else if(ch==2)
                ob.show();
            else if(ch==3)
                ob.addFront();
            else if(ch==4)
                ob.addLast();
            else if(ch==5)
                ob.middleb();
            else if(ch==6)
                ob.middlea();
            else if(ch==7)
                ob.deleteFirst();
            else if(ch==8)
                ob.deleteLast();
            else if(ch==9)
                ob.deletemiddle();
        }
    s.close();
    }
}