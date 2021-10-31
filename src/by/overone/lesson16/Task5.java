package by.overone.lesson16;

public class Task5 {
    public static void main(String[] args) {
        String str = "255.255.0.251";
        System.out.println(str.matches("(([0-9]|[1-9][0-9]| 1[0-9][0-9]|2[0-5][0-5]).){3}([0-9]|[1-9][0-9]| 1[0-9][0-9]|2[0-5][0-5])"));
    }
}
