import java.util.Scanner;

public class Loan{
    Scanner s = new Scanner(System.in);
    private int time;
    private double principal, rate, interest, amt;

    void getData(){
        System.out.println("Enter principlae amount: ");
        this.principal = s.nextDouble();
        System.out.println("Enter time: ");
        this.time = s.nextInt();
    }

    void calculate(){
        if(time <= 5)
        {
            this.rate = 15.0;
        }
        else if(time > 5 && time <= 10)
        {
            this.rate = 12.0;
        }
        else
        {
            this.rate = 10.0;
        }

        this.interest = (this.principal*this.rate*this.time)/100;
        this.amt = this.principal + this.interest;
    }

    void display(){
        System.out.println(this.interest);
        System.out.println(this.amt);
    }

    public static void main(String[] args) {
        Loan ob = new Loan();
        ob.getData();
        ob.calculate();
        ob.display();
    }
}