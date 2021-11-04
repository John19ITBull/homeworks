package by.overone.lesson18.Task1_2;

public class Pair<K, V> {
    public K variable1;
    public V variable2;

    public Pair(K variable1, V variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    public K getVariable1() {
        return variable1;
    }

    public void setVariable1(K variable1) {
        this.variable1 = variable1;
    }

    public V getVariable2() {
        return variable2;
    }

    public void setVariable2(V variable2) {
        this.variable2 = variable2;
    }
}
