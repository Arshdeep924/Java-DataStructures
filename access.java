public class access
{
    private int age;

    public access(int age) {
        this.age=age;
    }
    void show()
    {
        System.out.println("Age="+age);
    }
    public static void main(String[] args) {
        access ob=new access(11);
        ob.show();
    }
}