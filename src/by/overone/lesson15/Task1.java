package by.overone.lesson15;

import java.time.ZonedDateTime;

public class Task1 {
    public static void main(String[] args) {
        long before = ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println(before + " time before");
        for (int i = 0; i < 1000; i++) {
            String str = "How many pelmeni";
            str += ", how much kumach?";
        }
        long after = ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println(after + " time after and start time of second programm");
        for (int i = 0; i < 1000; i++) {
            String str2 = "How many pelmeni";
            StringBuilder strBuilder = new StringBuilder(str2);
            strBuilder.append(", how much kumach?");
        }
        long after2 = ZonedDateTime.now().toInstant().toEpochMilli();
        System.out.println(after2 + " time after"); // faster than 1st way
    }
}
