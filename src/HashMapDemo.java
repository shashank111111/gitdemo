import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "50");
		hm.put(1, "60");
		System.out.println(hm.get(1));
		Set s= hm.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry)it.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
		}
	}

}
