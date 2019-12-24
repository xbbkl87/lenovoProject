package payTM.Shopping;

import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.WebDriver;

public class Launch extends TestSuiteLauncher{

	private WebDriver drv;
	
	Launch(WebDriver drv)
	{
		this.drv = drv;
	}
	
	public void launchURL()
	{
		drv.get("https://www.paytm.com");
	}
	
}
