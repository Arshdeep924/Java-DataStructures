public class strings{
    public static void main(String[] args){
        // STRING DECLARATION
        // String names  = "Tony Stark";
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("The name is " + name);

        // // STRING MANIPULATION
        // // CONCATENATION**********************************
        // String firstName = "Arshdeep";
        // String lastName = "Singh";
        // String fullName = firstName + lastName; 
        // System.out.println(fullName);
        // // .length() - TO PRINT OUT LENGTH OF STR************
        // System.out.println(fullName.length());

        // // .charAt() - TO PRINT A CHAR OUT OF A STR**********
        // for(int i = 0; i < fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }

        // // .compareTo() - STRING COMPARE*********************
        // String name1 = "Arsh";
        // String name2 = "Tony";
        // // FOR STR1>STR2 ==> ANY POS VALUE
        // // FOR STR1=STR2 ==> 0
        // // FOR STR1<STR2 ==> ANY NEG VALUE

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("Yes they are equal");
        // }else{
        //     System.out.println("No they are not equal");
        // }

        // .substring() - TO GET A SUBSTRING OUT OF MAIN STRING**
        // beginIndex,endIndex = for 2 indexes
        // beginIndex = for 1 index to end
        // 0,endIndex = for beg to 1 index
        // String sent = "Arshdeep Singh";
        // String name = sent.substring();
        // System.out.println(name);

        // // STRING BUILDER*********************
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);
        // // .charAt - TO PRINT A CHAR OUT OF STR
        // System.out.println(sb.charAt(0));

        // // .serCharAt() - TO CHANGE A CHAR OF A STR
        // sb.setCharAt(0,'P');
        // System.out.println(sb);

        // sb.setCharAt(0,'T');
        // System.out.println(sb);

        // // .insert() - TO INSERT A CHAR IN A STR
        // sb.insert(0,'S');
        // System.out.println(sb);

        // sb.insert(3,'n');
        // System.out.println(sb);

        // // .delete() - TO DELETE A CHAR IN A STR
        // sb.delete(3, 4);
        // System.out.println(sb);

        // // .append() - TO APPEND CHARS INTO THE STR
        // sb.append("S");
        // sb.append("t");
        // sb.append("r");
        // sb.append("k");
        // System.out.println(sb);

        // REVERSING A STRING BY REPLACING HALF A STR METHOD
        StringBuilder sb = new StringBuilder("hello");

        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() -1 -i;  //5-1-0

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);


    }

}