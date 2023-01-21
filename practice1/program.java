package practice1;

import java.util.Scanner;

public class program {

    public static void SayHello(){
        System.out.println("Hello World!!!");
    }

    public static void GetName(){
        Scanner scn = new Scanner(System.in);
        System.out.println(" Введите имя: ");
        String username = scn.nextLine();
        System.out.println("Hello " + username + "!");
        scn.close();
    }

    public static void HiByTime(){
        Scanner scn = new Scanner(System.in);
        System.out.println(" Введите имя: ");
        String username = scn.nextLine();
        System.out.println(" Введите часы: ");
        String hour = scn.nextLine();
        System.out.println(" Введите минуты: ");
        String minute = scn.nextLine();
        int hours = Integer.parseInt(hour);
        int minutes = Integer.parseInt(minute);
        scn.close();

        if (hours >= 5 && hours < 12){
            System.out.println(username + " Доброе утро! " + "сейчас " + hours + ":" + minutes);
        }
        if (hours >= 12  && hours < 18){
            System.out.println(username + " Добрый день! " + "сейчас " + hours + ":" + minutes);
        }
        if (hours >= 18  && hours < 23){
            System.out.println(username + " Добрый вечер! " + "сейчас " + hours + ":" + minutes);
        }
        if (hours >= 23  || hours < 5){
            System.out.println(username + " Доброй ночи! " + "сейчас " + hours + ":" + minutes);
        }

    }

    public static void CounterOf1(int[] arr){
        int incounter = 0;
        int rescounter = 0;
        int i = 0;
        while (i < arr.length){
            if (arr[i] == 1){
                incounter++;
            }
            if (arr[i] != 1 || i == arr.length - 1){
                if (incounter > rescounter){
                    rescounter = incounter;
                    incounter = 0;
                }

            }
            i++;
        }
        System.out.println(rescounter);

    }

    public static void main(String[] args) {
//        SayHello();
//        GetName();
//        HiByTime();
        int[] arr = new int[] {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        CounterOf1(arr);
    }
}