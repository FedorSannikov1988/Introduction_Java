/* 
Реализуйте алгоритм сортировки пузырьком для сортировки массива
*/

package homework1;

import java.util.Scanner;

public class task2 {

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

    static void print_array(int[] array_random_number){

        for (int index = 0; index < array_random_number.length; index++) {
            System.out.print(array_random_number[index]+ " ");
        }
        System.out.println();
    }

    static int[] sorting_bubbles_min_max(int[] array_random_number){
        for (int i = array_random_number.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array_random_number[j] > array_random_number[j + 1]){
                    int byffer = array_random_number[j];
                    array_random_number[j] = array_random_number[j + 1];
                    array_random_number[j + 1] = byffer;
                }
            }
        }
        return array_random_number;
    }

    static int[] sorting_bubbles_max_min(int[] array_random_number){
        for (int i = array_random_number.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array_random_number[j] < array_random_number[j + 1]){
                    int byffer = array_random_number[j];
                    array_random_number[j] = array_random_number[j + 1];
                    array_random_number[j + 1] = byffer;
                }
            }
        }
        return array_random_number;
    }

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Введите количество случайных чисел в массиве: ");
        int count_random_namber = iScanner.nextInt();
        iScanner.close();
        
        int[] array_random_number = generation_array_random_number(count_random_namber);

        System.out.printf("Сгенерированный массив: ");
        print_array(array_random_number);

        System.out.printf("Отсортированный массив от меньшего к большему: ");
        print_array(sorting_bubbles_min_max(array_random_number));

        System.out.printf("Отсортированный массив от большего к меньшему: ");
        print_array(sorting_bubbles_max_min(array_random_number));
    }
}
