package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class login_out {
  
		WebDriver driver; 
		
		public login_out(WebDriver driver) {   
		this.driver = driver;   
		}
		
		
		By loginbutton=By.xpath("//strong[normalize-space()='Mój OLX']");
		By emailfield =By.id("userEmail");
		By passwordfield=By.xpath("//section//ul//div//div//div//input[@placeholder='Hasło']");
		By loginConfirm=By.cssSelector("body > div:nth-child(4) > section:nth-child(8) > div:nth-child(3) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > div:nth-child(1) > form:nth-child(1) > fieldset:nth-child(3) > button:nth-child(7)");
	    By logoutmojolx=By.xpath("//a[@class='css-12l1k7f']");
		By logoutbutton= By.xpath("//a[normalize-space()='Wyloguj']");
		
		
		public void loginbutton() {
			driver.findElement(loginbutton).click();
		}
		
		
		public void emaildata(String value1) {
			driver.findElement(emailfield).sendKeys(value1);
			
		}
		
	
		
		public void passworddata(String value2) {
			driver.findElement(passwordfield).sendKeys(value2);
		}
		
		public void loginConfirm() {
		driver.findElement(loginConfirm).click();
		}
		
		
		
		public void logutbutton() {
			driver.findElement(logoutbutton).click();

		}

		
		
}



