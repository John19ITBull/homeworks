package by.overone.lesson4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        double[] array = new double[1000];
        Random random = new Random();
        double aver = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() + random.nextInt(10);
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n" + " Minimum array value: " + array[0]);
        System.out.print("\n" + " Maximum array value: " + array[999]);
        for (int i = 0; i < array.length; i++) {
            aver += array[i];
        }
        System.out.print("\n" + " Average array value: " + aver / 1000);
    }
}
