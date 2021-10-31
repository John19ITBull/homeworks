package by.overone.lesson20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int link;
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        System.out.println("List of marks: ");
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10) + 1);
            link = list.get(i);
            list2.addFirst(link);
            System.out.print(list.get(i) + "\t");
        }
        System.out.println("\nNew list: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(list2.get(i) + "\t");
        }
    }
}
