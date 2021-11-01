package by.overone.lesson18;

public final class PairUtil {
    public static <K, V> Pair swap(Pair str) {

        return new Pair<V, K>((V)str.variable2,(K) str.variable1);
    }
}
