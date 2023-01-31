/* 
Дан Deque состоящий из последовательности цифр.
Необходимо проверить, что последовательность цифр 
является палиндромом
*/
package practice4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class task1 {

    public static boolean checkingForPalindrome(Deque<Integer> deque) {

        int start = 0;
        int finish = 0;
        int quantityDigitNumber = deque.size();

        for (int i = 0; i < quantityDigitNumber/2; i++) {

            start = deque.pollFirst();
            finish = deque.pollLast();

            if (start != finish) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        Integer[] numberRecordedByBit = {1, 2, 3, 3, 2, 1};
        List<Integer> listMadeArray = Arrays.asList(numberRecordedByBit);
        Deque<Integer> deque = new ArrayDeque<>(listMadeArray);

        if (checkingForPalindrome(deque)) {
            System.out.println(listMadeArray + " <- является Полиндром");
        }
        else {
            System.out.println(listMadeArray + " <- НЕ является Полиндром");
        }
    }
}