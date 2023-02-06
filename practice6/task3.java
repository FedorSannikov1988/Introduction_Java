package practice6;

import java.util.HashMap;
import java.util.HashSet;

public class task3 {
    // Продумайте структуру класса Бульдожка. Какие поля и методы будут актуальны для приложения, которое является
    // а) информационной системой ухода за ней
    // б) архивом выставки бульдожков
    // в) информационной системой Театра бульдожек имени Дарахвелидзе

    public static class Buldog{
        private String buldog_name = "";
        private int buldog_age = 0;
        private String buldog_color = "";
        private int buldog_weight = 0;
        private boolean is_vaccinated = false;
        private int stigma_number = 0;

        private HashMap<String, String> exhibitions = new HashMap<String, String>();
        private HashMap<String, String> shows = new HashMap<String, String>();

        public Buldog(String buldog_name, int buldog_age, String buldog_color){
            this.buldog_name = buldog_name;
            this.buldog_age = buldog_age;
            this.buldog_color = buldog_color;
        }

        public void setBuldog_weight(int buldog_weight) {
            this.buldog_weight = buldog_weight;
        }

        public void setIs_vaccinated(boolean is_vaccinated) {
            this.is_vaccinated = is_vaccinated;
        }

        public void setStigma_number(int stigma_number) {
            this.stigma_number = stigma_number;
        }

        public int getBuldog_age() {
            return buldog_age;
        }

        public int getBuldog_weight() {
            return buldog_weight;
        }

        public int getStigma_number() {
            return stigma_number;
        }

        public String getBuldog_color() {
            return buldog_color;
        }

        public String getBuldog_name() {
            return buldog_name;
        }

        public boolean isIs_vaccinated() {
            return is_vaccinated;
        }

        public void bark(){
            System.out.println("Гав-Гав");
        }

        public void participation(HashMap<String, String> hashMap,String date, String place){
            hashMap.putIfAbsent(date, place);
        }

        public void print_exhibitions(HashMap<String, String> hashMap){
            for (var item: hashMap.entrySet()) {
                System.out.printf("Собака заняла %s место, %s числа", item.getValue(), item.getKey());
            }

        }

        public void setShows(HashMap<String, String> hashMap, String show_name, String show_role){
            hashMap.putIfAbsent(show_name, show_role);
        }

    }
    public static void main(String[] args) {
        Buldog Harlamov = new Buldog("Garik", 4, "Black");
        Harlamov.setBuldog_weight(10);
        Harlamov.setIs_vaccinated(true);
        Harlamov.setStigma_number(55669988);
        if (Harlamov.isIs_vaccinated()){
            Harlamov.bark();
            Harlamov.participation(Harlamov.exhibitions, "05.02.2023", "2");
        }
        Harlamov.print_exhibitions(Harlamov.exhibitions);
    }
}
