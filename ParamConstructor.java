public class ParamConstructor{
    int code;
    String name;

    ParamConstructor(int code, String name){
        this.code = code;
        this.name = name;
    }

    void show(){
        System.out.println("The product code is: " + code);
        System.out.println("The product name is: " + name);
    }

    public static void main(String[] args){
        ParamConstructor obj = new ParamConstructor(101, "Hats");
        obj.show();
    }
}