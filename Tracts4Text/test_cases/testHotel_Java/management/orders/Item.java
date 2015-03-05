package management.orders;

public class Item {
	private double shippingWeight;
	private String description;
	
	public double getPriceForQuantity(){
		return 0;
	}
	
	public double getTax(){
		return 0;
	}
	
	public boolean inStock(){
		return false;
	}
}
