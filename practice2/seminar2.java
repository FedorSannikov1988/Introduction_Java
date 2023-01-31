package practice2;

import java.util.Arrays;
import java.util.Scanner;

public class seminar2 {

    public static String getstring(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите любую строку: ");
        String res = scn.nextLine();
        return res;
    }
    public static void charcounter(String str){
        int count = 0;
        String jewels = "aB";
        String result = "";
        for (int i = 0; i < jewels.length(); i++){
            result += jewels.charAt(i);
            for (int j = 0; j < str.length(); j++){
                if (jewels.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            result += Integer.toString(count);
            count = 0;
        }
        System.out.println(result);

    }

    public static String shuffle(String str){
        String res = "";
        int[] arr = new int[] {5, 3, 1, 4, 2};
        for (int i = 0; i < str.length(); i++){
            int pos = arr[i] - 1;
            res += str.charAt(pos);
        }
        return res;
    }

    public static int[] generatearray(){
        Scanner scn = new Scanner(System.in);
        int arr_size = 0;
        System.out.println("Введите четное положительное число: ");
        String size = scn.nextLine();
        arr_size = Integer.parseInt(size);
        int[] res = new int[arr_size];
        for (int i = 0; i < arr_size; i++){
            res[i] = (int)(Math.random()*10 - 5);
        }
        return res;
    }

    public static void abssumm(int[] arr){
        int sep = arr.length / 2;
        int summ1 = 0;
        int summ2 = 0;
        for (int i = 0; i < sep; i++){
            summ1 += Math.abs(arr[i]);
            summ2 += Math.abs(arr[sep + i]);
        }
        if (summ1 > summ2){
            System.out.println("Левая половина больше правой");
        }
        else if (summ1 < summ2){
                System.out.println("Правая половина больше левой");
            }
        else{
            System.out.println("Половины равны.");
        }

    }
    public static int[][] generate_matrix(){
        int[][] resarr = new int[5][8];
        for (int i = 0; i < resarr.length; i++){
            for (int j = 0; j < resarr[i].length; j++){
                resarr[i][j] = (int)(Math.random()*200 - 100);
            }
        }
        return resarr;
    }

    public static int max_in_matrix(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args){
//        String stones = getstring();
//        charcounter(stones);
//        String newstr = shuffle(stones);
//        System.out.println(newstr);
//        int[] myarray = generatearray();
//        System.out.println(Arrays.toString(myarray));
//        abssumm(myarray);
        int[][] my_array = generate_matrix();
        for (int[] ints: my_array){
            System.out.println(Arrays.toString(ints));
        }
        System.out.printf("Максимальный элемент в массиве %d", max_in_matrix(my_array));


    }
}
