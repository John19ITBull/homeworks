package by.overone.lesson15;

public class Task4 {
    public static String fio(String name, String surname, String patronymic) {
        String str2 = name + "." + surname + "." + patronymic;
        String strHigh = str2.toUpperCase();
        return strHigh;
    }

    public static void main(String[] args) {
        System.out.println(fio("Ivan", "Sidorov", "petrovich"));
    }
}
