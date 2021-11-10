package by.overone.lesson22;

import java.util.*;

public class UniquePeople {
    static HashMap<String, String> map = new HashMap();

    public static boolean isUnique(Map<String, String> map) {
        Object[] collection = map.values().toArray();
        for (int i = 0; i < collection.length; i++) {
            for (int j = 0; j < collection.length; j++) {
                if (Objects.equals(collection[j].toString(), collection[i].toString()) && j != i) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        map.put("Viola", "Nursa");
        map.put("Gulya", "Kolya");
        map.put("Valera", "Kesha");
        map.put("Nadia", "Niva");
        System.out.println(isUnique(map));
    }
}
