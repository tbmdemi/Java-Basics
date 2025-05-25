public class Node<K, V> {
    private int hash;
    private V value;
    private K key;

    public Node(K key, V value) {
        this.hash = key.hashCode();
        this.key = key;
        this.value = value;
    }

    public boolean equals(Node<K, V> other) {
        if (this.hash != other.hash) return false;
        return key.equals(other.key);
    }

    @Override
    public String toString() {
        return "key = " + key + " value  = " +value ;
    }
}
