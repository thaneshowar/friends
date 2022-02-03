package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChrome {
	public static void main(String[] args) {
		// Scanner scn = new Scanner(System.in);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tspat\\New_jan_2021_selenium\\1st_SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}

}
