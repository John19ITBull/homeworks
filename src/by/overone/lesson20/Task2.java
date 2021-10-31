package by.overone.lesson20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int a;
        int high = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("List of marks: ");
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10) + 1);
            System.out.print(list.get(i) + "\t");
        }
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            a = iterator.next();
            if(high < a){
                high = a;
            }
        }
        System.out.println("\nThe best of marks is: " + high);
    }
}
