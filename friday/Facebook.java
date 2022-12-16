package test.friday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        WebElement createNewAccount=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        createNewAccount.click();
        
        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("Abishekh");
        
        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("Rajendhran");
        
        WebElement mobileNumber=driver.findElement(By.name("reg_email__"));
        mobileNumber.sendKeys("9629968607");
        
        WebElement password=driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("rey");
        
        WebElement date=driver.findElement(By.id("day"));
        Select dateSelect=new Select(date);
        dateSelect.selectByValue("1");
        
        WebElement month=driver.findElement(By.id("month"));
        Select monSelect=new Select(month);
        monSelect.selectByVisibleText("Nov");
        
        WebElement year=driver.findElement(By.id("year"));
        Select yearSelect=new Select(year);
        yearSelect.selectByVisibleText("2000");
        
        WebElement chooseGender=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        chooseGender.click();
        
        driver.close();
	}

}
