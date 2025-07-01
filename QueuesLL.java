import java.util.Scanner;

public class QueuesLL{
    Scanner s=new Scanner(System.in);
    que front=null,rear=null;
    class que {
        int data;
        que next;
    }
    
    void enqueue() {
        que newnode=new que();
        System.out.println("Enter queue element:");
        newnode.data=s.nextInt();
        if(front==null)
        {
            newnode.next=null;
           front=newnode;
            rear=newnode;
        }
        else
        {
            rear.next=newnode;
            rear=newnode;
            newnode.next=null;
        }
    }

    void dequeue(){
        System.out.println("Deleted Node="+front.data);
        front=front.next;
    }

    void queueShow()
    {
        que ptr=front;
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
    }

    void isempty()
    {
        if(front==null)
            System.out.println("Queue is empty");
    }

    void peek(){
        try{
        isempty();
        System.out.println("The foremost element is: " + front.data);
        }catch(Exception ex){
        }
    }

    public static void main(String[] args) {
        QueuesLL ob = new QueuesLL();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while(choice != 5){
        System.out.println("Choose option");
        System.out.println("1.Enqueue");
        System.out.println("2.Dequeue");
        System.out.println("3.Show elements");
        System.out.println("4.Peek");
        System.out.println("5.Exit");
        System.out.println("Enter ur choice:");
        choice=sc.nextInt();
        if(choice == 1)
            ob.enqueue();
        else if(choice == 2)
            ob.dequeue();
        else if(choice == 3)
            ob.queueShow();
        else if(choice == 4)
            ob.peek();
        }
    }
}