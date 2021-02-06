package arraylist;
import java.util.ArrayList;
public class Arraylistexample {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Sowmya");
		obj.add("Priya");
		obj.add("Chimya");
		System.out.println("Currently te arraylist has following elements:"+obj);
		obj.add(1,"Meghana");
		obj.add(2,"Priya");
		obj.remove("Chimya");
		System.out.println("Currently the arraylist has following elements:"+obj);

	}

}  
