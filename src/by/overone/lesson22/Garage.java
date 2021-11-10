package by.overone.lesson22;

import java.util.HashMap;

public class Garage {
    static HashMap<Car, Integer> map = new HashMap<>();

    public static void inputAuto(Car name) {
        map.put(name, map.get(name) + 1);
    }

    public static void outputAuto(Car name) {
        if (map.get(name) > 0) {
            map.put(name, map.get(name) - 1);
        } else {
            System.out.println("Car exit is not possible");
        }
    }

    public static void info(Car name) {
        System.out.println("Count of " + name + " auto: " + map.get(name));
    }

    public static void main(String[] args) {
        Passengers car1 = new Passengers("Audi", "SQ7", 2017, "Red", 2700L, "AB 9404-7");
        Passengers car2 = new Passengers("BMW", "X6", 2008, "Gray", 2000L, "FM 9781-3");
        Passengers car3 = new Passengers("Audi", "TT RS", 2009, "Black", 2300L, "NT 6725-7");
        map.put(car1, 3);
        map.put(car2, 4);
        map.put(car3, 5);
        info(car1);
        inputAuto(car1);
        info(car1);
        info(car2);
        outputAuto(car2);
        info(car2);
    }
}
