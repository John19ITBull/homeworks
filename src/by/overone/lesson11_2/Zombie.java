package by.overone.lesson11_2;

import java.util.Random;

public class Zombie extends Enemy {
    Random random = new Random();

    public Zombie(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Zombie attacks hero!");
        hero.takeDamage(this.damage);
    }

    public boolean isAlive() {
        if (getHealth() <= 0) {
            if (random.nextInt(4) == 1) {
                System.out.println("Zombie resurrected ");
                this.setHealth(150);
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}