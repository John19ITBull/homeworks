package by.overone.lesson3;

public class Task4 {
    public static void main(String[] args) {
        int min = 20;
        if (min >= 0 && min <= 14) {
            System.out.print("Число " + min + " попадает в первую четверть");
        } else {
            if (min > 14 && min <= 29) {
                System.out.print("Число " + min + " попадает во вторую четверть");
            }
            if (min > 29 && min <= 44) {
                System.out.print("Число " + min + " попадает в третью четверть");
            }
            if (min > 44 && min <= 59) {
                System.out.print("Число " + min + " попадает в четвертую четверть");
            }
        }
    }
}
