package com.utilitiesread;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {

	public static void takeScreenShot(WebDriver driver) throws Exception {
		Date odate = new Date();
		// System.out.println(odate); // to print date
		DateFormat df = new SimpleDateFormat("ddMMyyyy_HHmmssSSS");
		// DateFormat df=new SimpleDateFormat("_dd-MM-yyyy_HH;mm;ssSSS");
		String random = df.format(odate);
		System.out.println(random);
		TakesScreenshot oshot = (TakesScreenshot) driver;
		File srcFile = oshot.getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(srcFile, new File("C:\\AutomationUtils\\ScreenShot\\musafir.png"));
		FileUtils.copyFile(srcFile, new File("C:\\AutomationUtils\\ScreenShot\\swiggy_" + random + ".jpg"));
	}

}
