package by.overone.lesson25;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException exceptionType1) {
            System.out.println("Error");
        }
    }
}
