package PageLevel;

import SetUp.SetUpSelenium;

public class CommonPageBase
{
	SetUpSelenium test;
	
	public CommonPageBase(SetUpSelenium setUpTest)
	{
		test = setUpTest;
		System.out.println("CommonPageBase constructor called");
	}
	
	public SetUpSelenium getTestInstance()
	{
		return test;
	}	
}
