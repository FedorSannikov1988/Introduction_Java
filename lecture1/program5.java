public class program5 {
    public static void main(String[] args) {
        boolean flag1 = 1 <= 2;
        System.out.println(flag1); // true
        System.out.println(" - - - ");
        boolean flag2 = (1 >= 2) || flag1;
        System.out.println(flag2); // true
        System.out.println(" - - - ");
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false
    }
}
