import java.util.*;
public class DLL{
    Scanner s = new Scanner(System.in);
    node start = null;
    node ptr,pre;
    class node{
        int data;
        node prev;
        node next;
    }
    void create()
    {
        String choice="y";
        do
        {
        node newNode = new node();
        System.out.println("Enter a number: ");
        newNode.data = s.nextInt();
        newNode.next = null;
        s.nextLine();
        if(start == null) {
            newNode.prev = null;
            start = newNode;
            ptr = newNode;
        }else{
            newNode.prev = ptr;
            ptr.next = newNode;
            ptr = newNode;
        }
        System.out.println("Want to add more nodes");
        choice=s.nextLine().toLowerCase();
    }while(choice.equals("y"));
 }
    void displayForw(){
        ptr = start;
        System.out.println("Elements of list: ");
        while(ptr != null){
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }
    void displayBack(){
        ptr = start;
        System.out.println("Elements of list: ");
        while(ptr.next != null){
            ptr = ptr.next;
        }
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.prev;
        }
    }
    void addF() {
        node newNode = new node();
        System.out.println("Enter element to be added at first");
        newNode.data = s.nextInt();
        newNode.next = start;
        start = newNode;

    }
    void addL(){
        node newNode = new node();
        System.out.println("Enter an element to be added at last");
        newNode.data = s.nextInt();
        newNode.next = null;
        node cur = start;
        while(cur.next!=null){
            cur = cur.next;
        }
        cur.next = newNode;
    }

    void deleteFirst(){
        ptr = start;
        start = ptr.next;
    }

    void deleteMiddle(){
        int counter = 0;
        ptr = start;
        System.out.println("Enter the number to be deleted");
        int no = s.nextInt();
        while(ptr.next != null){
            if(ptr.data == no){
                counter = 1;
                break;
            }
            pre = ptr;
            ptr = ptr.next;
        }
        if(counter == 1){
            pre.next = ptr.next;
            (ptr.next).prev = pre.next;
        }
    }
     
    void deleteLast() {
        ptr = start;
        while(ptr.next != null){
            pre = ptr;
            ptr = ptr.next;
        }
        pre.next = null;
        pre.prev=pre;
    }


    void middleB(){
        int counter = 0;
        node newNode = new node();
        System.out.println("Enter a number: ");
        newNode.data = s.nextInt();
        ptr = start;
        System.out.println("Enter a number to be searched and element will be inserted before it");
        int no = s.nextInt();
        while(ptr.next!=null){
            if(ptr.data == no){
                counter = 1;
                break;
            }
            pre = ptr;
            ptr = ptr.next;
        }
        newNode.prev = pre;
        newNode.next = pre.next;
        pre.next = newNode;
        ptr.prev = newNode;
    }   


    void middleA(){
        int counter = 0;
        node newNode = new node();
        System.out.println("Enter a number to be inserted: ");
        newNode.data = s.nextInt();
        ptr = start;
        System.out.println("Enter a number to be searched and the element will be placed after it: ");
        int no = s.nextInt();
        while(ptr.next != null){
            if(ptr.data == no){
                counter = 1;
                break;
            }
            pre = ptr;
            ptr = ptr.next;
        }
        newNode.prev = ptr;
        newNode.next = ptr.next;
        ptr.next = newNode;
        (ptr.next).prev = newNode;
    }
    
    public static void main(String[] args) {
        DLL ob = new DLL();
        ob.create();
        ob.displayForw();
        ob.displayBack();
        // ob.addF();
        // ob.displayForw();
        // ob.addL();
        ob.middleB();
        ob.displayForw();
        ob.middleA();
        ob.displayForw();
        ob.deleteMiddle();
        ob.displayForw();
        //ob.deleteFirst();
        // ob.deleteLast();
        // ob.displayForw();
    }

}