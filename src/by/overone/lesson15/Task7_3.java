package by.overone.lesson15;

import java.time.ZonedDateTime;

public class Task7_3 {
    public static StringBuilder numb(String number) {
        long before = ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println(before + " time before");
        String[] arr = number.split("");
        int needZero = 10 - arr.length;
        String zero = "";
        if (needZero < 0) {
            StringBuilder strBuilder = new StringBuilder(zero);
            for (int j = 0; j < 10; j++) {
                zero += "0";
            }
            strBuilder.append(zero);
            return strBuilder;
        }
        for (int j = 0; j < needZero; j++) {
            zero += "0";
        }
        StringBuilder strBuilder = new StringBuilder(zero);
        strBuilder.append(number);
        return strBuilder;
    }

    public static void main(String[] args) {
        System.out.println(numb("222321"));
        long after = ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println(after + " time after");
    }
}
