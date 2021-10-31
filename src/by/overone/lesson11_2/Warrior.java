package by.overone.lesson11_2;

import java.util.Random;

public class Warrior extends Hero {
    private int rage;
    private int damage = 22;
    Random random = new Random();

    public Warrior(String name, int healthHero) {
        super(name, healthHero);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Warrior attacks enemy!");
        enemy.takeDamage(damage);
        if (rage < 5) {
            if (random.nextInt(7) == 1) {
                System.out.println("Warrior is charging with rage ");
                rage++;
            }
            if (rage == 5) {
                damage = 500;
            }
        }
    }
}
