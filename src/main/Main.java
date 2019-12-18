package main;

import enums.Browser;

import exceptions.ActionException;
import testCases.SearchHexawareInGoogle;
import utilities.Do;
import utilities.Driver;
import utilities.ExcelToObject;

public class Main {
	public static void main(String args[]) {
		Driver.Open(Browser.CHROME);
		
		ExcelToObject.read("C:/Users/Training/Desktop/Excel.xlsx");
		try {
			SearchHexawareInGoogle.iteration();
			Driver.Close();
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
