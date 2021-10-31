package by.overone.lesson15;

import java.util.Objects;

public class Task3 {
    public static boolean search(String str, String word) {
        String[] arr = str.split(" ");
        return Objects.equals(arr[0], word) && Objects.equals(arr[arr.length - 1], word);
    }

    public static void main(String[] args) {
        System.out.println(search("goat of war is not goat", "goat"));
    }
}
