package Pages;

import org.openqa.selenium.WebElement;

import enums.LocatorType;
import utilities.Find;

public class Google {
	
	public static WebElement txt_SearchBar() {
		return Find.Element(LocatorType.NAME, "q");

	}

	public static WebElement btn_Search() {
		return Find.Element(LocatorType.XPATH, "(//input[@name='btnK'])[1]");
	}
	
	public static WebElement lbl_FirstResult(String valueToVerify) {
		return Find.Element(LocatorType.XPATH, "(//h3[contains(text(),'"+valueToVerify+"')])[1]");
	}
}
