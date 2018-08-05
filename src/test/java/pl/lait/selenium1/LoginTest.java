package pl.lait.selenium1;

import org.junit.*;
import org.junit.Before;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

@Ignore
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest {
	
	WebDriver driver = null;
	
	@Before
	public void openPage() {
		driver = Init.getDriver();
	}
	
	@Ignore
	@Test
	public void clicOnMenuItems() {
	
		
			
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.linkText("SUPPORT")).click();
		driver.findElement(By.linkText("CONTACT")).click();
		driver.findElement(By.linkText("SIGN-ON")).click();
		
		driver.findElement(By.name("userName")).sendKeys("kociss");
		driver.findElement(By.name("password")).sendKeys("kociss");
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		
	}
	
	@Test
	public void reservation( ) {

		driver.findElement(By.linkText("SIGN-ON")).click();		
		driver.findElement(By.name("userName")).sendKeys("kociss");
		driver.findElement(By.name("password")).sendKeys("kociss");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]"
				+ "/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]"
				+ "/b/font/input[2]")).click();
		
		Init.sleep(2);
		Select passCount = new Select(driver.findElement(By.name("passCount")));
		passCount.selectByValue("2");
		
		Select fromPort = new Select(driver.findElement(By.name("fromPort")));
		fromPort.selectByValue("Frankfurt");
		
		Select fromMonth = new Select(driver.findElement(By.name("fromMonth")));
		fromMonth.selectByValue("3");
		
		Select fromDay = new Select(driver.findElement(By.name("fromDay")));
		fromDay.selectByValue("21");
		
		
		
		
		Init.sleep(2);
		
		
		
	}
	
	
	
	
	
	@After
	public void tearDown() {
		Init.endTest();
	}
	
	
}//end class
