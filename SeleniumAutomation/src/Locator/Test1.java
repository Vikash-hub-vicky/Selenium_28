package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/login.php?type=login");
			driver.findElement(By.id("usename")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("123456");
			driver.findElement(By.partialLinkText("Login")).click();
		}


	}


