public class program12_1 {
    public static void main(String[] args) {
        int[] arr1[] = new int[3][3];
        arr1[0][0] = 5;
        System.out.println("- - -");
        System.out.printf("%d ", arr1[0][0]);
        System.out.println();
        System.out.println("- - -");
        System.out.printf("%d ", arr1[0][0]);
        System.out.println();
        System.out.println("-+-+-");
        System.out.println(arr1[0][0]);
        System.out.println("-+-+-");

        for (int[] line : arr1) {
            for (int item : line) {
                System.out.printf("%d ", item);
        }
        
        System.out.println();
        }
    }
}
