package sel_basic_program;

import static org.junit.Assume.assumeNoException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99_Demo_Project {

	public static void main(String[] args) {
		//Launch web driver
				System.setProperty("webDriver.chrome.driver","D:\\eclipse\\eclipse\\chromedriver.exe");
				
				WebDriver w=new ChromeDriver();
				
				//open url
				w.get("https://demo.guru99.com/");
				
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[3]/a")).click();
				w.findElement(By.xpath("/html/body/div[3]/a")).click();
				Select s=new Select(w.findElement(By.id("user_title")));
				s.selectByValue("Miss");//title
				w.findElement(By.id("user_firstname")).sendKeys("Reena");//first name
			
				w.findElement(By.id("user_surname")).sendKeys("Hegade");//last name
				w.findElement(By.id("user_phone")).sendKeys("5623487951");//phone
				
				Select s1=new Select(w.findElement(By.id("user_dateofbirth_1i")));
				s1.selectByValue("1936");
				
				
				Select s2=new Select(w.findElement(By.xpath("//*[@id=\"user_dateofbirth_2i\"]")));
			 s2.selectByVisibleText("January");;
				
				Select s3=new Select(w.findElement(By.id("user_dateofbirth_3i")));
				s3.selectByValue("23");
				
				w.findElement(By.xpath("//*[@id=\"licencetype_t\"]")).click();
				
				
				Select s4=new Select(w.findElement(By.xpath("//*[@id=\"user_licenceperiod\"]")));
				s4.selectByValue("5");
				
				Select s5=new Select(w.findElement(By.id("user_occupation_id")));
				s5.selectByValue("4");
				
				
				w.findElement(By.id("user_address_attributes_street")).sendKeys("Neharu Nagar");
				w.findElement(By.id("user_address_attributes_city")).sendKeys("Nashik");
				w.findElement(By.id("user_address_attributes_county")).sendKeys("India");
				w.findElement(By.id("user_address_attributes_postcode")).sendKeys("422003");
				w.findElement(By.id("user_user_detail_attributes_email")).sendKeys("Reena@gmail.com");
				
				w.findElement(By.id("user_user_detail_attributes_password")).sendKeys("reena123");
				
				w.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("reena123");
				w.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/input[2]")).click();
				
				
				//Agile Project window
				
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[4]/a")).click();
				w.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Reena_hegade");
				w.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("reena123");
				w.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
				
				Alert a=w.switchTo().alert();
				a.accept();
				//Bank Project
				
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[5]/a")).click();
				w.findElement(By.name("uid")).sendKeys("Reena");
				w.findElement(By.name("password")).sendKeys("Reena123");
				
				w.findElement(By.name("btnLogin")).click();;
				Alert a1=w.switchTo().alert();
				a1.accept();
				
				//security project
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[6]/a")).click();
				
				w.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).sendKeys("reena");
				w.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("reena");
				
				w.findElement(By.name("btnLogin")).click();
				Alert a2=w.switchTo().alert();
				a2.accept();
				
				//Telecome project
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[8]/a")).click();
				w.navigate().back();
				
				//Payment gateway
				
				w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[9]/a")).click();
				
				Select s6=new Select( w.findElement(By.name("quantity")));
				s6.selectByValue("3");
				
				w.findElement(By.xpath("//*[@id=\"three\"]/div/form/div/div[8]/ul/li/input")).click();
				
	}

	
}
