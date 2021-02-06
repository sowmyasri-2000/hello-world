package hashmap;
import java.util.HashMap;
public class Hashmapexample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(101,"Sowmya");
		hm.put(102,"Priya");
		hm.put(103,"Chimya");
		System.out.println("Size of hashmap = "+hm.size());
		if(hm.containsKey(101)) {
			String a=hm.get(101);
			System.out.println("value of key \"101\" is "+a);
		}
		

	}

}
