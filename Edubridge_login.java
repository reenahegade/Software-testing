package sel_basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edubridge_login {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.crome.driver", " D:\\eclipse\\eclipse\\chromedriver.exe");
		 WebDriver w=new ChromeDriver();
		 
		 //Open Website
		 w.get("https://www.edubridgeindia.com/login");
		 
		 w.findElement( By.name("mobile")).sendKeys("8806305355");
		 w.findElement( By.name("password")).sendKeys("Reena@123");
		 w.findElement( By.id("btnLoginSubmit")).click();
				 
		 w.close();
		 
		 
	}

}