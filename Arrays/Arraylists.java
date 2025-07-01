import java.util.ArrayList;
import java.util.Collections;

class Arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add elements and print ArrayList
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get elements
        int elem = list.get(1);
        System.out.println(elem);

        // add elements in between
        list.add(1,5);
        System.out.println(list);

        // set element
        list.set(0,6);
        System.out.println(list);

        // delete elements
        list.remove(3);
        System.out.println(list);
    
        // to check size of element
        int size = list.size();
        System.out.println(size);

        // loops to print arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);

    }
}