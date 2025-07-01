
import java.util.Scanner;

public class Calculate{
    Scanner s = new Scanner(System.in);
    private int num1, num2;
    private int sum, diff;

    void inputData(){
        System.out.println("Enter value 1: ");
        num1 = s.nextInt();
        System.out.println("Enter value 2: ");
        num2 = s.nextInt();
    }

    void calculate(){
        sum = num1 + num2;
        diff = Math.abs(num1-num2);
    }

    void outputData(){
        System.out.println(sum);
        System.out.println(diff);
    }

    public static void main(String[] args) {
        Calculate ob = new Calculate();
        ob.inputData();
        ob.calculate();
        ob.outputData();
    }
}