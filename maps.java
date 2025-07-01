import java.util.HashMap;

public class maps {
    public static void main(String[] args){

        HashMap<String, Integer> empid = new HashMap<>();

        empid.put("Arsh", 12345);
        empid.put("Carl", 67890);
        empid.put("John", 54321);
        
        // TO PRINT ALL
        System.out.println(empid);

        // TO PRINT INDIVIDUALS
        System.out.println(empid.get("Arsh"));

        // // TO CHECK EXISTENCE
        // System.out.println(empid.containsKey("Arsh"));
        // System.out.println(empid.containsValue(12345));

        // UPDATE EXISTING KEY- PUT SAME KEY WITH DIFF VALUE
        empid.put("John", 890);
        System.out.println(empid);

        // // ONLY FOR EXISTING KEY
        empid.replace("kremlin", 888);
        System.out.println(empid);

        // // TO PUT IF ABSENT
        empid.putIfAbsent("cena", 222);
        System.out.println(empid);

        // // TO REMOVE
        empid.remove("John");
        System.out.println(empid);
    }
}
