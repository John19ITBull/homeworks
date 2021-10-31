package by.overone.lesson7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {5, 7, 2, 4, 9};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("\nMax element is: " + array[array.length - 1]);
        System.out.print("\nMin element is: " + array[0]);
        for (int i = 1; i < array.length - 1; i++) {
            sum += array[i];
        }
        System.out.print("\nAverage without min and max: " + sum / (array.length - 2));
    }
}
