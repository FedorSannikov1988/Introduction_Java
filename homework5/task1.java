/*
Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов.

Пусть дан список сотрудников: Иван Иванов (и остальные).
Написать программу, которая найдет и выведет повторяющиеся 
имена с количеством повторений.

Отсортировать по убыванию популярности.
Пример:
Иван Иванов 88001122333
Иван Курицин 88001662333
Иван Курицин 88001112333
Иван Незлобин 88001122432
Сергей Потапов 88001112453
Сергей Потапов 8800163214
Сергей Курицин 8800142421
Михаил Незлобин 880012343

OutPut:
Иван - 3
Сергей - 2

Потому как если один сотрудник имеет 2 или более номера , его имя считаем 1 раз. 
*/
package homework5;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.HashMap;

public class task1 {

    public static Map<String, Integer> countNameInPhoneBook(Map<Double, String> phoneBook) {

        String nameHuman = "";

        Map<String, Integer> countName = new HashMap<String, Integer>();

        Map<Double, String> deleteCopyHumanInPhoneBook = new HashMap<Double, String>();
        
        for (var item : phoneBook.entrySet()) {
            if(!deleteCopyHumanInPhoneBook.containsValue(item.getValue())) {

                deleteCopyHumanInPhoneBook.put(item.getKey(), item.getValue());
            }
        }

        for (var item : deleteCopyHumanInPhoneBook.entrySet()) {
            
            nameHuman = item.getValue().split(" ")[0];

            if (!countName.containsKey(nameHuman)) {

                countName.put(nameHuman, 1);
            }
            else {

                countName.put(nameHuman, countName.get(nameHuman) + 1);
            }
        }
        return countName;
    }

    public static TreeMap<Integer, String> sortPopularityNameDecreasingInPhoneBook(Map<String, Integer> countNameInPhoneBook) {

        TreeMap<Integer, String> sortPopularityName = new TreeMap<>(Collections.reverseOrder());

        for (var item : countNameInPhoneBook.entrySet()) {
            
            if (item.getValue() > 1) {

                sortPopularityName.put(item.getValue(), item.getKey());
            }
        }
        return sortPopularityName;
    }

    public static void main(String[] args) {
        
        Map<Double, String> phoneBook = Map.of(88001122333D, "Иван Иванов", 88001662333D, "Иван Курицин", 88001112333D, "Иван Курицин", 88001122432D, "Иван Незлобин", 88001112453D, "Сергей Потапов", 8800163214D, "Сергей Потапов", 8800142421D, "Сергей Курицин", 880012343D, "Михаил Незлобин");
        
        /*
        Map<Double, String> phoneBook = new HashMap<Double, String>();
        
        phoneBook.put(88001122333D, "Иван Иванов");
        phoneBook.put(88001662333D, "Иван Курицин");
        phoneBook.put(88001112333D, "Иван Курицин");
        phoneBook.put(88001122432D, "Иван Незлобин");
        phoneBook.put(88001112453D, "Сергей Потапов");
        phoneBook.put(8800163214D, "Сергей Потапов");
        phoneBook.put(8800142421D, "Сергей Курицин");
        phoneBook.put(880012343D, "Михаил Незлобин");
        */

        Map<String, Integer> countNameInPhoneBook = new HashMap<String, Integer>();
        countNameInPhoneBook = countNameInPhoneBook(phoneBook);

        System.out.println("countNameInPhoneBook:");
        System.out.println(countNameInPhoneBook);

        TreeMap<Integer, String> sortPopularityNameInPhoneBook = new TreeMap<>(Collections.reverseOrder());
        sortPopularityNameInPhoneBook = sortPopularityNameDecreasingInPhoneBook(countNameInPhoneBook);

        System.out.println(" - - - ");
        System.out.println("sortPopularityNameDecreasingInPhoneBook:");

        for (Entry<Integer, String> item: sortPopularityNameInPhoneBook.entrySet()) {
            System.out.printf("%s, встречается раз: %d \n", item.getValue(), item.getKey());
        }
    }
}