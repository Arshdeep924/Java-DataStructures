import java.util.Scanner;

public class adata{
    Scanner s = new Scanner(System.in);
    char a;
    String b; 
    int count = 0;

    void accept(){
        System.out.println("Enter char a: ");
        a = s.next().charAt(0);
        s.nextLine();
        System.out.println("Enter String b: ");
        b = s.nextLine();
    }

    void show(){
        for(int i = 0; i < b.length(); i++){
            if(a == b.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        adata ob = new adata();
        ob.accept();
        ob.show();
    }

}