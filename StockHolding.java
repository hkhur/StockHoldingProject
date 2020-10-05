
public class StockHolding extends NSObject implements Comparable<StockHolding>{

	private float purchaseSharePrice;
	private float currentSharePrice;
	private int numberOfShares;
	private String companyName;
	
	public float getPurchaseSharePrice() {
		return purchaseSharePrice;
	}
	public void setPurchaseSharePrice(float purchaseSharePrice) {
		this.purchaseSharePrice = purchaseSharePrice;
	}
	public float getCurrentSharePrice() {
		return currentSharePrice;
	}
	public void setCurrentSharePrice(float currentSharePrice) {
		this.currentSharePrice = currentSharePrice;
	}
	public int getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public float costInDollars() {
		return purchaseSharePrice*numberOfShares;
		
	}
	public float valueInDollars() {
		return currentSharePrice*numberOfShares;
	}
	@Override
	public int compareTo(StockHolding o) {
		return this.getCompanyName().compareTo(((StockHolding)o).getCompanyName());
	}
	
}
