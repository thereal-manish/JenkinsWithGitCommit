package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageObjectBase {
	protected String pageTitle;
	protected String pageUrl;
	protected static WebDriver driver;

	public PageObjectBase() {
	}

	public String getBrowser() throws Exception {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//properties//global.properties");
		prop.load(fis);
		String conf2 = System.getProperty("browser") != null ? System.getProperty("browser")
				: prop.getProperty("browser");
		return conf2;
	}
	

	@BeforeClass
	public void getDeviceDriver() throws Exception {
		getBrowser();
		System.out.println(getBrowser());
		String conf = Configurations.browserType;
		if (getBrowser().equalsIgnoreCase("Firefox")) {
//			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\geckodriver.exe");
//			WebDriver driver=new FirefoxDriver();
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		} else if (getBrowser().equalsIgnoreCase("Chrome")) {
//			System.setProperty("webdriver.chrome.driver3", System.getProperty("user.dir") + "\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Jenkins Triggered");
		} else if (getBrowser().equalsIgnoreCase("Edge")) {
//			System.setProperty("webdriver.ie.driver3", System.getProperty("user.dir") + "\\IEDriverServer.exe");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
	}

	public static void getScreenshot(WebDriver driver, String location, String testId, String stepNo) {
		byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		try {
			File image = new File(location + testId + "/ScreenShots/");
			image.mkdirs();
			Files.write(screenShot, new File(image + "/" + testId + "_" + stepNo + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
