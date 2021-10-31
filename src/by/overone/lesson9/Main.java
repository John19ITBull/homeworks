package by.overone.lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cash20;
        int cash50;
        int cash100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 20: ");
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input ");
                sc.next();
            }
            cash20 = sc.nextInt();
        } while (cash20 < 0);
        System.out.println("Input 50: ");
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input ");
                sc.next();
            }
            cash50 = sc.nextInt();
        } while (cash50 < 0);
        System.out.println("Input 100: ");
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input ");
                sc.next();
            }
            cash100 = sc.nextInt();
        } while (cash100 < 0);
        Atm cash = new Atm(cash20, cash50, cash100);
        if(!cash.Count()){
            System.out.print("Atm can not give you money");
        }
    }
}
