import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ConfigReader.ConfigPropReader;
import Factory.DriverFactory;
import Page.HomePage;

public class HomePageTest {
	ConfigPropReader cf ;
	DriverFactory DF;
	Properties prop;
	WebDriver driver;
	HomePage Hp;
	
	
	@BeforeTest
	public void Setup()
	{
		cf=new ConfigPropReader();
		DF=new DriverFactory();
		prop=cf.initLangProp("english");
		driver=DF.intiDriver("chrome", prop);
		Hp=new HomePage(driver);
	}

	@Test
	public void HeaderCheckTest() {
		Assert.assertTrue(Hp.HeadNameCheck());
		
	}
	@Test
	public void ContactfooterLinkTest()
	{
		Assert.assertTrue(Hp.Contactlinks());
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
