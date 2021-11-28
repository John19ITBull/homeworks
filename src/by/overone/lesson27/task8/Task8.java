package by.overone.lesson27.task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            return new StringBuilder(userInput).reverse().toString();
        };
        System.out.println(supplier.get());
    }
}

interface Supplier<T> {
    T get();
}
