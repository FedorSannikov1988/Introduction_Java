public class program13 {
    public static void main(String[] args) {
        
        int[][] arr = new int[3][5];

        System.out.printf("%d ", arr.length);
        System.out.println();
        System.out.println("- - - - -");

        System.out.printf("%d ", arr[0].length);
        System.out.println();
        System.out.println("- - - - -");

        System.out.printf("%d ", arr[2].length);
        System.out.println();
        System.out.println("- - - - -");

        System.out.printf("%d ", arr[0][0]);
        System.out.println();
        System.out.println("- - - - -");

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.printf("%d ", arr[i][j]);
        }
        System.out.println();
        }
    }
}
