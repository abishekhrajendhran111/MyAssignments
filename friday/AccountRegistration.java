package test.friday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://uibank.uipath.com/register-account");
       driver.manage().window().maximize();
       
       WebElement name=driver.findElement(By.id("firstName"));
       name.sendKeys("Abishekh");
       
       WebElement title=driver.findElement(By.id("title"));
       Select titleSelect=new Select(title);
       titleSelect.selectByVisibleText("Mr");
       
       WebElement intial=driver.findElement(By.id("middleName"));
       intial.sendKeys("R");
       
       WebElement lastName=driver.findElement(By.id("lastName"));
       lastName.sendKeys("Rajendhran");
       
       WebElement gender=driver.findElement(By.id("sex"));
       Select genderSelect=new Select(gender);
       genderSelect.selectByVisibleText("Male");
       
       WebElement employmentStatus=driver.findElement(By.id("employmentStatus"));
       Select empSelect=new Select(employmentStatus);
       empSelect.selectByVisibleText("Full-time");
       
       WebElement userName=driver.findElement(By.id("username"));
       userName.sendKeys("abi.dharan");
       
       WebElement email=driver.findElement(By.id("email"));
       email.sendKeys("abishekh01112000@gmail.com");
       
       WebElement password=driver.findElement(By.id("password"));
       password.sendKeys("rey");
       
       driver.close();
       
       
       
	}

}
