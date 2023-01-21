public class program {
    public static void main(String[] args) {
        short age = 10;
        int salary = 123456;
        System.out.println(age); //10
        System.out.println(salary); //123456

        System.out.println(" - - - ");

        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415

        System.out.println(" - - - ");

        char ch1 = '1';
        char ch2 = 123;
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(Character.isDigit(ch1)); // true
        ch1 = 'a';
        System.out.println(Character.isDigit(ch1)); // false

        System.out.println(" - - - ");

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false

        System.out.println(" - - - ");

        String msg ="Hello world";
        System.out.println(msg);

        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456
        System.out.println(getType(a)); // Integer
        System.out.println(getType(d)); // Double
        d = 1022;
        System.out.println(d); // 1022

        System.out.println(" - - - ");

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        System.out.println(" - - - ");

        boolean f = 1 > 2;
        System.out.println(f);
    }
    
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}