import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework array, part 1.");
        System.out.println("\nTask 1,2");

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));

        double[] arr1 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(arr2));

        System.out.println("\nTask 3");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();

        System.out.println("\nTask 4");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0){
                arr1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 != 0){
                arr2[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr2));

    }
}