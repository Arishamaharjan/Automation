package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Login to Facebook account
		WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		WebElement NextButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));

		email.sendKeys("Arianarai86@gmail.com");

		password.sendKeys("Ariana@123");
		NextButton.click();

		// Clean Cookies
		driver.manage().deleteAllCookies();

		WebElement logOut = driver.findElement(By.name("Log Out"));
		logOut.click();

		//Close the tab
		driver.close();
	}

}
