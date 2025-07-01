import java.util.Scanner;

public class QueuesCirc{
    Scanner s = new Scanner(System.in);
    queu front = null, rear = null;
    class queu{
        int data;
        queu next;
    }

    void enqueue(){
        queu newNode = new queu();
        System.out.println("Enter the elements: ");
        int n = s.nextInt();
        newNode.data = n;
        if(front == null)
        {
            front = newNode;
            rear = newNode;
            newNode.next=front;
        }
        else
        {
            rear.next = newNode;
            rear = newNode;
            newNode.next =front;
        }
    }

    void isempty(){
        if(front == null)
        {
            System.out.println("Queue is empty");
        }
    }

    void peek(){
        try{
            isempty();
            System.out.println("The foremost element is " + front.data);
        }catch(Exception ex)
        {
        }
    }

    void showQueue()
    {
        try{
        isempty();
        queu ptr = front;
        System.out.println(ptr.data);
        ptr = ptr.next;
        while(ptr!=front){
            System.out.println(ptr.data);
            ptr = ptr.next;
        }   
        }
        catch(Exception ex)
        {}
    }
    
    void dequeue()
    {
        try{
        isempty();
        if(front==front.next)
        {
            front=null;
        }
        else{
        System.out.println("The foremost element " + front.data + " is now deleted");
        queu ptr = front;
        ptr = ptr.next;
        while(ptr.next!=front){
            ptr = ptr.next;
        }
        front=front.next;
        ptr.next=front;}
        }
        catch(Exception ex)
        {}
    }

    public static void main(String[] args) {
        int choice = 0;
        QueuesCirc ob = new QueuesCirc();
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
                ob.showQueue();
            else if(choice == 4)
                ob.peek();   
        }
    }
}

