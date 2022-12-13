package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTaps {

	public static void main(String[] args) {
		   ChromeDriver driver=new ChromeDriver();
	       driver.get("http://leaftaps.com/opentaps/control/main");
	       driver.manage().window().maximize();
	       
	       WebElement userName=driver.findElement(By.id("username"));
	       userName.sendKeys("DemoCsr");
	       
	       WebElement password=driver.findElement(By.id("password"));
	       password.sendKeys("crmsfa");
	       
	       WebElement login=driver.findElement(By.className("decorativeSubmit"));
	       login.click();
	       
	       WebElement crmsfa=driver.findElement(By.linkText("CRM/SFA"));
	       crmsfa.click();
	       
	       WebElement clickLead=driver.findElement(By.linkText("Leads"));
	       clickLead.click();
	       
	       WebElement createLead=driver.findElement(By.partialLinkText("Create"));
	       createLead.click();
	       
	       WebElement companyName= driver.findElement(By.id("createLeadForm_companyName"));
	       companyName.sendKeys("TestLeaf");
	       
	       WebElement firstName=driver.findElement(By.id("createLeadForm_firstName"));
	       firstName.sendKeys("Abishekh");
	       
	       WebElement firstNameLocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
	       firstNameLocal.sendKeys("abi.dharan");
	       
	       WebElement salutation=driver.findElement(By.id("createLeadForm_personalTitle"));
	       salutation.sendKeys("Mr");
	       
	       WebElement title=driver.findElement(By.id("createLeadForm_generalProfTitle"));
	       title.sendKeys("Banking proj");
	       
	       WebElement annualRevenue=driver.findElement(By.id("createLeadForm_annualRevenue"));
	       annualRevenue.sendKeys("4000000");
	       
	       WebElement sicCode=driver.findElement(By.id("createLeadForm_sicCode"));
	       sicCode.sendKeys("100");
	       
	       WebElement description=driver.findElement(By.id("createLeadForm_description"));
	       description.sendKeys("This web application is highly secure");
	       
	       WebElement impNote=driver.findElement(By.id("createLeadForm_importantNote"));
	       impNote.sendKeys("complete faster");
	       
	       WebElement lastName=driver.findElement(By.id("createLeadForm_lastName"));
	       lastName.sendKeys("Rajendhran");
	       
	       WebElement lastNameLocal=driver.findElement(By.id("createLeadForm_lastNameLocal"));
	       lastNameLocal.sendKeys("Rajendhran");
	       
	       WebElement department=driver.findElement(By.id("createLeadForm_departmentName"));
	       department.sendKeys("inforamtion Tech");
	       
	       WebElement noOfEmployees=driver.findElement(By.id("createLeadForm_numberEmployees"));
	       noOfEmployees.sendKeys("40");
	       
	       WebElement tickerSymbol=driver.findElement(By.id("createLeadForm_tickerSymbol"));
	       tickerSymbol.sendKeys("Rey");
	       
	       WebElement areaCode=driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
	       areaCode.sendKeys("04324");
	       
	       WebElement extension=driver.findElement(By.id("createLeadForm_primaryPhoneExtension"));
	       extension.sendKeys("chromeExtension");
	       
	       WebElement emailaddress=driver.findElement(By.id("createLeadForm_primaryEmail"));
	       emailaddress.sendKeys("abishekh01112000@gmail.com");
	       
	       WebElement phoneNumber=driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
	       phoneNumber.sendKeys("9629968607");
	       
	       WebElement personToAskFor=driver.findElement(By.id("createLeadForm_primaryPhoneAskForName"));
	       personToAskFor.sendKeys("TestLead");
	       
	       WebElement url=driver.findElement(By.id("createLeadForm_primaryWebUrl"));
	       url.sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm");
	       
	       WebElement toName=driver.findElement(By.id("createLeadForm_generalToName"));
	       toName.sendKeys("Abishekh");
	       
	       WebElement addressLine1=driver.findElement(By.id("createLeadForm_generalAddress1"));
	       addressLine1.sendKeys("24/L-137 TNHB COLONY,KARUR");
	       
	       WebElement city=driver.findElement(By.id("createLeadForm_generalCity"));
	       city.sendKeys("Karur");
	       
	       WebElement zipcode=driver.findElement(By.id("createLeadForm_generalPostalCode"));
	       zipcode.sendKeys("639004");
	       
	       WebElement zipcodeExtension=driver.findElement(By.id("createLeadForm_generalPostalCodeExt"));
	       zipcodeExtension.sendKeys("639004...");
	       
	       WebElement attentionName2=driver.findElement(By.id("createLeadForm_generalAttnName"));
	       attentionName2.sendKeys("Abirey");
	       
	       WebElement addressLine2=driver.findElement(By.id("createLeadForm_generalAddress2"));
	       addressLine2.sendKeys("none");
	       
	       WebElement dropdown=driver.findElement(By.name("generalCountryGeoId"));
	       Select select=new Select(dropdown);
	       select.selectByValue("CXR");
	       
	       WebElement ClickSubmitButton=driver.findElement(By.name("submitButton"));
	       ClickSubmitButton.click();
	       

	}

}
