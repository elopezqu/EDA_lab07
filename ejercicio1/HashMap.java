import Propuestos.HashTable;

public class HashMap implements HashTable{

    public int size(){return -1;}

    public boolean isEmpty(){return true;}

    public boolean containsKey(Object key){
      int index=getBucketIndex(key);
      HashNode<K, V> head=bucket.get(index);
      while(head!=null){
        if(head.key.equals(key)){
          return true;
        }
        head=head.next;
      }
      return false;
    }

    public boolean containsValue(Object value){

      for(int i=0;i<numBuckets;i++){
        HashNode<K, V> head=bucket.get(i);
        while(head!=null){
          if(head.value.equals(value)){
            return true;
          }
          head=head.next;
        }
      }
      return false;
    }

    public Integer get(String key){return -1;}

    public Integer put(String key, Integer value){return -1;}

    public Integer remove(Object key){return -1;}

    public void clear(){}

    public int hashCode(){return -1;}

    public String toString(){return "";};
}
