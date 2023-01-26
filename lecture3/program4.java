package lecture3;

import java.util.ArrayList;
import java.util.List;

public class program4 {
    public static void main(String[] args) {

        //Character value = null;
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        //list1.remove(1); // java.lang.UnsupportedOperationException
        System.out.println(list1);
        System.out.println("- - -");
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2);
        System.out.println("- - -");

        System.out.println("List<Character> list_1 = new ArrayList<Character>();");
        List<Character> list_1 = new ArrayList<Character>();
        //ArrayList<Character> list_1 = new ArrayList<Character>();
        list_1.add('S');
        list_1.add('e');
        list_1.add('r');
        list_1.add('g');
        list_1.add('e');
        list_1.add('y');
        System.out.println(list_1);
        System.out.println("remove - - -");
        list_1.remove(1);
        System.out.println(list_1);
        System.out.println(list_1.contains('S'));
        //System.out.println(list_1.remove('y'));

        /*
        List<Character> list1 = new ArrayList<Character>();
        list1.add('S');
        list1.add('e');
        list1.add('r');
        list1.add('g');
        list1.add('e');
        list1.add('y');
        
        System.out.println(list1);
        list1.remove(1); // java.lang.UnsupportedOperationException
        System.out.println(list1);
        //List<Character> list2 = List.copyOf(list1);
        */
    }
}
