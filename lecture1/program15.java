import java.util.Scanner;

public class program15 {
    public static void main(String[] args) {

        System.out.printf("name: ");

        Scanner terminal_scanner = new Scanner(System.in);
        String text = terminal_scanner.nextLine();
        terminal_scanner.close();

        System.out.printf("Привет, %s!", text);
    }
    
}
