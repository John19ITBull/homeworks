package by.overone.lesson15;

import java.time.ZonedDateTime;

public class Task7_1 {
    public static String numb(long number) {
        long before = ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println(before + " time before");
        String iS = Long.toString(number);
        int needZero = 10 - iS.length();
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
        return zero += iS;
    }

    public static void main(String[] args) {
        System.out.println(numb(222321L));
        long after = ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println(after + " time after"); // the fastest way
    }
}
