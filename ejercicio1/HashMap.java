import java.util.ArrayList;


public class HashMap<K, V> implements HashTable<K, V> {

    ArrayList<HashNode<K, V>>bucket=new ArrayList<>();
	int numBuckets=10;
	int size;
	public HashMap(){
		for(int i=0;i<numBuckets;i++)
		{
			bucket.add(null);
		}
	}
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public int hashCode(K key)
	{
		int hashCod=key.hashCode();
		return Math.abs(hashCod % numBuckets);
	}
    public boolean containsKey(K key){
        int index=hashCode(key);                                                                                                                
        HashNode<K, V> head=bucket.get(index);                                                                                                        
        while(head!=null){                                                                                                                            
          if(head.key.equals(key)){                                                                                                                   
            return true;                                                                                                                              
          }                                                                                                                                           
          head=head.next;                                                                                                                             
        }                                                                                                                                             
        return false;    
    }
    public boolean containsValue(V value){
        boolean respuesta=false;
        for(int i=0;i<numBuckets;i++){
            HashNode<K, V> head=bucket.get(i);
            while(head!=null){
                if(head.value.equals(value))
                    respuesta=true;
                head=head.next;
            }
        }
		return respuesta;	
    }
	public V get(K key)
	{
		int index=hashCode(key);
		HashNode<K, V> head=bucket.get(index);
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				return head.value;
			}
			head=head.next;
		}
		return null;	
	}
	public V remove(K key)
	{
		int index=hashCode(key);
		HashNode<K, V>head=bucket.get(index);
		if(head==null)
		{
			return null;
		}
		if(head.key.equals(key))
		{
			V val=head.value;
			head=head.next;
			bucket.set(index, head);
			size--;
			return val;
		}
		else
		{
			HashNode<K, V>prev=null;
			while(head!=null)
			{
				
				if(head.key.equals(key))
				{
					prev.next=head.next;
					size--;
					return head.value;
				}
				prev=head;
				head=head.next;
			}
			return null;
		}
	}
	public void put(K key, V value)
	{
		
		int index=hashCode(key);
		HashNode<K, V>head=bucket.get(index);
		HashNode<K, V>toAdd=new HashNode<>();
		toAdd.key=key;
		toAdd.value=value;
		if(head==null)
		{
			bucket.set(index, toAdd);
			size++;
			
		}
		else
		{
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				head.value=value;
				size++;
				break;
			}
			head=head.next;
		}
		if(head==null)
		{
		head=bucket.get(index);
		toAdd.next=head;
		bucket.set(index, toAdd);
		size++;
		}
		}
		if((1.0*size)/numBuckets>0.7)
		{
			//do something
			ArrayList<HashNode<K, V>>tmp=bucket;
			bucket=new ArrayList<>();
			numBuckets=2*numBuckets;
			for(int i=0;i<numBuckets;i++)
			{
				bucket.add(null);
			}
			for(HashNode<K, V> headNode:tmp)
			{
				while(headNode!=null)
				{
					put(headNode.key, headNode.value);
					headNode=headNode.next;
				}
			}
			
			
		}
		
	}
	
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
    public void clear(){
        bucket.clear();
        for(int i=0;i<numBuckets;i++){
			bucket.add(null);
		}
	}
    
}
