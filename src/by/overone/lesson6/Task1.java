package by.overone.lesson6;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[50];
        int numb = 0;
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            for (; ; numb++) {
                if (numb % 2 != 0) {
                    array[i] = numb;
                    numb++;
                    System.out.print(array[i] + " ");
                    break;
                }
            }
        }
        System.out.println("\nSorted array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
