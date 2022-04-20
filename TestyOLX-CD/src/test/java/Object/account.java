package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class account {

	
	WebDriver driver; 
	
	public account(WebDriver driver) {   
	this.driver = driver;   
	}
	
	By menu=By.linkText("Mój OLX");
	By potwierdzenie = By.xpath("//button[normalize-space()='Jasne']");
	By zamknij = By.xpath("//span[contains(text(),'Zamknij')]");
	
	public void menu() {
		driver.findElement(menu).click();
	}

	public void potwierdzenie() {
		driver.findElement(potwierdzenie).click();
	}
	public void zamknij() {
		driver.findElement(zamknij).click();
	}
	
	By wiadomosci =By.xpath("//i[@data-icon='message']");
	
	public void wiadomosci() {
		driver.findElement(wiadomosci).click();
	}
	

	
	
	
	
	
	
	
}
