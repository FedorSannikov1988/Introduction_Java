/*
Дана последовательность положительных случайных чисел. 
Необходимо вернуть сумму уникальных чисел. 
*/

package practice5;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class task1 {

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
    
    public static Map<Integer, Integer> OnlyNonRepeatingNumbers(List<Integer> list) {
        
        Map<Integer, Integer> NonRepeatingNumbers = new HashMap<>();
        
        for (int i = 0; i < list.size(); i++) {
            NonRepeatingNumbers.putIfAbsent(list.get(i), list.get(i));
        }

        return NonRepeatingNumbers;
    }

    public static Integer summaOnlyNonRepeatingNumbers(Map<Integer, Integer> NonRepeatingNumbers) {
        
        int summa = 0;

        for (var item: NonRepeatingNumbers.entrySet()) {
            summa += item.getValue();
        }

        return summa;
    }

    public static void main(String[] args) {

        List<Integer> arraysRandomNamber = fillArrayRandomNumbers(20, 1, 7);
        
        System.out.println("Сгенерированная последовательность положительных случайных чисел:");
        for (Integer element : arraysRandomNamber) {
            System.out.print(" " + element + " ");
        }
        System.out.println();

        Map<Integer, Integer> NonRepeatingNumbers = OnlyNonRepeatingNumbers(arraysRandomNamber);

        System.out.println("Уникальные элементы:");
        for (var element : NonRepeatingNumbers.entrySet()) {
            System.out.print(" " + element.getValue() + " ");
        }
        System.out.println();

        System.out.println("Сумма унакальных элементов: " + summaOnlyNonRepeatingNumbers(NonRepeatingNumbers));
    }
}
