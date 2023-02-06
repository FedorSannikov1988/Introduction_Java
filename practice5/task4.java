/* 
Дана строка. 
Необходимо написать метод, который отсортирует слова в 
строке по длине с помощью TreeMap.
Слова с одинаковой длиной не должны “потеряться”.
*/

package practice5;

import java.util.Map;
import java.util.TreeMap;

public class task4 {

    public static String getSortedIncludesWords(final Map<Integer, String> map){

        return String.join(" ", map.values());
    }

    public static void main(String[] args) {

        String str = "Сорок тысяч обезьян в жопу сунули банан";
        
        TreeMap<Integer, String> strmap = new TreeMap<Integer,String>();
        
        for (String val: str.split(" ")){
            strmap.put(Math.abs(val.hashCode()), val);
        }

        System.out.println(strmap);
        System.out.println(getSortedIncludesWords(strmap));
    }
}
