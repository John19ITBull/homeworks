package by.overone.lesson9;

import java.util.Scanner;

public class Atm {
    public int count20, count50, count100, sum;
    public Atm(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
        sum = count20 * 20 + count50 * 50 + count100 * 100;
    }
    public boolean Count() {
        int needMoney = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How much money you want?");
        while (needMoney == 0) {
            needMoney = sc.nextInt();
            if (needMoney < 0) {
                System.out.println("\nCan not negative count!");
                needMoney = 0;
            }
            if(needMoney > sum){
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
        while (needMoney >= 20) {
            needMoney -= 20;
            cash20++;
        }
        System.out.printf("\n%d of 20-rubles, %d of 50-rubles, %d of 100-rubles.\n", cash20, cash50, cash100);
        if (needMoney != 0) {
            return false;
        }
        return true;
    }
}
