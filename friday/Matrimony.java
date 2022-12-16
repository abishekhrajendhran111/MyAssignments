package test.friday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.tamilmatrimony.in/");
        driver.manage().window().maximize();
    //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        WebElement matrimony=driver.findElement(By.id("REGISTERED_BY"));
        Select maSelect=new Select(matrimony);
        maSelect.selectByVisibleText("Myself");
        
        WebElement name=driver.findElement(By.name("NAME"));
        name.sendKeys("Abishekh");
        
        WebElement gender=driver.findElement(By.id("gendermale"));
        gender.click();
        
        WebElement date=driver.findElement(By.id("DOBDAY"));
        Select dateSelect=new Select(date);
        dateSelect.selectByVisibleText("1");
        
        WebElement month=driver.findElement(By.id("DOBMONTH"));
        Select moSelect=new Select(month);
        moSelect.selectByVisibleText("Nov");
        
        WebElement year=driver.findElement(By.id("DOBYEAR"));
        Select yearSelect=new Select(year);
        yearSelect.selectByVisibleText("2000");
        
        WebElement religion=driver.findElement(By.id("RELIGION"));
        Select reSelect=new Select(religion);
        reSelect.selectByVisibleText("Hindu");
        
        WebElement motherTongue=driver.findElement(By.id("MOTHERTONGUE"));
        Select ṁotherSelect=new Select(motherTongue);
        ṁotherSelect.selectByVisibleText("Tamil");
        
        WebElement country=driver.findElement(By.id("COUNTRY"));
        Select countrySelect=new Select(country);
        countrySelect.selectByVisibleText("India");
        
        WebElement mCountryCode=driver.findElement(By.id("M_COUNTRYCODE"));
        Select mSelect=new Select(mCountryCode);
        mSelect.selectByVisibleText("+91");
        
        WebElement mobileNumber=driver.findElement(By.id("MOBILENO"));
        mobileNumber.sendKeys("9629968607");
        
        WebElement emailAddress=driver.findElement(By.id("EMAIL"));
        emailAddress.sendKeys("abishekh01112000@gmail.com");
        
        driver.close();
        
        
        
	}

}
