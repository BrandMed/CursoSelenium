package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import enums.Expected;

public class Wait {
	
	public static WebDriver driver = Driver.driver;
	
	
	public static void implicit(int timeSeconds) {
		driver.manage().timeouts().implicitlyWait(timeSeconds,TimeUnit.SECONDS);
	}
	
	public static void Explicit(Expected ex, int timeSeconds, WebElement element) throws NoSuchElementException{
		WebDriverWait wait = new WebDriverWait(driver, timeSeconds);
		switch (ex) {
		case ELEMENT_TO_BE_CLICKABLE:
			wait.until(ExpectedConditions.elementToBeClickable(element));
			break;
		case VISIBILITY_OF:
			wait.until(ExpectedConditions.visibilityOf(element));
			break;
			
		case ELEMENT_TO_BE_SELECTED:
			wait.until(ExpectedConditions.elementToBeSelected(element));
			break;

		default:
			throw new NoSuchElementException("Element Not Found");
		}	
	}
	public static void Explicit(Expected ex, int timeSeconds, String value) {
		WebDriverWait wait = new WebDriverWait(driver, timeSeconds);
		switch (ex) {
		case TITLE_CONTAINS:
			wait.until(ExpectedConditions.titleContains(value));
			break;
		case TITLE_IS:
			wait.until(ExpectedConditions.titleIs(value));
			break;
			
		default:
			break;
		}	
	}
}
