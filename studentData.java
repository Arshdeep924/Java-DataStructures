interface student
{
    String name="Rahul Sharma";
    void show(); 
}
public class studentData implements  student
{
    public void show()
    {
        System.out.println("Student="+name);
    }
    public static void main(String[] args) {
        studentData ob=new studentData();
        ob.show();
    }
}
