package Testmethod;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object.GoogleSearch;
import Object.account;
import Object.login_out;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Menu_clickable{
  
	WebDriver driver;
	
	@BeforeTest
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
	
	
				@BeforeTest
				  public void loginin (){
					     login_out loginin = new login_out(driver);
					     loginin.loginbutton();
					     loginin.emaildata("olxolx2223@wp.pl");
					     loginin.passworddata("Maj1234!");
					     loginin.loginConfirm();
					     System.out.println("Logowanie prawidlowe");
					    
					     }
				
	
				@Test
					public void accountAction() throws InterruptedException {
					Thread.sleep(5000);
					account accountAction = new account(driver);
					accountAction.menu();
					System.out.println("Menu uzytkownika jest klikalne");
					accountAction.potwierdzenie();
					WebDriverWait wait = new WebDriverWait(driver,5);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Zamknij')]")));
					accountAction.zamknij();
					}
	 
				
				
				
@AfterMethod
public void akcja() {
	Actions actions = new Actions(driver);
	WebElement mouseHover = driver.findElement(By.linkText("Mój OLX"));
	actions.moveToElement(mouseHover);
	actions.perform();
	
	
} 
@AfterMethod
public void wyloguj () {
	login_out wyloguj = new login_out(driver);
	
	wyloguj.logutbutton();
	System.out.println("Wylogowano pomyslnie- test zakonczony");
	
}


 }

   

   
    
	

