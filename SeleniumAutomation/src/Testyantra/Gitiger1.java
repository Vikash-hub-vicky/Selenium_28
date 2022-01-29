package Testyantra;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Gitiger1 {

	public static void main(String[] args) throws InterruptedException {
	
		//Organization
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8888/index.php?action=Login&module=Users");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("manager");
			driver.findElement(By.id("submitButton")).click();
			driver.findElement(By.partialLinkText("Organizations")).click();
			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			driver.findElement(By.name("accountname")).sendKeys("Vikash Pratp Singh1");
			driver.findElement(By.name("button")).click();
			
			WebElement ele = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
			System.out.println(ele.getText());
			
	}

}
