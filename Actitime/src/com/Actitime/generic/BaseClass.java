package com.Actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.Actitime.pom.EnterTimeTrackPage;
import com.Actitime.pom.LoginPage;

public class BaseClass {
	
	public static WebDriver driver;

//selenium grid
/*public  WebDriver driver;	
@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browser) {
		Reporter.log("Open Browser",true);
		if (browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}*/
@BeforeClass
public void openBrowser() {
	Reporter.log("Open Browser",true);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
}
@AfterClass
public void closeBrowser() {
	Reporter.log("Close Browser",true);
	driver.quit();
}

@BeforeMethod
public void login() throws IOException {
	Reporter.log("Login",true);
	Filelib f=new Filelib();
	String url = f.getPropertyData("url");
	String un = f.getPropertyData("username");
	String pwd = f.getPropertyData("password");
	driver.get(url);
	LoginPage l=new LoginPage(driver);
	l.setLogin(un,pwd);

}
@AfterMethod
public void logout() {
	Reporter.log("Logout",true);
	EnterTimeTrackPage h=new EnterTimeTrackPage(driver);
	h.setLogout();
}
}
