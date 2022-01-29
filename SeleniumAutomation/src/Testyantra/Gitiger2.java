package Testyantra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gitiger2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.findElement(By.linkText("index.php?module=Accounts&amp;action=index")).click();
		driver.findElement(By.xpath("//img[@title=Create Organization...]")).click();
		driver.findElement(By.name("accountname")).sendKeys("Vikash Pratp Singh.");
		driver.findElement(By.name("button")).click();
	
	}

}
