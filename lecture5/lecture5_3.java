package lecture5;

import java.util.*;

public class lecture5_3 {
    public static void main(String[] args) {

        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>(9);
        Map<Integer,String> map3 = new HashMap<>(9, 1.0f);
        map3.putIfAbsent(1, "один");
        map3.put(2, "два");
        map3.put(3, "три");
        System.out.println(map3);
        
    }
}
