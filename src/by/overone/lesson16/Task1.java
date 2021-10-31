package by.overone.lesson16;

public class Task1 {
    public static void main(String[] args) {
        String str = "sFefeff_23@mail.com";
        System.out.println(str.matches("[a-z][\\w_]+@(mail|gmail|yandex)(.com|.org)"));
    }
}
