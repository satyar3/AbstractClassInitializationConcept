package PageFactory;

import java.lang.reflect.InvocationTargetException;

import PageLevel.CommonPageBase;
import SetUp.SetUpSelenium;

public class PageFactory
{
	static SetUpSelenium test;
	
	public static void setUpPageFactory(SetUpSelenium setUp)
	{
		test = setUp;
		System.out.println("PageFactory has been set up");
	}
	
	public static <T extends CommonPageBase> T getPageObject(Class<T> cls) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{		
		System.out.println(cls+" has been initialized");
		return cls.getDeclaredConstructor(SetUpSelenium.class).newInstance(test);
	}
	
}
