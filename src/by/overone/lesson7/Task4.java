package by.overone.lesson7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.print("Input count of elements: ");
        while (!sc.hasNextInt())
            sc.next();
        count = sc.nextInt();
        int fibPast = 1;
        int fib = 1;
        int sum;
        for (int i = 0; i < count; i++) {
            if (i < 1) {
                System.out.print(0 + " ");
            } else {
                if (i < 3) {
                    System.out.print(fibPast + " ");
                } else {
                    sum = fib + fibPast;
                    fibPast = fib;
                    fib = sum;
                    System.out.print(sum + " ");
                }
            }
        }
    }
}
