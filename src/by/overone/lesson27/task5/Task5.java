package by.overone.lesson27.task5;

import java.util.Arrays;

import static java.lang.Math.pow;

public class Task5 {
    public static void main(String[] args) {
        UnaryOperator<Integer[]> arr = (number) -> {
            for (int i = 0; i < number.length; i++) {
                number[i] = (int) pow(number[i], 2);
            }
            return number;
        };
        Integer[] array = {1, 2, 3};
        System.out.println(Arrays.toString(arr.square(array)));
        BinaryOperator<String> stringBinaryOperator = (str1, str2) -> {
            String[] arr1 = str1.split("\\W+");
            for (int i = 1; i < arr1.length; i++) {
                System.out.println(arr1[i - 1] + " " + arr1[i]);
            }
            String[] arr2 = str2.split("\\W+");
            for (int i = 1; i < arr1.length; i++) {
                System.out.println(arr2[i - 1] + " " + arr2[i]);
            }
            return "";
        };
        System.out.println(stringBinaryOperator.neighbours("Das ich fantastich", "Das ist gut"));
    }
}

interface UnaryOperator<T> {
    T square(T number);
}

interface BinaryOperator<T> {
    T neighbours(T str1, T str2);
}
