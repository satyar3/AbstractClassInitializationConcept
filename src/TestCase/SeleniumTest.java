package TestCase;

import org.testng.annotations.Test;

import PageFactory.PageFactory;
import PageLevel.SeleniumPage;

public class SeleniumTest extends TestBase
{	
	@Test
	public void test() throws Exception
	{
		SeleniumPage selPage = PageFactory.getPageObject(SeleniumPage.class);
		selPage.pageFunction();
	}
}
