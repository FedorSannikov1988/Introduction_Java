/*
Дан список {"a", "2", "b", "3", "c", "4"} содержащий строки 
и числа в строковом формате.
C помощью итератора пройти по списку и вывести в консоль 
что является строкой, а что числом.
*/
package practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class task3 {

    public static void printResultOfCheck_NOT_Iterator(List<String> list) {

        for (String element : list) {
            try {
                Integer.parseInt(element);
                System.out.println(element + "<- Число !");
            } 
            catch (Exception e) {
                System.out.println(element + "<- Не число !");
            }
        }
    }

    public static void printResultOfCheck_Iterator(List<String> list) {

        Iterator<String> itr_list = list.iterator();
        String byffer = "";

        while (itr_list.hasNext()) {
            byffer = itr_list.next();
            
            try {
                Integer.parseInt(byffer);
                System.out.println(byffer + "<- Число !");
            } 
            catch (Exception e) {
                System.out.println(byffer + "<- Не число !");
            }
        }
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));

        System.out.println("printResultOfCheck_NOT_Iterator(list):");
        printResultOfCheck_NOT_Iterator(list);

        System.out.println("- - - - -");

        System.out.println("printResultOfCheck_Iterator(list):");
        printResultOfCheck_Iterator(list);
    }    
}
