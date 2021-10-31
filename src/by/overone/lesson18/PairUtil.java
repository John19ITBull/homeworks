package by.overone.lesson18;

public final class PairUtil {
    public static <K, V> Pair swap(Pair zui) {

        return new Pair<V, K>((V)zui.variable2,(K) zui.variable1);
    }
}
