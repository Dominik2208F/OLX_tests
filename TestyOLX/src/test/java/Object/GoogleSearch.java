package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {

  
	WebDriver driver; 
	
	public GoogleSearch(WebDriver driver) {   
	this.driver = driver;   
		
	}
	
	
	
	
	By wyszukiwarka= By.xpath("//input[@name='q']");   
	By cookies =By.xpath("//*[contains(text(),\"Zgadzam się\")]");
	By button_google = By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']");
	By first_result= By.xpath("//h3[contains(text(),'Ogłoszenia - Sprzedam, kupię na OLX.pl')]");
	By cookies2=By.id("onetrust-accept-btn-handler");
	
   public void szukanie(String wartosc) {        
    driver.findElement(wyszukiwarka).sendKeys(wartosc);}
//	}
	
	public void cookies() {
		driver.findElement(cookies).click();
	}
	public void button() {
		driver.findElement(button_google).click();
	}
	public void results() {
		driver.findElement(first_result).click();
	}
	public void cookies2() {
		driver.findElement(cookies2).click();
	}
	
	}		

	

	

	




