package by.overone.lesson11_2;

public abstract class Hero {
    private final String name;
    private int healthHero;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return healthHero;
    }

    public Hero(String name, int healthHero) {
        this.name = name;
        this.healthHero = healthHero;
    }

    public void takeDamage(int damage) {
        healthHero -= damage;
        System.out.println("Health of hero: " + healthHero);
    }

    public abstract void attackEnemy(Enemy enemy);

    public boolean isAlive() {
        return healthHero > 0;
    }
}
