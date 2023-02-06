/* 
1) Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.

2) Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.

3) Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
*/
package practice6;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class task1 {
    
    public static void initHashSet(){

        //Set<Integer> set = new HashSet<Integer>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        //System.out.println(set);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(3);

        System.out.print("\n");
        System.out.println("HashSet:");
        for (Integer item : set) {
            System.out.print(" " + item + " ");
        }
        System.out.print("\n");

        //System.out.println(set);
    }

    public static void initLinkedHashSet(){

        //Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        //System.out.println(set);

        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(3);

        
        System.out.print("\n");
        System.out.println("LinkedHashSet:");
        for (Integer item : set) {
            System.out.print(" " + item + " ");
        }
        System.out.print("\n");

        //System.out.println(set);
    }

    public static void initTreeSet(){
        
        //Set<Integer> set = new TreeSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        //System.out.println(set);

        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(3);
        
        System.out.print("\n");
        System.out.println("TreeSet:");
        for (Integer item : set) {
            System.out.print(" " + item + " ");
        }
        System.out.print("\n");

        //System.out.println(set);
    }
    
    public static void main(String[] args) {
        initHashSet();
        initLinkedHashSet();
        initTreeSet();
    }
}
