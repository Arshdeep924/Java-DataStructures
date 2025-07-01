import java.util.Scanner;

public class assign{
    Scanner s = new Scanner(System.in);
    String country[] = new String[10];
    String capital[] = new String[10];

    void input(){
        for (int i = 0; i < country.length; i++) {
            System.out.println("Enter country " + (i+1) + ": " );
            country[i] = s.nextLine(); 
        }
        for (int i = 0; i < capital.length; i++) {
            System.out.println("Enter Capital " + (i+1) + ": ");
            capital[i] = s.nextLine();
        }
    }

    void check(){
        System.out.println("Enter a vowel");
        char a = Character.toLowerCase(s.next().charAt(0));

        System.out.println("Countries starting with "+ a + " and their capitals: ");
        for(int i = 0; i < country.length; i++){
            if(Character.toLowerCase(country[i].charAt(0)) == a){
                System.out.println(country[i] + " - " + capital[i]);
            }
        }
    }

    public static void main(String[] args) {
        assign ob = new assign();
        ob.input();
        ob.check();
    }
}