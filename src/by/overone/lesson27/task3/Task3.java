package by.overone.lesson27.task3;

import java.util.Objects;

public class Task3 {
    public static void main(String[] args) {
        IOperation operation = (parameter) -> {
            for (int i = 0; i < parameter.length; i++) {
                String[] arr = parameter[i].split("");
                if (Objects.equals(arr[0], "X") && Objects.equals(arr[1], "X")) {
                    System.out.println(parameter[i]);
                }
            }
        };
        demonstrate(operation, "XXKod", "MFNative");
    }

    public static void demonstrate(IOperation operation, String... parameter) {
        operation.print(parameter);
    }
}

interface IOperation {
    void print(String... parameter);
}
