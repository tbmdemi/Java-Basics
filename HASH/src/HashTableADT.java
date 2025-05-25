public interface HashTableADT<K, V> extends Iterable <K> {
    int size();
    boolean isEmpty();
    //hash code
    int hashCodeToIndex(int key);
    void clear();
    boolean has(K key);
    V insert (K key, V value);
    V get(K key);
    V remove(K key);
}
