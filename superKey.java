class superKe
{
    int id;
    public superKe(int id) {
        this.id=id;
        System.out.println("ID="+this.id);
    }
}
public class superKey extends superKe{
    String name;
    superKey(int id)
    {
        name="Arhsdeep";
        super(id);
        System.out.println("Name="+name);
    }
    public static void main(String[] args) {
        superKey ob=new superKey(1);
    }
}