import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("USA");
		hs.add("UK");
		hs.add("12");
		Iterator<String> i = hs.iterator();
		System.out.println(hs);
		System.out.println(i.next());
		while(i.hasNext())
		{
			System.out.println(i.next());

		}
	}

}
