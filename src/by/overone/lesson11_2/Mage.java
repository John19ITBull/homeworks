package by.overone.lesson11_2;

import java.util.Random;

public class Mage extends Hero {
    Random random = new Random();

    public Mage(String name, int healthHero) {
        super(name, healthHero);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (random.nextInt(6) == 1) {
            System.out.println("Fireball!");
            enemy.takeDamage(150);
        } else {
            System.out.println("Mage attacks enemy!");
            enemy.takeDamage(28);
        }
    }
}
