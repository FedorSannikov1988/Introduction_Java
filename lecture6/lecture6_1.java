package lecture6;

import java.util.HashSet;
import java.util.Set;

public class lecture6_1 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        
        set.add(1); 
        set.add(12); 
        set.add(123);
        set.add(1234); 
        set.add(1234);
        
        System.out.println("- - -");
        System.out.println(set.contains(12)); // true
        System.out.println("- - -");
        
        set.add(null);
        System.out.println("- - -");
        System.out.println(set.size()); // 5
        System.out.println("- - -");

        System.out.println("- - -");
        System.out.println(set); // [null, 1, 1234, 123, 12]
        System.out.println("- - -");
        
        set.remove(12);

        System.out.println("- - -");
        for (var item : set) {
            System.out.println(item); // null 1 1234 123
        }
        System.out.println("- - -");

        set.clear();
        System.out.println(set);
        
    }
}
