/*
Даны два Deque представляющие два целых числа. 
Цифры хранятся в обратном порядке, и каждый из их узлов содержит одну цифру.

1) Умножьте два числа и верните произведение в виде связанного списка.

2) Сложите два числа и верните сумму в виде связанного списка. Одно или 
два числа должны быть отрицательными
*/
package homework4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task1 {

    public static Integer disassemblingNegAndPosNumber(Deque<Integer> namber) {

        int intNamber = 0;

        int byffer = 0;

        int flagZnak = 1;
        
        int digNam = namber.size();
        
        for (int i = digNam; i > 0; i--) {
            
            byffer = namber.removeLast();

            if(byffer<0) {
                byffer *=-1;
                flagZnak = -1;
            }
            intNamber += byffer*Math.pow(10, i-1);
        }
        return intNamber * flagZnak ;
    }

    public static Deque<Integer> assemblingNegAndPosNumber(Integer namber) {

        Deque<Integer> deque = new ArrayDeque<>();

        int flafZnak = 1;

        if(namber < 0) {
           flafZnak = -1;
           namber *= -1;
        }

        while (namber>0) {
            deque.add(namber%10);
            namber/=10;
        }

        if (flafZnak < 0) {
            deque.addLast(flafZnak*deque.pollLast());
        }

        return deque;
    }

    public static Deque<Integer> mulTwoNum(Deque<Integer> d1, Deque<Integer> d2) {

        int resNam = disassemblingNegAndPosNumber(d1) * disassemblingNegAndPosNumber(d2);

        return assemblingNegAndPosNumber(resNam);
    }

    public static Deque<Integer> sumTwoNum(Deque<Integer> d1, Deque<Integer> d2) {

        int resSum = disassemblingNegAndPosNumber(d1) + disassemblingNegAndPosNumber(d2);

        return assemblingNegAndPosNumber(resSum);
    }

    public static void main(String[] args) {

        Deque<Integer> namberOne = new ArrayDeque<>(Arrays.asList(5, -2));
        Deque<Integer> namberTwo = new ArrayDeque<>(Arrays.asList(0, 1));

        System.out.println("\n" + "Результат умножения " + namberOne + " и " + namberTwo + " равен " + mulTwoNum(namberOne, namberTwo));

        Deque<Integer> namberThree = new ArrayDeque<>(Arrays.asList(5, -2));
        Deque<Integer> namberFour = new ArrayDeque<>(Arrays.asList(6));
        
        System.out.println("\n" + "Результат сложения " + namberThree + " и " + namberFour + " равен " + sumTwoNum(namberThree , namberFour ) + "\n");
    }

}