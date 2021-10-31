package by.overone.lesson4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int numb = random.nextInt(100);
        String str = "Prime number";
        System.out.print(numb);
        for (int i = 2; i < numb; i++) {
            if (numb % i == 0) {
                str = "Number is not prime";
            }
        }
        if (numb != 1 && numb != 0) {
            System.out.print("\n" + str);
        } else {
            System.out.print("Number is not prime");
        }
    }
}
