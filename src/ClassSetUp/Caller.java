package ClassSetUp;

public class Caller extends SetUpClass
{
	public static void main(String[] args)
	{
		Caller caller = new Caller();
		caller.setUp();
		
		if(caller.getInstance() == null)
			System.out.println("SetUp class has not been initialized");
		else
		{
			System.out.println("SetUp class has been initialized");
			System.out.println(caller.getInstance().setOne);
			System.out.println(caller.getInstance().setTwo);
		}
	}
}
