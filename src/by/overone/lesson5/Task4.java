package by.overone.lesson5;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int twins = 0;
        boolean flag = true;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(" " + arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && j != i) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                twins++;
            }
        }
        System.out.print("\n Not repeat: " + twins);
        int[] arr2 = new int[twins];
        twins = 0;
        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && j != i) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr2[twins] = arr[i];
                twins++;
            }
        }
        System.out.print("\n Array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(" " + arr2[i] + " ");
        }
    }
}
