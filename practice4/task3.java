/*
Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
является ли входная строка логически правильной.

Входная строка логически правильная, если:
1) Открытые скобки должны быть закрыты скобками того же типа.
2) Открытые скобки должны быть закрыты в правильном порядке. 
3) Каждая закрывающая скобка имеет соответствующую открытую скобку того же типа.

Пример:
()[] = true
() = true
{[()]} = true
()() = true
)()( = false
*/
package practice4;

import java.util.ArrayDeque;
import java.util.Deque;

public class task3 {

    public static boolean validate(String inpuTText) {

        char bufferForCompare = ' ';
        
        Deque<Character> stack = new ArrayDeque<>();

        for (char simvol : inpuTText.toCharArray()) {

        //System.out.println("simvol: "+ simvol);

            if (simvol == '(' || simvol == '{' || simvol == '[') {

                stack.addFirst(simvol);

//                System.out.println("->"+stack);
            }

            if (simvol == ')' || simvol == '}' || simvol == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                bufferForCompare = stack.peekFirst();
                
                if ((simvol == ')' && bufferForCompare == '(') || 
                    (simvol == '}' && bufferForCompare == '{') || 
                    (simvol == ']' && bufferForCompare == '['))  {

//                  System.out.println("dell "+ stack.peekFirst());
                    stack.pollFirst();
//                  System.out.println("<-"+stack);
                }
            }          
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println("()[]{} => " + validate("()[]{}"));
        System.out.println("()[] => " + validate("()[]"));
        System.out.println("() => " + validate("()"));
        System.out.println("()) => " + validate("())"));
        System.out.println("(() => " + validate("(()"));
        System.out.println("{[()]} => " + validate("{[()]}"));
        System.out.println("{[[)]} => " + validate("{[[)]}"));
        System.out.println("{([)]} => " + validate("{([)]}"));
        System.out.println("()() => " + validate("()()"));
        System.out.println(")()( => " + validate(")()("));
        System.out.println("(w)(a) => " + validate("(w)(a)"));


    }
}