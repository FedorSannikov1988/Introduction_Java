/*
Даны два Deque представляющие два неотрицательных целых числа. 
Числа хранятся в обратном порядке, и каждый из их узлов содержит одну цифру.
Сложите два числа и верните сумму в виде связанного списка.
*/
package practice4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task2 {

    public static Deque<Integer> sum(Deque<Integer> namber1, Deque<Integer> namber2) {

        Deque<Integer> resaltSumma = new ArrayDeque<>();

        int byffer = 0;
        int summaNamber = 0;
        int quantityDigitNumber = namber1.size();

        for (int i = 0; i < quantityDigitNumber; i++) {

            summaNamber =  namber1.removeFirst() +  namber2.removeFirst();

            System.out.println(summaNamber);

            if (summaNamber > 9) {
                resaltSumma.addLast(summaNamber%10 + byffer);
                byffer = summaNamber/ 10;
            }
            else {
                resaltSumma.addLast(summaNamber + byffer);
                byffer = 0;
            }
            if (byffer > 0) {
                resaltSumma.addLast(byffer);
            }
        }
        return resaltSumma;
    }

    public static void main(String[] args) {

        Deque<Integer> namber_one = new ArrayDeque<>(Arrays.asList(9, 2, 3));
        Deque<Integer> namber_two = new ArrayDeque<>(Arrays.asList(5, 4, 7));

        System.out.println("\n" + "Сумма чиcел " + namber_one + " и "+ namber_two + " равна " + sum(namber_one, namber_two) + "\n");
    }
}