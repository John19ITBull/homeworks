package by.overone.lesson11_2;

public class TrainingGround {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(250, 25);
        Warrior warrior = new Warrior("Garrosh", 150);
        System.out.println("Name of hero: " + warrior.getName());
        warrior.attackEnemy(zombie);
        Mage mage = new Mage("Jaina", 120);
        System.out.println("Name of hero: " + mage.getName());
        mage.attackEnemy(zombie);
        Archer archer = new Archer("Silvana", 140);
        System.out.println("Name of hero: " + archer.getName());
        archer.attackEnemy(zombie);
    }
}
