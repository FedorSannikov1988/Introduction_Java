/* 
Дана последовательность чисел. 

Необходимо вернуть число совпадающих 
пар в этой последовательности.

Пример 1:     In: arr = [1, 2]  Out: 0
Пример 2:     In: arr = [1, 1, 2]  Out: 1
Пример 3:     In: arr = [1, 1, 1, 2, 2]  Out: 4
*/

package practice5;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class task2 {
    
    public static List<Integer> fillArrayRandomNumbers(int quantityRandomNamber, int startRandomNamber, int stopRandomNamber) {
        
        List<Integer> result = new ArrayList<Integer>();
        
        quantityRandomNamber = Math.abs(quantityRandomNamber);

        if(quantityRandomNamber == 0) { 
            quantityRandomNamber = 1;
        }       
        
        for (int i = 0; i < quantityRandomNamber; i++) {
            result.add(i, startRandomNamber + (int)(Math.random()*stopRandomNamber));
        }

        return result;
    }

    public static Integer getNumberOfCouples(final List<Integer> list){
        
        int count = 0;
        
        int tmp = 0;
        
        Map<Integer,Integer> db = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            db.putIfAbsent(list.get(i), list.get(i));
        }
        
        for (int val: db.values()) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(val)) {
                    tmp += 1;
                }
            }

            if (tmp == 2) {
                count++;
            }

            if (tmp > 2) {
                count += tmp;
            }

            tmp = 0;
        }
        System.out.println(list);
        return count;
    }

    public static void main(String[] args) {
        List<Integer> my_list = fillArrayRandomNumbers(5, 1, 2);
        
        int res = getNumberOfCouples(my_list);
        System.out.println(res);
    }
}
