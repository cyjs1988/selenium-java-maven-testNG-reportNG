package TestNG.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testDemo {

	@Test
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://qq.com");
		driver.quit();

	}

}
