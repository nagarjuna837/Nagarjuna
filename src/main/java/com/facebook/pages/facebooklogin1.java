package com.facebook.pages;
//pages we write only xpath

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class facebooklogin1 {
	public facebooklogin1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement a;
	
	public void firstname()
	{
		a.sendKeys("nagarjuna");
	
	}
	@FindBy(xpath="//input[@name='lastname']")
	WebElement b;
	public void lastname()
	{
		b.sendKeys("nagarjuna");
		
	}
	@FindBy(id="day")
	WebElement c;
	public void day() 
	{
		Select dd=new Select(c);
		dd.selectByIndex(5);
	}
	@FindBy(id="month")
	WebElement d;
	public void month()
	{
		Select dd=new Select(d);
		dd.selectByIndex(5);	
	}
	@FindBy(id="year")
	WebElement f;
	public void year()
	{
		Select dd=new Select(f);
		dd.selectByValue("1996");	
	}
	@FindBy(xpath="//label[text()='Male']")
	WebElement g;
	public void gender()
	{
		g.click();
	}
	@FindBy(name="reg_email__")
	WebElement h;
	public void email()
	{
		h.sendKeys("8653632326");
	}
	
	@FindBy(id="password_step_input")
	WebElement i;
	public void password()
	{
		i.sendKeys("nagarjuna");
	}
	@FindBy(xpath="//button[text()='Sign Up']")
	WebElement k;
	public void signup()
	{
		k.click();
	}
}
