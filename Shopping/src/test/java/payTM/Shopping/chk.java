package payTM.Shopping;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestSuiteLauncher.class)
public class chk extends TestSuiteLauncher{

	@Test
	public void chk1()
	{
		Launch lch = new Launch(drv);
		
		lch.launchURL();
	}
	
	public chk()
	{
		Launch lch = new Launch(drv);
		
		lch.launchURL();
	}
	
	
}
