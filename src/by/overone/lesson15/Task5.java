package by.overone.lesson15;

import java.util.Objects;

public class Task5 {
    public static int search(String str) {
//        int words = 0;
//        String[] arr = str.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            if (!Objects.equals(arr[i], "")) {
//                words++;
//            }
//        }
//        return words;
        String[] arr = str.split("\\w+");
        return arr.length;
    }

    public static void main(String[] args) {
        System.out.println(search("goat   of war is    not goat"));
    }
}
