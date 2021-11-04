package by.overone.lesson18.Task1_2;

public class MainTask1 {
    public static void main(String[] args) {
        Pair str = new Pair("String1", "String2");
        System.out.println(str.variable1 + " " + str.variable2);
        str = PairUtil.swap(str);
        System.out.println(str.variable1 + " " + str.variable2);
    }
}
