package by.overone.lesson11_2;

public abstract class Enemy implements Mortal {
    private int health;
    protected int damage;

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Health of enemy: " + health);
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(damage);
    }


    public boolean isAlive() {
        return health > 0;
    }
}
