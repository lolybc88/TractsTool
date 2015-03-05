package management.payment;

public class Credit extends Payment{
	private int number;
	private String type;
	private String expDate;
	
	public boolean authorized(){
		return false;
	}
}
