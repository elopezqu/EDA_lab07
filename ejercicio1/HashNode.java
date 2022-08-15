public class HashNode<K,V>{
    private K key;
    private V value;
    private int hashCode;
    private HashNode next;

    public HashMap(K key, V value, int hashCode){
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
}