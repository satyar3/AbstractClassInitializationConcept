package SetUp;

import PageFactory.PageFactory;

public abstract class SetUpSelenium
{
	protected SetUpSelenium setUp;
	public String propertyFilePath = "";
	public String driver = "";
	
	protected SetUpSelenium()
	{
		this.propertyFilePath="propertyFilePath";
		System.out.println("Property File Path has been set up in the abtsract class contructor");
	}
	
	private void init(SetUpSelenium set)
	{
		this.setUp = set;
		this.driver = "driver";
		
		System.out.println("SetUpSEPTest Class initialized");
		System.out.println("Driver has been set up in init method");
	}
	
	protected void setUpSEPPage()
	{
		init(this);
		PageFactory.setUpPageFactory(setUp);
	}
}
