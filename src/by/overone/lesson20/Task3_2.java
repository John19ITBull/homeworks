package by.overone.lesson20;

import java.util.*;

public class Task3_2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("List of marks: ");
        for (int i = 0; i < 10; i++) {

            list.add(random.nextInt(10) + 1);
            System.out.print(list.get(i) + "\t");
        }
        for (int i = 9; i >= 0; i--) {
            list2.add(list.get(i));
        }
        System.out.println("\nNew list: ");
        for(int i = 0; i < 10; i++){
            System.out.print(list2.get(i) + "\t");
        }
    }
}
