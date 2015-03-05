package management.payment;

public class Check extends Payment{
	private String name;
	private String bankID;
	
	public boolean authorized(){
		return false;
	}
}
