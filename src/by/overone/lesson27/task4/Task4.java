package by.overone.lesson27.task4;

public class Task4 {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = arr -> {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    return true;
                }
            }
            return false;
        };
        int[] arr = {-4, 2, 5, -6, 4};
        if (isPositive.test(-4, 2, 5, -6, 4)) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    System.out.println(arr[i]);
                }
            }
        } else {
            System.out.println("Positive numbers absent");
        }
    }
}

interface Predicate<T> {
    boolean test(T... arr);
}
