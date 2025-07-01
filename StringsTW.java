import java.util.*;
public class StringsTW {
    Scanner s=new Scanner(System.in);
    String str;

    // // WAP TO INPUT A STRING AND CHECK IF IT STARTS AND ENDS WITH VOWELS
    // void input()
    // {
    //     System.out.println("Enter any string :");
    //     str=s.nextLine();
    //     str=str.toLowerCase();
    // }
    // void show()
    // {
    //     if((str.charAt(0)=='a' || str.charAt(0)=='e' ||str.charAt(0)=='i'||str.charAt(0)=='o'||str.charAt(0)=='u')
    //     && (str.charAt(str.length()-1)=='a') || (str.charAt(str.length()-1)=='e') || (str.charAt(str.length()-1)=='i' || (str.charAt(str.length()-1)=='o')) || (str.charAt(str.length()-1)=='u'))
    //     {
    //         System.out.println("Valid String: " + str);
    //     }
    //     else
    //     {
    //         System.out.println("Invalid String");
    //     }
    // }
    // public static void main(String arg[])
    // {
    //     StringsTW ob=new StringsTW();
    //     ob.input();
    //     ob.show();
    // }

    // // WAP TO ENTER A STRING AND DISPLAY IT IN REVERSE 
    // void input() {
    //     System.out.println("Enter a String: ");
    //     str = s.nextLine();
    // }
    // void output(){
    //     System.out.println("The reverse of input String is: ");
    //     for (int i = str.length()-1; i >= 0; i--) {
    //         System.out.print(str.charAt(i));  
    //     }
    // }
    // public static void main(String[] args) {
    //     StringsTW ob = new StringsTW();
    //     ob.input();
    //     ob.output();
    // }

    // // WAP TO ENTER A STRING AND CHECK IF ITS A PALIDROME
    // void input() {
    //     System.out.println("Enter your String: ");
    //     str = s.nextLine();
    // }
    // String newstr = "";
    // void output() {
    //     for(int i = str.length()-1; i >= 0; i--){
    //         newstr = newstr + str.charAt(i);
    //     }
    //     System.out.println("The reversed String is: " + newstr);
    //     if(newstr.equalsIgnoreCase(str)){
    //         System.out.println("It is a Palindrome!");
    //     }
    // }
    // public static void main(String[] args) {
    //     StringsTW ob = new StringsTW();
    //     ob.input();
    //     ob.output();
    // }


    // // WAP TO INPUT A STRING AND DISPLAY THE SAME IN PIG LATIN FORM
    // String first="",second="";
    // int pos;
    // void input() {
    //     System.out.println("Enter your string: ");
    //     str = s.nextLine();
    // }
    // void output() {
    //     for (int i =0; i <str.length()-1; i++){
    //         if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
    //             pos=i;
    //         }
    //     }
    //     first=str.substring(0,pos-1);
    //     System.out.println(first);
    //     second=str.substring(pos-1);
    //     System.out.println(second);
    //     System.out.println((second+first+"AY").toUpperCase());
    // }
    // public static void main(String arg[])
    // {
    //     StringsTW ob=new StringsTW();
    //     ob.input();
    //     ob.output();
    // }

    // // WAP TO INPUT A STRING AND CONVERT FIRST LETTER OF EACH WORD IN UPPER CASE(PROPER CASE)
    // String proper="";
    // void input() {
    //     System.out.println("Enter your sentence: ");
    //     str = s.nextLine().toLowerCase();
    // }
    // void output() {
    //     System.out.println("The proper case of the input String is: ");
    //     proper = proper + Character.toUpperCase((str.charAt(0)));
    //     for(int i = 1; i < str.length(); i++) {
    //         if(str.charAt(i) == ' ') {
    //             proper = proper + " " + Character.toUpperCase(str.charAt(i+1));
    //             i++;
    //         }else {
    //             proper = proper + str.charAt(i);
    //         }
    //     }System.out.println(proper);
    // }
    // public static  void main(String ar[])
    // {
    //     StringsTW nn=new StringsTW();
    //     nn.input();
    //     nn.output();
    // }


