import java.util.Scanner;

public class stude{
    Scanner s = new Scanner(System.in);
    private int id,age;
    private String name;

    public void input(int id,String name){
        this.id = id;
        this.name = name;
    }
    public String chk(int age)
    {
        this.age=age;
        if(this.age>=18)
            return "Adult";
        else
            return "Not Adult";
    }
    public void show(){
        System.out.println(id +"\n"+ name);
    }

    public static void main(String[] args) {
        stude ob = new stude();
        ob.input(1,"Arshdeep");
        ob.show();
        //String ans=ob.chk(22);
        //System.out.println(ans);
        //System.out.println(ob.chk(21));
        if(ob.chk(22).equals("Adult"))
        {

        }
    }
}