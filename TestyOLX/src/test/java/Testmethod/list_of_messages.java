package Testmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object.GoogleSearch;
import Object.account;
import Object.login_out;
import io.github.bonigarcia.wdm.WebDriverManager;

public class list_of_messages {


		
	
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
				public void messages() throws InterruptedException  {
					account messages = new account(driver);
					Thread.sleep(5000);
					messages.wiadomosci();
					System.out.println("wiadomosci sa klikalne");
					
					WebElement tresc_wiadomosci =driver.findElement(By.xpath(" //div[@class='css-8kdn1e']//img"));
					boolean status;
					if(status=tresc_wiadomosci.isDisplayed()) {
					System.out.println("Uzytkownik nie ma wiadomości");
					}
					else {
						System.out.println("Uzytkownik ma widoczne wiadomosci");
					
					}
				}

	@AfterTest
	public void delete() {
	
	driver.quit();
	}
		}		
				




	
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

