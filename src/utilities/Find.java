package utilities;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import enums.LocatorType;

public class Find {
	public static WebDriver driver = Driver.driver;
	public static WebElement element = null;
	
	public static WebElement Element(LocatorType locator, String value) throws NoSuchElementException{
		switch(locator) {
		case ID:
			element = driver.findElement(By.id(value));
			break;
		case NAME:
			element = driver.findElement(By.name(value));
			break;
		case XPATH:
			element = driver.findElement(By.xpath(value));
			break;
		case CSSSELECTOR:
			element = driver.findElement(By.cssSelector(value));
			break;
		case CLASSNAME:
			element = driver.findElement(By.className(value));
			break;
		case PARTIALLINK:
			element = driver.findElement(By.partialLinkText(value));
			break;
		case LINKTEXT:
			element = driver.findElement(By.linkText(value));
			break;
			default:
				throw new NoSuchElementException("The element " + value + " not found");
		}
		return element;
	}
	
	public static List<WebElement> Elements(LocatorType locator, String value) {
		 List<WebElement> elements = null;
		switch(locator) {
		case ID:
			elements = driver.findElements(By.id(value));
			break;
		case NAME:
			elements = driver.findElements(By.name(value));
			break;
		case XPATH:
			elements = driver.findElements(By.xpath(value));
			break;
		case CSSSELECTOR:
			elements = driver.findElements(By.cssSelector(value));
			break;
		case CLASSNAME:
			elements = driver.findElements(By.className(value));
			break;
		case PARTIALLINK:
			elements = driver.findElements(By.partialLinkText(value));
			break;
		case LINKTEXT:
			elements = driver.findElements(By.linkText(value));
			break;
			default:
				throw new NoSuchElementException("The element " + value + " not found");
		}
		return elements;
	}
}
