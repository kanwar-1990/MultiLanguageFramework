package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	// Create By locators
	By HeaderName=By.xpath("//a[contains(text(),'Peace, dignity and equality')]");
	By ContactLinkinFooter=By.xpath("//a[contains(text(),'Contact')]");
	
	// intialize constructor
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}

	public boolean HeadNameCheck()
	{
		String Headname=driver.findElement(HeaderName).getText();
		System.out.println(Headname);
		return driver.findElement(HeaderName).isDisplayed();
	}
	
	public boolean Contactlinks()
	{
		String ContactLinks=driver.findElement(ContactLinkinFooter).getText();
		System.out.println(ContactLinks);
		return driver.findElement(HeaderName).isDisplayed();
	}
	
}
