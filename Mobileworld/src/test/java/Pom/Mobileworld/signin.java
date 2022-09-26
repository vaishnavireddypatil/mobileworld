package Pom.Mobileworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class signin {

 @Test(dataProvider="SignIn", groups={"group"})
 
	 public void SignIn(String username, String password) throws InterruptedException
     {
	 System.setProperty("webdriver.chrome.driver","C:/Users/vaishnavi.reddy/Downloads/chromedriver_win32/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     
	 landingpage  Siin = new landingpage(driver);
	 Siin.goTo();
	 Siin.SignInPage(username, password);
     }
 
 @DataProvider
	    
     public Object[][] SignIn()
     {
	 Object[][] data = new Object[2][2];

	 data[0][0]="Vaishnavi";
     data[0][1]="vaishu@18";
     
     data[1][0]="12344";
     data[1][1]="@#$$%%";
     return data;
     }          
}	