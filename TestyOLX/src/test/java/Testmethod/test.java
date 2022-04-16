package Testmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Object.GoogleSearch;

import Object.register;
import io.github.bonigarcia.wdm.WebDriverManager;




public class test {
  
	WebDriver driver;
	
	@BeforeMethod
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	
				GoogleSearch website = new GoogleSearch(driver);      
				website.cookies();
				website.szukanie("OLX");
				website.button();
				website.results();
				WebDriverWait wait = new WebDriverWait(driver,5);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));
				website.cookies2();
	}
		 
	 
     @Test
     public void registration (){
     register registration = new register(driver);
     registration.loginbutton();
     registration.registerbutton();
     
     registration.emaildata("email37@wp.pl");
     registration.passworddata("Password123");
     registration.checboxclick();
     registration.registrationConfirm();
     
     WebElement confirmation = driver.findElement(By.className("login-box-confirm__link"));
     boolean status_registration;
     
     status_registration=confirmation.isDisplayed();
     System.out.println(status_registration);
     }	 

     @Test
	 public void verifyApplicationTitle() {
		
		String my_title=driver.getTitle();
		String expected_title="Ogłoszenia - Sprzedam, kupię na OLX.pl";
		Assert.assertEquals(my_title,expected_title);
		System.out.println("Test completed- the tittle is correct");
	 }
	 @Test
	 public void verifyURL() {
		 String my_url= driver.getCurrentUrl();
		 String exptected_url="https://www.olx.pl/";
		 Assert.assertEquals(my_url,exptected_url);
		 System.out.println("Test completed- the URL is correct");
	 }
    	 
    	
 @AfterMethod
  public void aftertest() {
	 driver.quit();
 }
}
   

   
    
	

