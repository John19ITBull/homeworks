package by.overone.lesson5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input price: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input");
            sc.next();
        }
        int money = sc.nextInt();
        int temp_money = money % 100;
        if (temp_money >= 11 && temp_money <= 19) {
            System.out.print(money + " рублей ");
        } else {
            temp_money = temp_money % 10;
            if (temp_money == 1) {
                System.out.print(money + " рубль ");
            }
            if (temp_money > 1 && temp_money < 5) {
                System.out.print(money + " рубля ");
            }
            if (temp_money > 4 || temp_money == 0) {
                System.out.print(money + " рублей ");
            }
        }
    }
}
