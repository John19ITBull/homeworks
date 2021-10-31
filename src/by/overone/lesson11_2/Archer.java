package by.overone.lesson11_2;

import java.util.Random;

public class Archer extends Hero {
    private int damage = 27;
    Random random = new Random();

    public Archer(String name, int healthHero) {
        super(name, healthHero);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer attacks enemy!");
        enemy.takeDamage(damage);
        if (random.nextInt(3) == 1) {
            System.out.println("The sight has become more accurate");
            damage += 3;
        }
    }
}
