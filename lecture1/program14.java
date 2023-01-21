public class program14 {
    public static void main(String[] args) {

        System.out.println(" - - - ");
        int i = 123; 
        double d = i;
        System.out.println(i); // 123
        System.out.println(d); // 123.0
        System.out.println(" - - - ");

        d = 3.1415D; 
        i = (int)d;
        System.out.println(d); // 3.1415
        System.out.println(i); // 3
        System.out.println(" - - - ");

        d = 3.9415F; 
        i = (int)d;
        System.out.println(d); // 3.9415
        System.out.println(i); // 3
        System.out.println(" - - - ");

        byte b = Byte.parseByte("123");
        System.out.println(b); // 123

        //b = Byte.parseByte("1234");
        //System.out.println(b); // NumberFormatException: Value out of range
    }
}
