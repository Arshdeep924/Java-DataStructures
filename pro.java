public class pro extends protect 
{
    String name;
    void showName()
    {
        name="Rahul";
        System.out.println(name);
        System.out.println(super.name);
    }
    public static void main(String[] args) {
        pro ob=new pro();
        ob.getdata();
        ob.showName();
    }
    
}
