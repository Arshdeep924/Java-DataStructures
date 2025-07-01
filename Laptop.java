

public class Laptop{
    // String name;
    // double price, amt, dis;

    // Laptop(String name, double price){
    //     this.name = name;
    //     this.price = price;
    // }

    // void discount(){
    //     if(price < 25000){
    //         dis = price*(5.0/100.0);
    //     }else if(price> 25000 && price <= 50000){
    //         dis = price*(7.5/100.0);
    //     }else if(price>50000 && price <= 100000){
    //         dis = price*(10.0/100.0);
    //     }else{
    //         dis = price*(15.0/100.0);
    //     }
    //     amt = price-dis;
    // }

    // void display(){
    //     System.out.println("Name of customer: " + name);
    //     System.out.println("Discount offered: " + dis);
    //     System.out.println("Amount after discount: " + amt);
    // }

    // public static void main(String[] args) {
    //     Laptop ob = new Laptop("Arsh", 100000);
    //     ob.discount();
    //     ob.display();
    // }


    // Q2-----------------------------------------------------------------------

    // int num, f , rev;
    // Laptop(int n){
    //     this.num = n;
    //     f = 0;
    //     rev = 0;
    // }

    // int prime(){
    //     for (int i = 2; i <= Math.sqrt(num); i++)
    //     {
    //         if(num%i == 0)
    //         {
    //             return 0;
    //         }
    //     }
    //     return 1;
    // }   

    // public int reverse(){
    //     int a = num;
    //     while(a>0)
    //     {
    //         rev = rev*10 + (a%10);
    //         a = a/10;
    //     }
    //     return rev;
    // }

    // void display(){
    //     if(rev == num){
    //         System.out.println("It is a palindrome");
    //     }else{
    //         System.out.println("It is not a palindrome");
    //     }
    // }

    // public static void main(String[] args) {
    //     Laptop ob = new Laptop(121);
    //     ob.prime();
    //     ob.reverse();
    //     ob.display();
    // }

    // Q4 ---------------------------------------------------------------

    float p, r;
    Laptop(int a, int b){
        this.p =(float)a;
        this.r = (float)r;
    }
}