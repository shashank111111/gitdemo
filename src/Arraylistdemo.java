import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("apple");
		a.add("banana");
		a.add("cherry");
		a.add("mango");
		a.add("apple");
		System.out.println(a);
		a.remove(0);
    	System.out.println(a);
    	System.out.println(a.contains("orange"));
    	System.out.println(a.size());

	}

}
