package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import enums.Action;
import exceptions.ActionException;

public class Do {
	public static WebDriver driver = Driver.driver;

	public static void action(Action action, String value) throws ActionException {
		switch (action) {
		case NAVIGATE:
			if (value.contains("https://") || value.contains("http://")) {
				driver.navigate().to(value);
			} else {
				value = "https://" + value;
				driver.navigate().to(value);
			}
			break;

		default:
			throw new ActionException("Invalid action");
		}
	}

	public static void action(Action action) throws ActionException {
		switch (action) {
		case REFRESH:
			driver.navigate().refresh();
			break;

		case FORWARD:
			driver.navigate().forward();
			break;

		case BACK:
			driver.navigate().back();
			break;

		default:
			throw new ActionException("Invalid Action");
		}
	}

	public static void action(Action action, String value, WebElement element) throws ActionException {
		switch (action) {
		case TYPE:
			element.sendKeys(value);
			break;
		default:
			throw new ActionException("Invalid Action");
		}

	}

	public static boolean action(Action action, WebElement element) throws ActionException {
		switch (action) {
		case CLICK:
			try {
				element.click();
				return true;
			} catch (Exception e) {
				return false;
			}
		case VERIFY_IF_EXIST:
			return element != null ? true : false;

		default:
			throw new ActionException("Invalid Action");
		}
	}

}
