public class program11 {
    public static void main(String[] args) {

        System.out.println("- - -");

        int[] arr1 = new int[10];
        arr1[5] = 7;
        System.out.println(arr1.length); // 10
        System.out.println(arr1[5]);

        System.out.println("- - -");

        int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr2.length); // 5
        System.out.println(arr2[3]);

        System.out.println("- - -");

        int[] arr3;
        arr3 = new int[] { 1, 2, 3, 4, 5 };

        System.out.println(arr3.length); // 5
        System.out.println(arr3[3]);

        System.out.println("- - -");

        float[] arr4;
        arr4 = new float[] { 1, 2, 3, 4, 5 };

        System.out.println(arr4.length); // 5
        System.out.println(arr4[3]);

        System.out.println("- - -");
    }
}
