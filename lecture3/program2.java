package lecture3;

import java.util.ArrayList;
import java.util.List;

public class program2 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        //ArrayList<Integer> list1 = new ArrayList<Integer>();
        //ArrayList list = new ArrayList();
        
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);
        ArrayList<Integer> list4 = new ArrayList<>(list3);

        //list1.add(2809);
        //list.add("2810");

        list1.add(1); //0
        list1.add(2); //1
        list1.add(3); //2
        list1.add(3); //3
        list1.add(4); //4
        list1.add(5); //5

        for (Object o : list1) {
            System.out.println(o);
        }

        System.out.println("- - -");
        System.out.println(list1.get(0));

        System.out.println("- - -");
        System.out.println(list1.indexOf(3));

        System.out.println("- - -");
        System.out.println(list1.lastIndexOf(3));

        System.out.println("- - -");
        System.out.println(list1.remove(3));

        System.out.println("- - -");
        for (Object o : list1) {
            System.out.println(o);
        }

        System.out.println("- - -");
        list1.set(0,100);

        System.out.println("- - -");
        System.out.println(list1.subList(0, 5));

        System.out.println("- - -");
        list1.sort(null);

        System.out.println("- - -");
        System.out.println(list1.subList(0, 5));
    }

}
 