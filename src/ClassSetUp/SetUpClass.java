package ClassSetUp;

public abstract class SetUpClass
{
	protected SetUpClass setUp;
	protected String setOne = "";
	protected String setTwo = "";
	
	protected SetUpClass()
	{
		this.setOne="Set One";
		System.out.println("SetOne has been set up in the abtsract class contructor");
	}
	
	private void init(SetUpClass set)
	{
		this.setUp = set;
		this.setTwo = "Set Two";
		
		System.out.println("SetUpClass initialized");
		System.out.println("SetTwo has been set up in init method");
	}
	
	protected void setUp()
	{
		init(this);
	}
	
	public SetUpClass getInstance()
	{
		return setUp;
	}
}
