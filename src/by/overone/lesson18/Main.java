package by.overone.lesson18;

public class Main {
    public static void main(String[] args) {
        Pair c = new Pair("Zui", "Kui");
        System.out.println(c.variable1 + " " + c.variable2);
        c = PairUtil.swap(c);
        System.out.println(c.variable1 + " " + c.variable2);
    }
}