    // // WAP TO INPUT A STRING AND DISPLAY A NEW STRING WITH ALL REPEATING LETTERS REMOVED
    // String proper="";
    // void input() {
    //     System.out.println("Enter your sentence: ");
    //     str = s.nextLine().toLowerCase();
    // }
    // void output() {
    //     for(int i = 0; i < str.length(); i++) {
            
            
    //     }
    // }


    // // WAP TO ACCEPT A STRING AND PRINT RIGHT TRIANGLE PATTERN
    // void input() {
    //     System.out.println("Enter your string: ");
    //     str = s.nextLine();
    //     str = str.toUpperCase();
    // }
    // int pos = 0;
    // void output() {
    //     for(int i = pos; i < str.length(); i++) {
    //         for(int j = 0; j <= i; j++) {
    //             System.out.print(str.charAt(j) + " ");
    //         }System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     StringsTW ob = new StringsTW();
    //     ob.input();
    //     ob.output();
    // }


    // // WAP TO ACCEPT A STRING AND PRINT INVERTED RIGHT TRIANGLE ON RIGHT SIDE
    // void input() {
    //     System.out.println("Enter a string");
    //     str = s.nextLine();
    //     str = str.toUpperCase();
    // }
    // void output() {
    //     for(int i =str.length()-1;i>=0; i--){
    //         for(int j =str.length(); j > i; j--){
    //             System.out.print(" ");
    //         }
    //         for(int j = 0; j <=i; j++){
    //             System.out.print(str.charAt(j));
    //         }System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     StringsTW ob = new StringsTW();
    //     ob.input();
    //     ob.output();
    // }


    // // WAP TO INPUT A STRING AND REPLACE EACH CONSONANT WITH PREVIOUS LETTER(Q2 OF ASSIGNMENT)
    // String newstr="";
    // void input() {
    //     System.out.println("Enter a string");
    //     str = s.nextLine();
    //     str = str.toUpperCase();
    // }
    // void output() {
    //     for(int i = 0; i < str.length(); i++){
    //         if(Character.isLetter(str.charAt(i))){
    //             if(str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'O' && str.charAt(i) != 'I' && str.charAt(i) != 'U'){
    //                 int prev=(int)str.charAt(i)-1;
    //                 char pr=(char)prev;
    //                 if(pr == 'A' || pr == 'E' || pr == 'I' || pr == 'O' || pr == 'U'){
    //                     int c=(int)str.charAt(i)+1;
    //                     char d=(char)c;
    //                     newstr=newstr+d;
    //                 }else {
    //                     newstr = newstr+(pr);
    //                 }
    //             }else {
    //             newstr = newstr+(str.charAt(i));
    //             }
    //         }else {
    //             newstr=newstr+str.charAt(i);
    //         }
    //     } 
    //         System.out.println(newstr);
    // }
    // public static void main(String[] args) {
    //     StringsTW ob = new StringsTW();
    //     ob.input();
    //     ob.output();
    // }


    // // WAP TO INPUT A NAME AND OUTPUT ONLY THE INITIALS OF THE NAME
    // String newstr = "";
    // void input() {
    //     System.out.println("Enter the name: ");
    //     str = s.nextLine();
    //     str = str.toUpperCase();
    //     newstr = newstr + str.charAt(0);
    // }
    // void output() {
    //     for (int i = 0; i < str.length(); i++) {
    //         if(str.charAt(i) == ' '){
    //             newstr = newstr + "." + str.charAt(i+1) + ".";
    //         }
    //     }System.out.println("Initials are - " + newstr);
    // }
    // public static void main(String[] args) {
    //     StringsTW ob = new StringsTW();
    //     ob.input();
    //     ob.output();
    // }


