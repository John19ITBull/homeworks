package by.overone.lesson6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Random random = new Random();
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nNew array: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
