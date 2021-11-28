package by.overone.lesson27.task9;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aabbccdd");
        list.add("key");
        list.add("aa...zz");
        list.add("bold");
        list.add("zz...aa");
        list.stream()

                .filter(element -> element.substring(0, 2).contains("aa"))
                .forEach(element -> System.out.println(element));
    }
}
