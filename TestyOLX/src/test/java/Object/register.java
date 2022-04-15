package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class register {
  
		WebDriver driver; 
		
		public register(WebDriver driver) {   
		this.driver = driver;   
		}
		
		
		By loginbutton=By.xpath("//strong[normalize-space()='Mój OLX']");
		By registerbutton= By.xpath("//section[@class='login-page has-animation animated animated-on-start']//a[@id='register_tab']");
		By emailfield =By.id("userEmailRegister");
		By passwordfield=By.id("userPassRegister");
		By usersagrement=By.xpath("//body/div[@id='innerLayout']/section[@class='login-page has-animation']/div[@class='login-box']/div[@class='login-tabs']/ul[@class='login-tabs__content']/li[@class='active']/form[@id='registerForm']/div[@class='fblock']/div[@class='focusbox']/div[@class='login-form__checkbox']/label[1]");
		By checbox= By.xpath("//body/div[@id='innerLayout']/section[contains(@class,'login-page has-animation')]/div[contains(@class,'login-box')]/div[contains(@class,'login-tabs')]/ul[contains(@class,'login-tabs__content')]/li[contains(@class,'active')]/form[@id='registerForm']/div[contains(@class,'fblock')]/div[contains(@class,'focusbox')]/div[contains(@class,'login-form__checkbox')]/label[1]");
		By registrationbutton=By.id("button_register");
		
		
		
		
		public void loginbutton() {
			driver.findElement(loginbutton).click();
		}
		public void registerbutton() {
		driver.findElement(registerbutton).click();
		}
		
		public void emailfield() {
			driver.findElement(emailfield).click();
		}		
		public void emaildata(String value1) {
			driver.findElement(emailfield).sendKeys(value1);
		}
		public void passworddata(String value2) {
			driver.findElement(passwordfield).sendKeys(value2);
		}
		public void checboxclick() {
			driver.findElement(checbox).click();
		}
		public void registrationConfirm() {
		driver.findElement(registrationbutton).click();
		}
}
		

