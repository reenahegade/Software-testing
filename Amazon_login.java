package sel_basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_login {

	public static void main(String[] args) {
		System.setProperty("webdriver.crome.driver", " D:\\eclipse\\eclipse\\chromedriver.exe");
		 WebDriver w=new ChromeDriver();
		 
		 //Open Website
		 w.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		 w.findElement(By.name("email")).sendKeys("Reenahegade6@gmail.com");
		 w.findElement(By.id("continue")).click();
		 
		 w.findElement(By.name("password")).sendKeys("Reena@123");
		 w.findElement(By.id("signInSubmit")).click();
		 w.close();
	}

}
