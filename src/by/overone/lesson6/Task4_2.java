package by.overone.lesson6;

import java.util.Random;

public class Task4_2 {
    public static void main(String[] args) {
        int[] n = new int[11];
        int pos = 0;
        int neg = 0;
        int nul = 0;
        System.out.print("Array:");
        Random random = new Random();
        for (int i = 0; i < n.length; i++) {
            n[i] = random.nextInt(3) - 1;
            System.out.print(" " + n[i] + " ");
        }
        for (int i = 0; i < n.length; i++) {
            if (n[i] == -1) {
                neg += 1;
            } else {
                if (n[i] == 1) {
                    pos += 1;
                } else {
                    nul += 1;
                }
            }
        }
        System.out.print("\n Values with minus: " + neg);
        System.out.print("\n Values with plus: " + pos);
        System.out.print("\n Values with null: " + nul);
    }
}
