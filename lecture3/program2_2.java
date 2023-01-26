package lecture3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class program2_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1); //0
        list.add(2); //1
        list.add(3); //2
        list.add(4); //3
        list.add(5); //4
        list.add(5); //5
        list.add(6); //6
        list.add(7); //7
        list.add(8); //8
        list.add(9); //9

        for (Object element : list) {
            System.out.println(element);
        }

        System.out.println("get - - -");
        System.out.println(list.get(0));

        System.out.println("indexOf - - -");
        System.out.println(list.indexOf(5));

        System.out.println("lastIndexOf - - -");
        System.out.println(list.lastIndexOf(5));

        System.out.println("remove - - -");
        System.out.println(list.remove(9));

        System.out.println("- - -");
        for (Object element : list) {
            System.out.println(element);
        }

        System.out.println("set - - -");
        list.set(0,100);

        System.out.println("subList - - -");
        System.out.println(list.subList(0, 9));

        System.out.println("sort - - -");
        Collections.sort(list);

        System.out.println("subList- - -");
        System.out.println(list.subList(0, 9));
    }
}
