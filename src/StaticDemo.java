
public class StaticDemo {
	
	String name;
	String address;
	static String city= "nowgong";
	
	StaticDemo(String name, String address)
	{
		this.name=name;
		this.address=address;
	}
	public void getdata()
	{
		System.out.println(name+" "+address+" "+city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo SD= new StaticDemo("Shashank","kothi");
		StaticDemo SD1= new StaticDemo("Shashank11","kothi11");

		SD.getdata();
		SD1.getdata();

	}

}
