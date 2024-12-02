package stepdefination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.facebook.pages.facebooklogin1;


public class facebooklogin 
{
	WebDriver d;
	facebooklogin1 z;
	@BeforeTest
	public void setup(){
		//launch the driver
		d=new ChromeDriver();
		//open the browser
		d.get("https://www.facebook.com/r.php");
		System.out.println(d.getTitle());
		assertEquals(d.getTitle(),"Sign up for Facebook");
		assertTrue(true);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));	
	}
@Test
	 public void signup() 
     {
	    z=new facebooklogin1(d);
		 z.firstname(); 
		 System.out.println("firstname:"+d.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value"));
		 z.lastname();
		 z.day();
		 z.month();
		 z.year();
		 z.gender();
		 z.email();
		 z.password();
		 z.signup();
				
				
	  }
	   @AfterTest
	   public void Setup()
	   {
		   //close the broswer
		   try 
		   {
				Thread.sleep(2000);
			} 
		   catch (InterruptedException e) 
		   {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   d.quit();
	   }
}
