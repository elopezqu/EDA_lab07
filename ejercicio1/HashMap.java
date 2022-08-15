import Propuestos.HashTable;

public class HashMap implements HashTable{

    public int size(){
    	return size;
    }

    public boolean isEmpty(){
    	return size() == 0 
    }

    public boolean containsKey(Object key){return true;}

    public boolean containsValue(Object value){return true;}

    public Integer get(String key){return -1;}

    public Integer put(String key, Integer value){return -1;}

    public Integer remove(Object key){return -1;}

    public void clear(){}

    public int hashCode(){return -1;}

    public String toString(){return "";};
}
