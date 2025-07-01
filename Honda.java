import java.util.Scanner;

public class Honda{
    Scanner s = new Scanner(System.in);
    private int type;
    private int cost;

    void gettype(){
        System.err.println("Enter type of Engine(2/4): ");
        this.type =s.nextInt();
        System.out.println("Enter previous cost: ");
        this.cost = s.nextInt();
    }

    void find(){
        if(this.type == 2){
            this.cost += ((10.0/100.0)*cost);
        }else{
            this.cost += ((12.0/100.0)*cost);
        }
    }

    void printCost(){
        System.out.println("The type is "+ this.type + " stroke engine");
        System.out.println("The new Cost is " + this.cost);
    }

    public static void main(String[] args) {
        Honda ob = new Honda();
        ob.gettype();
        ob.find();
        ob.printCost();
    }
}