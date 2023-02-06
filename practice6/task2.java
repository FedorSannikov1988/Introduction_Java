/*
Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
значений в данном массиве и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
*/
package practice6;

import java.util.Arrays;
import java.util.HashSet;

public class task2 {

    public static Integer[] initArray() {
        Integer[] res = new Integer[1000];
        for (int i = 0; i < res.length; i++){
            res[i] = (int)(Math.random()*25);
        }
        return res;
    }

    public static double getPercentUniqueValues(Integer[] array) {
        HashSet<Integer> hs = new HashSet<Integer>(Arrays.asList(array));
        
        System.out.println("+ + + + +");
        System.out.println("hs:");
        System.out.println(hs);
        System.out.println("+ + + + +");

        double percent = (hs.size() * 100) / ((double) array.length);
        return percent;
    }

    public static void main(String[] args) {
        Integer[] my_array = initArray();

        System.out.print("\n");
        System.out.println("my_array:");
        for (Integer item : my_array) {
            System.out.print(" " + item + " ");
        }
        System.out.print("\n" + "- - - - -" + "\n");

        double percent = getPercentUniqueValues(my_array);
        System.out.println(percent);
        
    }
}
