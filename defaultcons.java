public class defaultcons {
    int procode;
    String proname;

    defaultcons()   //default constructor
    {
        procode=101;
        proname="Shoe";
    }

    defaultcons(int pid,String pname)       //parameterized Constructor
    {
        procode=pid;
        proname=pname;
    }

    void show()     //show function
    {
        System.out.println("Product Code="+procode);
        System.out.println("Product Name="+proname);
    }

    public static void main(String[] args) {    
        defaultcons ob=new defaultcons();   // creating object 
        ob.show();
        defaultcons ob1=new defaultcons(1,"Bag");   
        ob1.show();
    }
}
