package by.overone.lesson4;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 6, 7};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
