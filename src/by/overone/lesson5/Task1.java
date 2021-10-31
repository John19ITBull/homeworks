package by.overone.lesson5;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input");
            sc.next();
        }
        int a = sc.nextInt();
        int[] arr = new int[a];

        System.out.print("Input k: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input");
            sc.next();
        }
        double k = sc.nextDouble();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            if (arr[i] % k == 0) {
                sum += arr[i];
            }
        }
        System.out.print(sum);
    }
}
