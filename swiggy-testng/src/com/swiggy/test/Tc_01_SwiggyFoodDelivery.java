package com.swiggy.test;

import org.testng.annotations.Test;

import com.swiggy.pagefactory.MenuSelection;
import com.swiggy.pagefactory.OrderDetails;
import com.swiggy.pagefactory.ClickCakes;
import com.swiggy.pagefactory.DeliveryLocation;
import com.swiggy.pagefactory.SelectCakeRest;
import com.utilitiesread.ReadFromExcelUtilities;
import com.utilitiesread.ScreenShots;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Tc_01_SwiggyFoodDelivery {
 
	WebDriver driver;
	
	@Test
  public void swiggyFoodDelivery() throws Exception {
  
	driver.get("https://www.swiggy.com/");

	
	
	
	DeliveryLocation oDeliveryLocation=new DeliveryLocation(driver);
//	oDeliveryLocation.setDeliveryLocation();
	oDeliveryLocation.setDeliveryLocation();
	ScreenShots.takeScreenShot(driver);  //function is already static
	oDeliveryLocation.chooseFoodDelivery();
	
	
	ClickCakes oCakesSelection=new ClickCakes(driver);
	oCakesSelection.clickCakeOption();
	 
	SelectCakeRest oCakeRest=new SelectCakeRest(driver);
	oCakeRest.Choose20OfferCakeRest();
	
	MenuSelection oCakeMenuSelection=new MenuSelection(driver);
	oCakeMenuSelection.ChooseDishItem();
	ScreenShots.takeScreenShot(driver);  //function is already static
	oCakeMenuSelection.clickViewCart();
	
	OrderDetails oOrderDetails=new OrderDetails(driver);
	oOrderDetails.clickNewToSwiggy();
//	oOrderDetails.ClickContinue();
	oOrderDetails.SetCustomerDetails();
//	oOrderDetails.ClickContinue();

	}
  @BeforeTest
  public void beforeTest() {
	  this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  
  
  }

  @AfterTest
  public void afterTest() {
  }

}
