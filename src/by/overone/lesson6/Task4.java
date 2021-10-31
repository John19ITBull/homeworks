package by.overone.lesson6;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[11];
        int zero = 0;
        int onePos = 0;
        int oneNeg = 0;
        Random random = new Random();
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(3) - 1;
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero += 1;
            } else {
                if (arr[i] == 1) {
                    onePos += 1;
                } else {
                    oneNeg += 1;
                }
            }
        }
        if (zero > onePos && zero > oneNeg) {
            System.out.print("\nThe most number is 0 ");
        }
        if (onePos > zero && onePos > oneNeg) {
            System.out.print("\nThe most number is 1 ");
        }
        if (oneNeg > zero && oneNeg > onePos) {
            System.out.print("\nThe most number is -1 ");
        }
    }
}
