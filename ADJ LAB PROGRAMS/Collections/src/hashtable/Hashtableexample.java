package hashtable;
import java.util.Hashtable;
import java.util.Map;
public class Hashtableexample {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1,"Sowmya");
		ht.put(3,"Priya");
		ht.put(2,"Chimya");
		System.out.println("size of hash table ="+ht.size());
		for(Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}


	}

}
