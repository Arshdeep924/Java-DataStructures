
import java.util.Scanner;

public class Stringop{
    String str;
    Scanner s = new Scanner(System.in);
    public Stringop() {
        str = "";
    }

    void accept(){
        System.out.println("Enter a sentence: ");
        str = s.nextLine();
    }

    void encode(){
        int pos;
        for(int i = 0; i < str.length()-1; i++){
            char c = str.charAt(i);
        }
    }
    
}