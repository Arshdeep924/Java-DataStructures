import java.util.Scanner;

public class power{
    Scanner s = new Scanner(System.in);
    double number;
    double power;
    double ans=1;
    void input(){
        System.out.println("Enter number: ");
        number = s.nextInt();
        System.out.println("Enter Power");
        power = s.nextInt();   
    }
    void calculate(){
        for(int i = 1; i <= power; i++){
            ans=ans*number;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        power ob = new power();
        ob.input();
        ob.calculate();
    }
}