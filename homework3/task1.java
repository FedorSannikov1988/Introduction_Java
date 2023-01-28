/*
Домашнее задание:
Пусть дан произвольный список целых чисел:

1) Нужно удалить из него четные числа;
2) Найти минимальное значение;
3) Найти максимальное значение;
4) Найти среднее значение.
*/
package homework3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class task1 {

    public static int generation_random_int_number(int start_random_number, int stop_random_number) {

        int random_number_in_specified_range = start_random_number + (int)(Math.random()*stop_random_number);
        return random_number_in_specified_range;
    }

    public static List<Integer> generating_list_random_integers(int quantity_random_numbers, int start_random_number, int stop_random_number) {
        
        //List<Integer> list_random_integers = new ArrayList<Integer>();
        List<Integer> list_random_integers = new ArrayList<>();

        for (int i = 0; i < quantity_random_numbers; i++) {
            list_random_integers.add(generation_random_int_number(start_random_number, stop_random_number));
        }

        return list_random_integers;
    }
    
    public static int get_data_console_format_int_return_int(String text) throws IOException {

        System.out.printf(text);
        
        while (true) {
            try {
                Scanner terminal_scanner = new Scanner(System.in);
                int data_int = terminal_scanner.nextInt();
                terminal_scanner.close(); //- ? (спосить у преподователя)
                return data_int;
            }
            catch (Exception e) {
                System.out.println(e.toString());
                System.out.printf("Please repeat the data entry: ");
            }
        }
    }

    public static List<Integer> removing_even_numbers(List<Integer> input_list) {

        List<Integer> output_list = new ArrayList<>();

        for (int i = 0; i < input_list.size(); i++) {
            if (input_list.get(i)%2 !=0) {
                output_list.add(input_list.get(i));
            }
        }

        return output_list;
    }

    public static int search_maximum_in_list_int_number(List<Integer> input_list) {
        
        int maxValue = input_list.get(0);

        for (int i = 1; i < input_list.size(); i++) {
            if (input_list.get(i) > maxValue) {
                maxValue = input_list.get(i);
            }
        }
        return maxValue;
    }

    public static int search_minimal_in_list_int_number(List<Integer> input_list) {

        int minValue = input_list.get(0);

        for (int i = 1; i < input_list.size(); i++) {
            if (input_list.get(i) < minValue) {
                minValue = input_list.get(i);
            }
        }
        return minValue;
    }

    public static double calculating_average_value_for_list_int_number(List<Integer> input_list) {

        double summa = 0;

        for (int i = 0; i < input_list.size(); i++) {
            summa += input_list.get(i);
        }
        return (summa/input_list.size());
    }

    public static void main(String[] args) throws IOException {

        boolean flag_for_end_user_survey = true;

        int quantity_random_numbers = 0;
        
        while(flag_for_end_user_survey) {
            
            quantity_random_numbers = get_data_console_format_int_return_int("Количество элементов в произвольном списке целых чисел: ");
            
            if (quantity_random_numbers > 0){
                flag_for_end_user_survey = false;
            }
            else{
                System.out.println("Введенное число должно быть больше нуля");
            }
        }
        
        int start_random_number = get_data_console_format_int_return_int("Начальное значение для генерации случайных элементов в массиве: ");
        int stop_random_number = get_data_console_format_int_return_int("Конечное значение для генерации случайных элементов в массиве: ");

        List<Integer> list_random_integers_namber = generating_list_random_integers(quantity_random_numbers, start_random_number, stop_random_number);
        System.out.println("Сгенерированный произвольный список целых чисел");
        System.out.println(list_random_integers_namber);
        
        System.out.println("Удалены все четные числа из сгенерированного списка:");
        List<Integer> list_without_even_numbers = removing_even_numbers(list_random_integers_namber);
        System.out.println(list_without_even_numbers);   

        System.out.println("Максимальное значение в модифицированном (без четных элементов) списке:");
        System.out.println(search_maximum_in_list_int_number(list_without_even_numbers));

        System.out.println("Минимальное значение в модифицированном (без четных элементов) списке:");
        System.out.println(search_minimal_in_list_int_number(list_without_even_numbers));  

        System.out.println("Среднее значение для модифицированного (без четных элементов) списка:");
        System.out.println(calculating_average_value_for_list_int_number(list_without_even_numbers));
    }
}