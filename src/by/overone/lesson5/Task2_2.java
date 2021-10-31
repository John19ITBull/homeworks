package by.overone.lesson5;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input price: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input");
            sc.next();
        }
        int money = sc.nextInt();
        int temp_money = money % 100;
        switch (temp_money) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                System.out.print(money + " рублей ");
                break;
            default: {
                temp_money = temp_money % 10;
                switch (temp_money) {
                    case 1:
                        System.out.print(money + " рубль ");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.print(money + " рубля ");
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 0:
                        System.out.print(money + " рублей ");
                        break;
                }
                break;
            }
        }
    }
}
