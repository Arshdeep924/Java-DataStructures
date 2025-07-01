public class Employee{
    int pan;
    String name;
    double taxincome, tax;

    void input(int pan, String name, double taxincome){
        this.pan = pan;
        this.name = name; 
        this.taxincome = taxincome;
    }

    void cal(){
        if(this.taxincome <= 250000)
            this.tax = 0;
        else if(this.taxincome > 250000 && this.taxincome<= 500000)
            this.tax =(10/100)*this.taxincome;//(this.taxincome*10)/100; //(10/100)*this.taxincome;
        else if(this.taxincome > 500000 && this.taxincome<= 1000000)
            this.tax = 30000 + ((this.taxincome-500000)*20)/100; //((20/100)*(this.taxincome-500000)));
        else
            this.tax = (50000.0 + ((30.0/100.0)*(this.taxincome-100000)));    
    }

    void display(){
        System.out.println(pan);
        System.out.println(name);
        System.out.println(taxincome);
        System.out.println(tax);
    }

    public static void main(String[] args) {
        Employee ob = new Employee();
        ob.input(16223, "Arsh", 1650000);
        ob.cal();
        ob.display();
    }
}