package by.overone.lesson18.Task1_2;

public final class PairUtil {
    public static <K, V> Pair swap(Pair str) {

        return new Pair<>((V)str.variable2,(K) str.variable1);
    }
}
