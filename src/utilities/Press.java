package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import enums.BotKey;

public class Press {
	protected static Robot robot;
	
	public static void Key(BotKey botkey) throws InterruptedException, AWTException{
		robot = new Robot();
		switch (botkey) {
		case TAB:
			robot.keyPress(KeyEvent.VK_TAB);
			break;
		case SPACE:
			robot.keyPress(KeyEvent.VK_SPACE);
			break;
		case DELETE:
			robot.keyPress(KeyEvent.VK_DELETE);
			break;
		case ENTER:
			robot.keyPress(KeyEvent.VK_ENTER);
			
			break;
			
		case ESCAPE:
			robot.keyPress(KeyEvent.VK_ESCAPE);
			break;
			
		case PAGE_DOWN:
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			break;
			
		case PAGE_UP:
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			break;
			
		case PRINT_SCREEN:
			robot.keyPress(KeyEvent.VK_PRINTSCREEN);
			break;
			
		default:
			throw new InterruptedException();
		}
	}
}
