package by.overone.lesson13;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal(1, "Barsik", 4, false);
        Animal catCopy = new Animal(1, "Barsik", 4, false);
        Animal dog = new Animal(2, "Sharik", 4, true);
        System.out.println(cat.toString());
        System.out.println(cat.hashCode());
        System.out.println("Equal cat with copy: " + cat.equals(catCopy));
        System.out.println("Equal cat with dog: " + cat.equals(dog));
        System.out.println(dog.toString());
        System.out.println(dog.hashCode());
        Animal characters = new Animal(7.5, 0.37);
        System.out.println("IMT: "+ characters.account());
        System.out.println("Square of dog: " + characters.account(BigDecimal.valueOf(35.657765), BigDecimal.valueOf(37.34234235)));
    }
}
