import  java.util.*;
public class StringArr{
    Scanner s=new Scanner(System.in);;
    int i;

    // // WAP TO INPUT AN ARRAY OF STRINGS AND CHECK IF THEY START AND END WITH VOWELS
    // String str[]=new String[5];
    // void input()
    // {
    //     System.out.println("Enter any string :");
    //     for(i=0;i<str.length;i++)
    //     {
    //         str[i]=s.nextLine().toLowerCase();
    //     }
    // }
    // void show()
    // {
    //     for(i=0;i<str.length;i++)
    //     {
    //     if((str[i].charAt(0)=='a' || str[i].charAt(0)=='e' ||str[i].charAt(0)=='i'||str[i].charAt(0)=='o'||str[i].charAt(0)=='u') 
    //     && (str[i].charAt(str[i].length()-1)=='a' ||str[i].charAt(str[i].length()-1)=='e'||str[i].charAt(str[i].length()-1)=='i' ||str[i].charAt(str[i].length()-1)=='o' ||str[i].charAt(str[i].length()-1)=='u'))
    //     {
    //         System.out.println("Valid String"+str[i]);
    //     }
    // }
    // }
    // public static void main(String arg[])
    // {
    //     StringArr ob=new StringArr();
    //     ob.input();
    //     ob.show();
    // }


    // // WAP TO STORE NAMES OF 20 STUDENTS AND THEIR TELEPHONE NUMBERS IN A 2D ARRAY
    // String stu[][];
    // void input() {
    //             System.out.println("Enter Name: ");
    //             String n = s.nextLine();
    //             System.out.println("Enter phone number: ");
    //             stu[][] = s.nextLine();
    //         }
    //     }
    // }


    // // WAP TO INPUT NAMES OF CITIES IN AN ARRAY AND DISPLAY ONLY THOSE WHICH START WITH CONSONANT AND END WITH VOWEL
    // String str[];
    // void input() {
    //     System.out.println("Enter number of cities: ");
    //     int n = s.nextInt();
    //     str = new String[n];
    //     s.nextLine();
    //     for(i = 0; i < str.length; i++) {
    //         System.out.println("Enter city " + i + ": ");
    //         str[i] = s.nextLine().toLowerCase();

    //     }
    // }
    // void output() {
    //     for(i = 0; i < str.length; i++) 
    //     {
    //         if((str[i].charAt(0)) != 'a' && (str[i].charAt(0)) != 'e' && (str[i].charAt(0)) != 'o' && (str[i].charAt(0)) != 'i' && (str[i].charAt(0)) != 'u'
    //          && str[i].charAt(str[i].length()-1) == 'a' || str[i].charAt(str[i].length()-1) == 'e' || str[i].charAt(str[i].length()-1) == 'i' || str[i].charAt(str[i].length()-1) == 'o' || str[i].charAt(str[i].length()-1) == 'u'){
    //             System.out.println(str[i]);
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     StringArr ob = new StringArr();
    //     ob.input();
    //     ob.output();
    // }


    // // WAP TO INPUT NAMES IN A 1D ARRAY AND PRINT ONLY THOSE WHICH ARE PALINDROMES
    // String str[];
    // void input() {
    //     System.out.println("Enter number of names: ");
    //     int n = s.nextInt();
    //     str = new String[n];
    //     s.nextLine();
    //     for(i = 0; i < str.length; i++) {
    //         System.out.println("Enter name " + i + ": ");
    //         str[i] = s.nextLine().toLowerCase();
    //     }
    // }
    // void output() {
    //     String newstr = "";
    //     for(i = 0; i < str.length; i++) 
    //     {   
    //         newstr="";
    //     for(int j = str[i].length()-1; j >= 0; j--) {
    //         newstr = newstr + str[i].charAt(j);
    //     }
    //     if(str[i].equalsIgnoreCase(newstr)){
    //         System.out.println(str[i]);
    //     }
    // }
    // }
    // public static void main(String[] args) {
    //     StringArr ob = new StringArr();
    //     ob.input();
    //     ob.output();
    // }


}