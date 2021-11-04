package by.overone.lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Tasks {
    public static Integer countUnique(ArrayList<Integer> list) {
            if (list.isEmpty()) {
                return 0;
            }
        HashSet<Integer> listUnique = new HashSet<>(list);
        return listUnique.size();
    }

    public static HashSet<String> englishText(String text) {
        String[] arr = text.split("\\W+");
        return new HashSet<>(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(countUnique(list));
        System.out.println(englishText("Aa bb aa, bb! Cc ww cc"));
    }
}
