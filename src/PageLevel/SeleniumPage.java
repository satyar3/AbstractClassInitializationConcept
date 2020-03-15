package PageLevel;

import SetUp.SetUpSelenium;

public class SeleniumPage extends CommonPageBase
{	
	public SeleniumPage(SetUpSelenium setup)
	{
		super(setup);
	}
	
	public void pageFunction()
	{		
		System.out.println("In Runner function");
		System.out.println(getTestInstance().propertyFilePath);
		System.out.println(getTestInstance().driver);
	}
}
