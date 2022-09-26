package Pom.Mobileworld;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class landingpage 
{

	WebDriver driver;
    public landingpage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
//sign up
  
	@FindBy(css="button.btn.btn-warning.my-2.my-sm-0")
    WebElement Signin;
	  
	@FindBy(linkText="Sign up")
	WebElement Signup;
    
    @FindBy(xpath="//input[@placeholder='First Name']")
    WebElement FirstName;
    
    @FindBy(xpath="//input[@placeholder='Last Name']")
    WebElement LastName;
    
    @FindBy(xpath = "//input[@placeholder='Enter Email']")
    WebElement Email1;
    
    @FindBy(xpath="//input[@placeholder='Password']")
    WebElement password;
    
    @FindBy(xpath="//input[@type='date']")
    WebElement date;
    
    @FindBy(xpath="//div[@class='col-md-3']//input[@name='gender']")
    WebElement gen;
    
    @FindBy(css="input[type='number']")
    WebElement Mobnum;

    @FindBy(css="textarea[placeholder='Short Bio']")
    WebElement Shortbio;

    @FindBy(xpath="//*[@id=\"myForm\"]/div[6]/div[2]/button")
    WebElement register;
    
       
//sign in
    
     @FindBy(css="button[type='submit']")
     WebElement signinbutton;
     
     @FindBy(css="#username")
     WebElement Username;
     
     @FindBy(id="password")
     WebElement Password;
          
 	 @FindBy(css="label.custom-control-label")
 	 WebElement rememberme;

     @FindBy(xpath="//*[@type='submit']")
     WebElement login;
     
     
//contact us
     @FindBy(linkText="Support")
	 WebElement support;

     @FindBy(linkText="Contact Us")
     WebElement contactus;

     @FindBy(css="input[placeholder='Username']")
     WebElement username;

     @FindBy(xpath="//*[@placeholder='Email']")
     WebElement Email;

     @FindBy(xpath="//*[@placeholder='Phone']")
     WebElement Phoneno;

     @FindBy(xpath="//*[@placeholder='Message']")
     WebElement Message;

     @FindBy(xpath="//*[@type='submit']")
     WebElement submit;

//sign in

     public void SignupPage(String fname, String lname, String email, String pwd, String dob, String num, String bio) throws InterruptedException
     {
    	Signin.click();
    	Signup.click();
        FirstName.sendKeys(fname);
        LastName.sendKeys(lname);
    	Email1.sendKeys(email);
        password.sendKeys(pwd);
    	date.sendKeys(dob);
    	gen.click();
    	Mobnum.sendKeys(num);
    	Shortbio.sendKeys(bio);
    	register.click();
    	Thread.sleep(1000);
    	driver.switchTo().alert().accept();
    	Thread.sleep(1000);
    	   String ActualaTile = driver.getTitle();
    	   String ExpectedTitle = "Register";
           Assert.assertEquals(ActualaTile, ExpectedTitle); 
        driver.quit(); 
     }
     
//sign in 
     
    public void SignInPage(String username, String password) throws InterruptedException
     {
        signinbutton.click();
        Username.sendKeys(username);
        Password.sendKeys(password);
        rememberme.click();
        Thread.sleep(1000);
        login.click(); 
        Thread.sleep(1000);       
		driver.quit();  
     }
    
//contact us
    
    public void ContactUsPage(String username1, String email, String Phone, String message) throws InterruptedException
    {
        support.click();
        contactus.click();
           Set<String> id = driver.getWindowHandles();
           java.util.Iterator<String> it = id.iterator();
           String parentId = it.next();
           String childId = it.next();
           driver.switchTo().window(childId);
           driver.manage().window().maximize();
        username.sendKeys(username1);
        Email.sendKeys(email);
        Phoneno.sendKeys(Phone);
        Message.sendKeys(message);
        Thread.sleep(1000);
        submit.click();
        Thread.sleep(1000);
        driver.quit();
     }
               
     public void goTo()
     {
	    driver.get("https://mobileworld.banyanpro.com");
	 }
}
    