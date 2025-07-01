import java.util.Scanner;

public class QueuesDE{
    Scanner s = new Scanner(System.in);
    qu front = null, rear = null;
    qu ptr;
    class qu{
        int data;
        qu next;
    }

    void enqueueR(){
        qu newNode = new qu();
        System.out.println("Enter the element");
        newNode.data = s.nextInt();
        if(front == null){
            newNode.next = null;
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
            newNode.next = null;
        }
    }

    void enqueueF(){
        qu newNode = new qu();
        System.out.println("Enter the element");
        newNode.data = s.nextInt();
        if(front == null)
        {
            newNode.next = null;
            front = newNode;
            rear = newNode;
        }
        else
        {
            newNode.next = front;
            front = newNode;
        } 
    }

    void isempty(){
        if(front == null){
            System.out.println("Queue is empty");
        }
    }

    void dequeueF(){
        try{
            isempty();
            System.out.println("The foremost element is now dequeued: " + front.data);
            front = front.next;
        }catch(Exception ex)
        {
        }
    }

    void dequeueR(){
        try{
        isempty();
        ptr = front;
        qu pr=null;
        while(ptr.next!= null){
            pr=ptr;
            ptr = ptr.next;
        }
        System.out.println("The rearmost element is now deleted: " + ptr.data);
        pr.next = null;
        }catch(Exception ex)
        {
        }
    }

    void peekF(){
        try 
        {
            isempty();
            System.out.println("The foremost element is: " + front.data);
        } catch (Exception e) 
        {
        }
    }

    void peekR(){
        try {
            isempty();
            ptr = front;
            while(ptr.next != null)
            {
                ptr = ptr.next;
            }
            System.out.println("The rearmost element is: " + ptr.data);

        } catch (Exception e) 
        {
        }
    }

    void showQueue(){
        try{
            isempty();
            ptr = front;
            while(ptr != null)
            {
                System.out.println(ptr.data);
                ptr = ptr.next;
            }
        }catch(Exception e)
        {
        }
    }

    public static void main(String[] args) {
        QueuesDE ob = new QueuesDE();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while(choice != 9){
            System.out.println("Menu-");
            System.out.println("1.EnqueueF");
            System.out.println("2.EnqueueR");
            System.out.println("3.DequeueF");
            System.out.println("4.DequeueR");
            System.out.println("5.PeekF");
            System.out.println("6.PeekR");
            System.out.println("7.Show elements");
            System.out.println("8.Exit");
            System.out.println("Enter ur choice:");
            choice=sc.nextInt();
            if(choice == 1)
                ob.enqueueF();
            else if(choice == 2)
                ob.enqueueR();
            else if(choice == 3)
                ob.dequeueF();
            else if(choice == 4)
                ob.dequeueR();
            else if(choice == 5)
                ob.peekF();
            else if(choice == 6)
                ob.peekR();
            else if(choice == 7)
                ob.showQueue();
        }
    }
}