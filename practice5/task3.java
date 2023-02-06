/* 
Вам дан массив путей, где пути[i] = [”Город А”, “Город Б”] означают, что существует прямой путь, идущий от
”Город А” до “Город Б”. Верните город назначения, то есть город без какого-либо пути, ведущего в другой город.

Пример 1: Input: s = [["Москва","Самара"], ["Курск","Пенза"],["Самара","Курск"]]  Output: Пенза
Пример 2: Input: s = [["Москва","Самара"]]  Output: Самара
*/
package practice5;

import java.util.Map;

public class task3 {

    public static String getFinalCity(final Map<String, String> map) {

        String cities = "";

        for (String val: map.values()) {
            if(!map.containsKey(val)) {
                cities = cities + " " + val;
            }
        }
        return cities;
    }

    public static void main(String[] args) {
        Map<String,String> cities = Map.of("Москва", "Самара", "Курск", "Пенза", "Самара","Курск");
        System.out.println(getFinalCity(cities));
    }
}
