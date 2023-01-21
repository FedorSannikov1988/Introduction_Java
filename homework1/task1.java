/* 
Заполните массив случайным числами и 
выведите максимальное, минимальное и среднее значение.

Для генерации случайного числа используйте метод Math.random(), 
который возвращает значение в промежутке [0, 300].
*/

package homework1;

import java.util.Scanner;

public class task1 {
    static int generation_random_number(int start_random_number, int stop_random_number){
        int random_number_in_specified_range = start_random_number + (int)(Math.random()*stop_random_number);
        return random_number_in_specified_range;
    }
    
    static int[] generation_array_random_number(int count_random_namber){

        if (count_random_namber <= 0) { count_random_namber = 1;
        }

        int[] array_random_number = new int[count_random_namber];

        for (int index = 0; index < array_random_number.length; index++) {
            array_random_number[index] = generation_random_number(0, 300);
        }
        return array_random_number;
    }

    static double calculating_average_value(int[] array_random_number){

        int summa_random_number = 0;

        for (int index = 0; index < array_random_number.length; index++) {
            summa_random_number = summa_random_number + array_random_number[index];
        }

        return summa_random_number/array_random_number.length;
    }
    
    static void print_array(int[] array_random_number){

        for (int index = 0; index < array_random_number.length; index++) {
            System.out.print(array_random_number[index]+ " ");
        }
        System.out.println();
    }
  
    static int search_maximum_element(int[] array_random_number){

        int maximum_element = array_random_number[0];

        for (int index = 0; index < array_random_number.length; index++) {

            if (array_random_number[index]>maximum_element){
                maximum_element = array_random_number[index];
            }
        }
        return maximum_element;
    }

    static int search_minimum_element(int[] array_random_number){

        int minimum_element = array_random_number[0];

        for (int index = 0; index < array_random_number.length; index++) {
            
            if (array_random_number[index]<minimum_element){
                minimum_element = array_random_number[index];
            }
        }
        return minimum_element;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Введите количество случайных чисел в массиве: ");
        int count_random_namber = iScanner.nextInt();
        iScanner.close();
        
        int[] array_random_number = generation_array_random_number(count_random_namber);

        print_array(array_random_number);
        System.out.println("максимальное значение: " + search_maximum_element(array_random_number));
        System.out.println("минимальное значение: " + search_minimum_element(array_random_number));
        System.out.println("cреднее значение: " + calculating_average_value(array_random_number));
    }
}