package by.overone.lesson7;

public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println("Array1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nArray2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == (arr2[j])) {
                    counter++;
                }
            }
        }
        if (counter == arr1.length) {
            System.out.print("\nTwo arrays are equal");
        } else {
            System.out.print("\nArrays are not equal");
        }
    }
}
