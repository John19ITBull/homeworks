package by.overone.lesson5;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int a = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = a;
        System.out.print(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + "\n");
    }
}
