package by.overone.lesson9_2;

import java.util.Scanner;

public class Atm {
    private int count20, count50, count100, sum;

    public Atm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 20: ");
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input ");
                sc.next();
            }
            count20 = sc.nextInt();
        } while (count20 < 0);
        System.out.println("Input 50: ");
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input ");
                sc.next();
            }
            this.count50 = sc.nextInt();
        } while (count50 < 0);
        System.out.println("Input 100: ");
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input ");
                sc.next();
            }
            this.count100 = sc.nextInt();
        } while (count100 < 0);
        sum = count20 * 20 + count50 * 50 + count100 * 100;
    }

    public Atm(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
        sum = count20 * 20 + count50 * 50 + count100 * 100;
    }

    public boolean count() {
        int needMoney = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How much money you want?");
        while (needMoney == 0) {
            needMoney = sc.nextInt();
            if (needMoney < 0) {
                System.out.println("\nCan not negative count!");
                return false;
            }
            if (needMoney > sum) {
                return false;
            }
        }
        int cash20 = 0, cash50 = 0, cash100 = 0;
        while (needMoney >= 100 && count100 != 0) {
            needMoney -= 100;
            count100--;
            cash100++;
        }
        while (needMoney >= 50 && count50 != 0) {
            needMoney -= 50;
            count50--;
            cash50++;
        }
        while (needMoney >= 20 && count20 != 0) {
            needMoney -= 20;
            count20--;
            cash20++;
        }
        if (needMoney != 0) {
            return false;
        }
        System.out.printf("\n%d of 20-rubles, %d of 50-rubles, %d of 100-rubles.\n", cash20, cash50, cash100);
        return true;
    }
}
