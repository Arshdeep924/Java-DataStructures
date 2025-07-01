import java.util.Scanner;
public class loan2{
    Scanner s = new Scanner(System.in);
    private int time;
    private double principal, rate, interest, amt;

    void getData(){
        System.out.println("Enter principlae amount: ");
        principal = s.nextDouble();
        System.out.println("Enter time: ");
        time = s.nextInt();
    }

    void calculate(){
        if(time <= 5)
        {
            rate = 15.0;
        }
        else if(time > 5 && time <= 10)
        {
            rate = 12.0;
        }
        else
        {
            rate = 10.0;
        }

        interest = (principal*rate*time)/100;
        amt = principal + interest;
    }

    void display(){
        System.out.println(interest);
        System.out.println(amt);
    }

    public static void main(String[] args) {
        Loan ob = new Loan();
        ob.getData();
        ob.calculate();
        ob.display();
    }
}
