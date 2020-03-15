package TestCase;

import org.testng.annotations.BeforeClass;

import SetUp.SetUpSelenium;

public class TestBase extends SetUpSelenium
{
	@BeforeClass
	public void instaniate()
	{
		System.out.println("Before Class called");
		setUpSEPPage();
	}
}