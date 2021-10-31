package by.overone.lesson9_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Atm cash = new Atm();
        if (!cash.count()) {
            System.out.print("Atm can not give you money");
        }
    }
}
