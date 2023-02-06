/* 
1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
2) Создать коллекцию ноутбуков.
3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
ноутбуки, отвечающие фильтру.
    
Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/
package homework6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class task1 {

    public static void sendLog(String text) throws IOException {
        
        Logger logger = Logger.getLogger(task1.class.getName());
        FileHandler fh = new FileHandler("log_for_task1.txt", true);
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        
        logger.log(Level.INFO, text);
        fh.close();
    }
    
    public static Integer getDataIntegerConsole(String text) throws IOException {
    
        System.out.printf(text);
        
        while (true) {
            try {
                Scanner terminalScanner = new Scanner(System.in);
                int dataInt = terminalScanner.nextInt();
                return dataInt;
            }
            catch (Exception e) {
                sendLog(e.toString());
            }
        }
    }

    public static String getDataStringConsole(String text) throws IOException {
    
        System.out.printf(text);
        
        while (true) {
            try {
                Scanner terminalScanner = new Scanner(System.in);
                String dataStr = terminalScanner.next();
                return dataStr;
            }
            catch (Exception e) {
                sendLog(e.toString());
            }
        }
    }

    public static List<Laptop> initListLaptopUsedConsole() throws IOException {

        List<Laptop> listLaptop = new ArrayList<Laptop>();

        boolean flagEndAsk = true;

        int quantity = 0;

        while(flagEndAsk) {
            
            quantity = getDataIntegerConsole("Введите количество записей которое хотите создать: ");

            if(quantity>=1) {
                flagEndAsk = false;
            }
        }

        for (int i = 0; i < quantity; i++) {

            System.out.println("№ " + ((int)(i+1)));

            int price = getDataIntegerConsole("Prise Laptop Rub: ");
            int ramMb = getDataIntegerConsole("RAM Laptop Mb: ");
            int sizeHdMb = getDataIntegerConsole("Size Hard Dick Laptop Mb: ");

            String processor = getDataStringConsole("Processor Laptop: ");
            String operatingSystem = getDataStringConsole("Operating System Laptop: ");
            String colorBody = getDataStringConsole("Color body Laptop: ");

            Laptop lapTop = new Laptop(price, ramMb, sizeHdMb, colorBody, processor, operatingSystem);

            listLaptop.add(lapTop);
        
        }
        return listLaptop;
    }

    public static HashMap<String, Integer> initHashMapForFilterLaptop() throws IOException {

        HashMap<String, Integer> hashMapForFilterLaptop = new HashMap<String, Integer>();

        int maxPrice = 0;
        int minRAM  = 0;
        int minHD = 0;

        boolean flagEndAskmaxPrice = true;

        while(flagEndAskmaxPrice) {
            
            maxPrice = getDataIntegerConsole("Maximum price Laptop Rub: ");

            if(maxPrice>=1) {
                flagEndAskmaxPrice = false;
            }
        }

        boolean flagEndAskminRAM = true;

        while(flagEndAskminRAM) {
            
            minRAM = getDataIntegerConsole("Minimum size RAM Mb: ");

            if(minRAM>=1) {
                flagEndAskminRAM = false;
            }
        }

        boolean flagEndAskminHD = true;

        while(flagEndAskminHD) {
            
            minHD = getDataIntegerConsole("Minimum size Hard Disk Mb: ");

            if(minHD>=1) {
                flagEndAskminHD = false;
            }
        }

        hashMapForFilterLaptop.put("Maximum price Laptop Rub: ", maxPrice);
        hashMapForFilterLaptop.put("Minimum size RAM Mb: ", minRAM);
        hashMapForFilterLaptop.put("Minimum size Hard Disk Mb: ", minHD);
        
        return hashMapForFilterLaptop;
    }

    public static List<Laptop> MyFilterV1(HashMap<String, Integer> params, List<Laptop> listLaptop) {

        List<Laptop> sortListLaptop = new ArrayList<Laptop>();
        
        String key1 = "Maximum price Laptop Rub: ";
        String key2 = "Minimum size RAM Mb: ";
        String key3 = "Minimum size Hard Disk Mb: ";

        for (Laptop laptop : listLaptop) {

            if (laptop.getPriceRub() <= params.get(key1) && 
                laptop.getRamMb() >= params.get(key2) &&
                laptop.getSizeHdMb() >= params.get(key3)) {
                    sortListLaptop.add(laptop);
                }
        }
        return sortListLaptop;
    }

    public static void main(String[] args) throws IOException {
        
        List<Laptop> listLaptop = initListLaptopUsedConsole();

        System.out.println("Введенные данные: ");
        for (Laptop laptop : listLaptop) {
            System.out.println(laptop);
        }

        HashMap<String, Integer> hashMapForFilterLaptop = initHashMapForFilterLaptop();

        System.out.println("- - - - - - - ");
        System.out.println("Введенные критерии сортировки: ");
        for (var point : hashMapForFilterLaptop.entrySet()) {
            System.out.printf( "\n" + point.getKey() + " " + point.getValue() + "\n");
        }

        System.out.println("- - - - - - - ");
        System.out.println("Отсортированный данные по заданным критериям: ");
        List<Laptop> sortListLaptop = MyFilterV1(hashMapForFilterLaptop, listLaptop);
        for (Laptop laptop : sortListLaptop) {
            System.out.println(laptop);
        }
    }
}
