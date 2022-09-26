package Pom.Mobileworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class signup {
	
 @BeforeTest
    public void beforeTest()
    {
      System.out.println("Exicuting signup page.");	
    }
		
 @Test(dataProvider="SignUp", groups={"group"})
    public void SignUp(String Firstname, String Lastname, String Email, String Password, String date, String Mobnum, String Shortbio) throws InterruptedException
    {
      System.setProperty("webdriver.chrome.driver","C:/Users/vaishnavi.reddy/Downloads/chromedriver_win32/chromedriver.exe");
      WebDriver driver=new ChromeDriver();  
      
      landingpage Siup = new landingpage(driver);
      Siup.goTo();
      Siup.SignupPage(Firstname, Lastname, Email,  Password, date,  Mobnum, Shortbio);
    }
    
 @DataProvider
   public Object[][] SignUp(){
        Object[][] data = new Object[2][7];
        
        data[0][0]="Vaishnavi";
        data[0][1]="Reddy";
        data[0][2]="Vaishnavi@gmail.com";
        data[0][3]="vaishu@123";
        data[0][4]="09/09/2000";
        data[0][5]="7624898249";
        data[0][6]="I love singing";
        
        data[1][0]="Va";
        data[1][1]="Reddy patil";
        data[1][2]="Vaishnavi@gmail.com";
        data[1][3]="13";
        data[1][4]="09/09/2033";
        data[1][5]="762489";
        data[1][6]="I love singing";
        return data;   
     }
}