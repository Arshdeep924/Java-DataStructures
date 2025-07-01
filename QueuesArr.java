import java.util.*;
public class QueuesArr{
	boolean status;
	int arr[];
	Scanner s = new Scanner(System.in);
	int idx = -1;
	int n;
	void info(){
		System.out.println("Enter size of queue: ");
		n = s.nextInt();
		arr = new int[n];
	}

	void enqueue(){		
		if(isfull())
		{
			System.out.println("Queue is full");
		}
		else 
		{
			try
			{
				System.out.println("Enter element of queue: ");
				idx++;
				arr[idx] = s.nextInt();
			}
			catch(Exception ex)
            {
			}
		}
	}

	boolean isfull(){	
		if(idx>=n-1)
		{
			status=true;
		}
		else
		{
			status=false;
		}
		return status;
	}

	void dequeue(){
	    if(isempty())
	    {
		    System.out.println("Queue is empty");
	    }
	    else
	    {
	        for(int i = 0; i <idx; i ++)
	        {
		        arr[i] = arr[i+1];	
	        }	
	        idx--;
	        System.out.println(idx);
	    }
	}	
	
	boolean isempty(){
        if(idx == -1)
        {
            status=true;
        }
        else
            status=false;
        return status;
	}

	void showQueue(){
		if(isempty())
		{
			System.out.println("Queue is empty");
		}
		else 
        {
		    for (int i =0; i<=idx ; i++){
		    System.out.println(arr[i]);}
		}
	}

	void peek(){
		if(isempty())
		{
			System.out.println("Queue is empty");
		}
		else 
        {
		    System.out.println("Front element:"+arr[0]);
		}
	}
	
	public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        QueuesArr ob = new QueuesArr();
        int choice = 0;
        ob.info();
        while(choice != 5)
        {
            System.out.println("1.ENQUEUE");
            System.out.println("2.DEQUEUE");
            System.out.println("3.SHOW");
            System.out.println("4.PEEK");
            System.out.println("5.EXIT");
            System.out.println("Enter the choice: ");
            choice = sc.nextInt();
            if(choice == 1)
            ob.enqueue();
            else if(choice == 2)
            ob.dequeue();
            else if(choice == 3)
            ob.showQueue();
            else if(choice==4)
                ob.peek();
        }
    }
}
