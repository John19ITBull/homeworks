package by.overone.lesson11_2;

import java.util.Random;
import java.util.Scanner;

public class BattleGround {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        Hero hero = null;
        System.out.println("Choice your hero. 0 - Warrior, 1 - Mage, 2 - Archer");
        while (!sc.hasNextInt())
            sc.next();
        int choice = sc.nextInt();
        switch (choice) {
            case 0:
                hero = new Warrior("Garrosh", 850);
                break;
            case 1:
                hero = new Mage("Jaina", 750);
                break;
            case 2:
                hero = new Archer("Silvana", 700);
                break;
        }
        System.out.println("Name of hero: " + hero.getName() + ". Health of hero: " + hero.getHealth());
        for (int i = 0; i < 2; i++) {
            Enemy enemy = null;
            if (hero.isAlive()) {
                switch (random.nextInt(1)) {
                    case 0:
                        enemy = new Zombie(500, 25);
                        break;
                    case 1:
                        enemy = new Skeleton(400, 28);
                        break;
                    case 2:
                        enemy = new Mummy(550, 22);
                        break;
                }
                System.out.println("Health of enemy: " + enemy.getHealth());
                while (enemy.isAlive() && hero.isAlive()) {
                    hero.attackEnemy(enemy);
                    if (enemy.isAlive()) {
                        enemy.attackHero(hero);
                    }
                }
                if (!enemy.isAlive()) {
                    System.out.println("Enemy died");
                }
            }
        }
        if (hero.isAlive()) {
            System.out.println("You win!");
        } else {
            System.out.println("Hero died");
            System.out.println("Game over");
        }
    }
}
