package testCases;

import Pages.Google;
import enums.Action;
import enums.Expected;
import exceptions.ActionException;
import utilities.Do;
import utilities.ExcelToObject;
import utilities.Wait;

public class SearchHexawareInGoogle {

	public static void execute(String valueToSearch) throws ActionException {
		
		Do.action(Action.NAVIGATE, "www.google.com");
		Wait.implicit(5);
		Do.action(Action.TYPE, valueToSearch, Google.txt_SearchBar());
		Wait.Explicit(Expected.ELEMENT_TO_BE_CLICKABLE, 5, Google.btn_Search());
		Do.action(Action.CLICK, Google.btn_Search());
		if(Do.action(Action.VERIFY_IF_EXIST, Google.lbl_FirstResult(valueToSearch))) {
			System.out.println("Contains");
		}else {
			System.out.println("Not Contains");
		}
		
	}
	
	public static void iteration() throws ActionException {
		
		for(int i = 0; i < ExcelToObject.tableList.size(); i++) {
			
			execute(ExcelToObject.tableList.get(i).getValueToBeSearched());
		}
		
	}

}
