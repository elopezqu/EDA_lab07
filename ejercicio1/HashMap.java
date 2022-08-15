
import java.util.ArrayList;
public class HashMap implements HashTable<K, V>{

    ArrayList<HashNode<K, V>>bucket=new ArrayList<>();
	int numBuckets=10;
	int size;
	public HashMap()
	{
		for(int i=0;i<numBuckets;i++)
		{
			bucket.add(null);
		}
	}
	public int size(){return -1;}

    public boolean isEmpty(){return true;}

    public boolean containsKey(Object key){return true;}

    public boolean containsValue(Object value){return true;}

    public Integer get(String key){return -1;}

    public Integer put(String key, Integer value){return -1;}

    public Integer remove(Object key){return -1;}

    public void clear(){}
	
    public String toString(){
        String todo="";
        for(int i=0;i<numBuckets;i++){
            todo=todo+i+".- ";
            HashNode<K, V> head=bucket.get(i);
            while(head!=null){
                todo=todo+"("+"key: "+head.key+" value: "+head.value+") ";
                head=head.next;
            }
            todo=todo+"\n";
        }
		
		return todo;	
	}
	public static void main(String[] args){
	}
}
