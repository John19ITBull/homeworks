package by.overone.lesson11_2;

import java.util.Random;

public class Mummy extends Enemy {
    Random random = new Random();

    public Mummy(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Mummy attacks hero!");
        hero.takeDamage(this.damage);
        if (random.nextInt(4) == 1) {
            System.out.println("Mummy restored life by attack");
            this.setHealth(this.getHealth() + damage);
            System.out.println("Health of enemy: " + this.getHealth());
        }
    }
}
