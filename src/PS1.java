import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PS1 extends PS{
	@Test
	public void test()
	{
	//	PS ps = new PS();
	//	ps.DO();
		DO();
		
		PS2 ps2 = new PS2(2);
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		System.out.println(ps2.multiplytwo());

}
}