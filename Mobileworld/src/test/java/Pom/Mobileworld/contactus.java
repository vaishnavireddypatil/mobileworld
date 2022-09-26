package Pom.Mobileworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class contactus {
	
  @AfterSuite
	public void Aftersuite()
	{
	    System.out.println("Exicuted contactus page.");	
	}
		
  @Test(dataProvider="ContactUs")
    public void ContactUs(String Username, String Email, String Phoneno, String Message ) throws InterruptedException 
	{
        
        System.setProperty("webdriver.chrome.driver","C:/Users/vaishnavi.reddy/Downloads/chromedriver_win32/chromedriver.exe");       
        WebDriver driver=new ChromeDriver();
      
        landingpage contact = new landingpage(driver);
        contact .goTo();
        contact .ContactUsPage(Username, Email, Phoneno, Message);
     }  

  @DataProvider
    public Object[][] ContactUs()
    {
        Object[][]data=new Object[2][4];
        
        data[0][0]="Vaishnavi";
        data[0][1]="vaishvai@gmail.com";
        data[0][2]="762489824";
        data[0][3]="This is the problem";
        
        data[1][0]="vaishu";
        data[1][1]="abc@gmail.com";
        data[1][2]="928732462888899900007789333";
        data[1][3]="this is the message";
        return data;    
    }
}