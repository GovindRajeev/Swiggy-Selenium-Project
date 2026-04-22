package com.swiggy.pagefactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectCakeRest {
WebDriverWait wait;
WebDriver driver;
 @FindBy(xpath = "(//div[contains(text(),'20% OFF')])[1]") WebElement click20PerOfferCake;


// @FindBy(xpath = "(//div[contains(text(),'10% OFF')])[1]") WebElement click60PerOfferCake;

public SelectCakeRest(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    this.driver=driver;

}

public void Choose20OfferCakeRest() throws Exception{
	Thread.sleep(5000);
	
//	Actions oactions= new Actions(driver);
//	oactions.moveToElement(click20PerOfferCake).perform();
	
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.PAGE_DOWN).perform();

	
//	int restaurantPositionY = click20PerOfferCake.getLocation().getY();
//	int visibleWindowHeight = driver.manage().window().getSize().getHeight();
//	
//	if (restaurantPositionY > visibleWindowHeight) {
//	    Actions oactions = new Actions(driver);
//	    oactions.sendKeys(Keys.PAGE_DOWN).perform();
//	    System.out.println("Scrolled down to bring 20% restaurant into view.");
//	} else {
//	    System.out.println("20% restaurant is already visible or above. No scrolling needed.");
//	}
	
	wait.until(ExpectedConditions.visibilityOf(click20PerOfferCake)).click();
 




// wait.until(ExpectedConditions.visibilityOf(click60PerOfferCake)).click();

}


}
