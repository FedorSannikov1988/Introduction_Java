/*
Дан список {1, 9, 2, 6, 4, 3, 5, 7, 8, 0} с десятью 
случайными числами, нужно отсортировать
*/
package practice3;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class task2 {

    public static List<Integer> sortByCollections(List<Integer> input_list) {
        Collections.sort(input_list);
        return input_list;
    }

    public static List<Integer> sortByCollectionsReverse(List<Integer> input_list) {
        Collections.reverse(input_list);
        return input_list;
    }

    public static List<Integer> sortByComparator(List<Integer> list) {
        
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1 - i2;
            }
        });
        return list;
    }

    public static List<Integer> sortByComparatorReverse(List<Integer> list) {
        
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });
        return list;
    }
    
    public static void main(String[] args) {

        List<Integer> list_for_sort = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));

        System.out.println("- - - - -");
        System.out.println("sortByCollections():");
        System.out.println(sortByCollections(list_for_sort));

        System.out.println("sortByCollectionsReverse():");
        System.out.println(sortByCollectionsReverse(list_for_sort));
        System.out.println("- - - - -");

        System.out.println("- - - - -");
        System.out.println("sortByComparator():");
        System.out.println(sortByComparator(list_for_sort));

        System.out.println("sortByComparatorReverse():");
        System.out.println(sortByComparatorReverse(list_for_sort));
        System.out.println("- - - - -");

    }
}