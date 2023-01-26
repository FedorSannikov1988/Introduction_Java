package lecture3;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class program3 {
    public static void main(String[] args) {

        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");

        StringBuilder[] date = { day, month, year };
        List<StringBuilder> list_data = Arrays.asList(date);

        System.out.println(list_data); // [29, 9, 1990]
        date[1] = new StringBuilder("09");
        System.out.println(list_data); // [29, 09, 1990]

        StringBuilder year_for_operations = new StringBuilder("1990");
        StringBuilder[] date_for_operations = {year_for_operations};
        List<StringBuilder> list_data_for_operations = Arrays.asList(date_for_operations);

        System.out.println("- - -");
        System.out.println(list_data_for_operations);

        //list_data.containsAll(list_data_for_operations);
        //System.out.println(list_data.containsAll(list_data_for_operations));

        List<StringBuilder> list_proba = new ArrayList<StringBuilder>();
        list_proba.add(year_for_operations);
        
        System.out.println("- - -");
        System.out.println(list_proba);

        System.out.println(list_data.removeAll(list_proba));
    }
}
