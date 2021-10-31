package sel_basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github_login {

	public static void main(String[] args) {
		 System.setProperty("webdriver.crome.driver", " D:\\eclipse\\eclipse\\chromedriver.exe");
		 WebDriver w=new ChromeDriver();
		 
		 //Open Website
		 w.get("https://github.com/login");
		 
		 w.findElement(By.name("login")).sendKeys("reenahegade6@gmail.com");
		 
		 w.findElement(By.name("password")).sendKeys("Hegade123");
		 w.findElement(By.name("commit")).click();
          w.close();
	}

}
