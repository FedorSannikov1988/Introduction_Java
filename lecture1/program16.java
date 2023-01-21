import java.util.Scanner;

public class program16 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        
        System.out.printf("int x: ");
        int x = iScanner.nextInt();
        System.out.println(" - - - ");
        System.out.println();

        System.out.printf("double y: ");
        double y = iScanner.nextDouble();
        iScanner.close();
        System.out.println(" - - - ");
        System.out.println();

        System.out.printf("%d + %f = %f\n", x, y, x + y);
        System.out.println(" - - - ");
        System.out.println();
    }
}
