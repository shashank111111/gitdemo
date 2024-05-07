
public class ThisDemo {
		int a=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo td = new ThisDemo();
		td.getdata();
		


	}
	
	
	public void getdata()
	{
		int a=2;
		System.out.println(a);
		System.out.println(this.a);

		
	}

}
