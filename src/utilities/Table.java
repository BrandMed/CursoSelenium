package utilities;

public class Table {

	private String ValueToBeSearched;
	private String URL;

	public Table() {
	}

	public Table(String ValueToBeSearched, String URL) {
		super();
		this.setValueToBeSearched(ValueToBeSearched);
		this.setURL(URL);
	}
	
	public String getValueToBeSearched() {
		return ValueToBeSearched;
	}

	public void setValueToBeSearched(String valueToBeSearched) {
		ValueToBeSearched = valueToBeSearched;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

}
