package by.overone.lesson4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int numb = 1;
        for (int i = 0; i < array.length; i++) {
            for (; ; numb++) {
                if (numb % 13 == 0 || numb % 17 == 0) {
                    array[i] = numb;
                    numb++;
                    System.out.print(array[i] + " ");
                    break;
                }
            }
        }
    }
}
