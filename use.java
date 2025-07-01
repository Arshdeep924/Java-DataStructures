import java.util.Scanner;

public class use{
    static Scanner s = new Scanner(System.in);
    static int id;
    static String name;
    
    public static void input() {
        System.out.println("Enter ID");
        id = s.nextInt();
        s.nextLine();
        System.out.println("Enter name");
        name = s.nextLine();
    }

    public static void main(String[] args) {
        input();
    }
        
    }
