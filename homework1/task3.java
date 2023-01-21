/* 
Напишите программу, которая выводит на консоль 
простые числа в промежутке от [2, 100].

Используйте для решения этой задачи оператор 
"%" (остаток от деления) и циклы
*/

package homework1;

public class task3 {

    public static boolean CheckNamberSimple(int namber){

        if (namber<=1) {
            return false;
        }
        else if (namber<=3) {
            return true;
        }
        else if (namber%2==0 || namber%3==0) {
            return false;
        }

        for (int i = 2; i < namber; i++) {
            if (namber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.printf("Простые числа в промежутке от 2 до 100: ");
        
        int count = 2;

        while (count <= 100) {

            if (CheckNamberSimple(count)) {
                System.out.printf(count + " ");
            }   
            count ++;
        }
    }
}