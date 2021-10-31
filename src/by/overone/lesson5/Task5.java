package by.overone.lesson5;

public class Task5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int a = 0;
        int[] arr2 = {5, 6, 7};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[a] = arr1[i];
            a++;
            if (i < arr1.length + arr2.length) {
                arr3[a] = arr2[i];
                a++;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(" " + arr3[i] + " ");
        }
    }
}
