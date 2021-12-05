package by.overone.lesson20;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int iter = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("List of marks: ");
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10) + 1);
            System.out.print(list.get(i) + "\t");
        }
        System.out.println("\nNew list of marks: ");
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iter = iterator.next();
            if (iter >= 4) {
                System.out.print(iter + "\t");
            }
            if (iter < 4) {
                iterator.remove();
            }
        }
    }
}
