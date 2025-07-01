    import java.util.Scanner;
    public class QueuesPriorD{
    Scanner s = new Scanner(System.in);
    qup front = null, rear = null;
    qup pr;
    qup ptr = front;
    class qup{
        int data;
        qup next;
    }

    void enqueue(){
        qup newNode = new qup();
        System.out.println("Enter your element: ");
        int n = s.nextInt();
        newNode.data = n;
        if(front == null)
        {
            newNode.next = null;
            front = newNode;
            rear = newNode;
        }
        else if(n>front.data)
        {
            newNode.next = front;
            front = newNode;
        }
        else
        {
            rear.next = newNode;
            rear = newNode;
            newNode.next = null;
        }
    }

    void dequeue(){
        isempty();
        System.out.println("The foremost element " + front.data + " is now dequeued");
        front = front.next;
    }
    
    void isempty(){
        if(front == null){
            System.out.println("Queue is empty");
        }
    }

    void showQueue(){
        try {
            isempty();
            while(ptr!=null)
            {
                System.out.println("Elements of queue: " + ptr.data);
                ptr = ptr.next;
            }
        } catch (Exception e) 
        {
        }
    }

    public static void main(String[] args) {
        QueuesPrior ob = new QueuesPrior();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(choice != 4){
            System.out.println("Menu-");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Show elements");
            System.out.println("4.Exit");
            choice = sc.nextInt();
            if(choice == 1)
                ob.enqueue();
            else if(choice == 2)
                ob.dequeue();
            else if(choice == 3)
                ob.showQueue();
        }
    }
    
}