    // // WAP TO INPUT A STRING AND TAKE TWO CHOICES IN ORDER TO PRINT INITIALS IF CHOICE 1 AND LAST LETTERS IF CHOICE 2
    // String newstr = "";
    // char d;
    // void input() {
    //     System.out.println("Enter a string");
    //     str = s.nextLine();
    //     str = str.toUpperCase();
    //     System.out.println("Enter choice(F or L): ");
    //     String c = s.nextLine().toUpperCase();
    //     d=c.charAt(0);
    // }
    // void output() {
    //     if(d == 'F'){
    //         newstr = newstr + str.charAt(0);
    //         for (int i = 0; i < str.length(); i++) {
    //             if(str.charAt(i) == ' '){
    //                 newstr = newstr+" "+ str.charAt(i+1);
    //             } 
    //         }System.out.println(newstr);
    //     }else if(d ==  'L') {
    //         for(int j =0;j<str.length();j++){
    //             if(str.charAt(j) == ' '){
    //                 newstr = newstr + " " + str.charAt(j-1);
    //             }
    //         }
    //         newstr = newstr + " "+str.charAt(str.length()-1);
    //         System.out.println(newstr);
    //     }else {
    //         System.out.println("Enter valid choice");
    //     }
    // }
    // public static void main(String[] args) {
    //     StringsTW ob = new StringsTW();
    //     ob.input();
    //     ob.output();
    // }


    // // WAP TO INPUT A STRING AND RETURN ONLY THE WORDS WHICH ARE PALINDROME
    // String newstr = "";
    // String rev="";
    // void input(){
    //     System.out.println("Enter a string: ");
    //     str = s.nextLine();
    //     str=str+" ";
    // }
    // void output(){
    //     for(int i = 0; i < str.length(); i++)
    //     {
    //         if(str.charAt(i) == ' ')
    //         {
    //             rev="";
    //             for(int j = newstr.length()-1; j >= 0; j--)
    //             {
    //                 rev=rev + newstr.charAt(j);
    //             }
    //             if(rev.equals(newstr))
    //             {
    //                 System.out.println("Palindrome ="+rev);
    //             }
    //             newstr="";
    //         }
    //         else 
    //         {
    //             newstr=newstr+str.charAt(i);
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     StringsTW ob = new StringsTW();
    //     ob.input();
    //     ob.output();
    // }
//    }


    // // WAP TO INPUT A STRING AND CONVERT IT INTO LOWER CASE AND DISPLAY IT WITH THE VOWELS REPLACES BY FOLLOWING LETTERS
    // String newstr = "";
    // void input() {
    //     System.out.println("enter a string: ");
    //     str = s.nextLine().toLowerCase();
    // }
    // void output(){
    //     for(int i = 0; i < str.length(); i++) {
    //         if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
    //             int nex = (int)str.charAt(i)+1;
    //             char d = (char)nex;
    //             newstr = newstr+d;
    //         }else{
    //             newstr = newstr + str.charAt(i);
    //         }
    //     }System.out.println(newstr);
    // }
    // public static void main(String[] args) {
    //     StringsTW ob = new StringsTW();
    //     ob.input();
    //     ob.output();
    // }


    // // WAP TO INPUT A WORD AND CHECK IF IT'S A SPECIAL WORD(WHICH STARTS AND ENDS WITH THE SAME LETTER)
    // void input() {
    //     System.out.println("Enter a word: ");
    //     str = s.nextLine().toLowerCase();
    // }
    // void output() {
    //     if(str.charAt(0) == str.charAt(str.length()-1)){
    //         System.out.println("It is special word");
    //     } else{
    //         System.out.println("It is just a regular word");
    //     }
    // }
    // public static void main(String[] args) {
    //     StringsTW ob = new StringsTW();
    //     ob.input();
    //     ob.output();
    // }



    // int l;
    // void input(){
    //     System.out.println("Enter a Word");
    //     str = s.nextLine().toUpperCase();
    // }
    // void output()
    // {
    //     l=str.length()-2;
    //     for (int i = 0; i < str.length(); i++) {
    //         System.out.print(str.charAt(i));
    //     }
    //     System.out.println(" ");
    //     for(int i=1;i<str.length()-1;i++)
    //     {
    //         System.out.print(str.charAt(i));
    //         for(int j=0;j<str.length()-2;j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         System.out.println(str.charAt(l));
    //         l--;
    //     }
    //     //System.out.println();
    //     for (int j = str.length()-1; j >=0; j--){
    //         System.out.print(str.charAt(j));
    //     }
    // }
    // public static void main(String[] args) {
    //     StringsTW ob = new StringsTW();
    //     ob.input();
    //     ob.output();
    // }

}


