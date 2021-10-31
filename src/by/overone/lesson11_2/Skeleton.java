package by.overone.lesson11_2;

import java.util.Random;

public class Skeleton extends Enemy {
    Random random = new Random();

    public Skeleton(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Skeleton attacks hero!");
        hero.takeDamage(this.damage);
        if (random.nextInt(4) == 1) {
            System.out.println("Double damage ");
            hero.takeDamage(this.damage);
        }
    }
}
