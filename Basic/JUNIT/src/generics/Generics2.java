package generics;
class Comparison {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}
class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey()   { return key; }
    public V getValue() { return value; }
}

public class Generics2 {
    public static void main(String[] args){
        Pair<Integer, String> p1 = new Pair<>(1, "");
        Pair<Integer, String> p2 = new Pair<>(1, "");
        boolean same = Comparison.compare(p1, p2);

        System.out.println(same);
    }
}
