package by.overone.lesson15;

import java.time.ZonedDateTime;

public class Task7_2 {
    public static String numb(String number) {
        long before = ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println(before + " time before");
        String[] arr = number.split("");
        int needZero = 10 - arr.length;
        String zero = "";
        if (needZero < 0) {
            for (int j = 0; j < 10; j++) {
                zero += "0";
            }
            return zero;
        }
        for (int j = 0; j < needZero; j++) {
            zero += "0";
        }
        return zero += number;
    }

    public static void main(String[] args) {
        System.out.println(numb("222321"));
        long after = ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println(after + " time after");
    }
}
