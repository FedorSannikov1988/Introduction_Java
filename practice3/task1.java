/*
Даны следующие строки, cравнить 
их с помощью == и метода equals() 
*/
package practice3;

public class task1 {
    public static void main(String[] args) {
        
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println("+ - - - +");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println("- - -");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        System.out.println("- - -");
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));

        System.out.println("- - -");
        System.out.println(s1==s5);
        System.out.println(s1.equals(s5));

        System.out.println("- - -");
        System.out.println(s1==s6);
        System.out.println(s1.equals(s6));

        System.out.println("+ - - - +");

        String[] arr_str = new String[] {s1, s2, s3, s4, s5, s6};

        for (int i = 0; i < arr_str.length; i++) {
            for (int j = i + 1; j < arr_str.length; j++) {
                    System.out.println((i+1) + "   " + (j+1));
                    System.out.println("== " + (arr_str[i] == arr_str[j]));
                    System.out.println("equals() " + (arr_str[i].equals(arr_str[i])));
            }
        }
    }
}