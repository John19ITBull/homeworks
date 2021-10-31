package by.overone.lesson7;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {10, 9, 14, 23, 15, 0, 9};
        int high = 0;
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\nHigh: ");
        for (int i = 0; i < array.length; i++) {
            high = array[i];
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] < array[j]) {
                    break;
                }
                if (j == i + 1) {
                    System.out.print(high + " ");
                }
            }
        }
        System.out.print(array[array.length - 1] + " ");
    }
}
