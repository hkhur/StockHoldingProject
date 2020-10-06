import java.util.Comparator;

public class StockHolding extends NSObject{

	private Integer purchaseSharePrice;
	private Integer currentSharePrice;
	private Integer numberOfShares;
	private String companyName;
	
	public Integer getPurchaseSharePrice() {
		return purchaseSharePrice;
	}
	public void setPurchaseSharePrice(Integer purchaseSharePrice) {
		this.purchaseSharePrice = purchaseSharePrice;
	}
	public Integer getCurrentSharePrice() {
		return currentSharePrice;
	}
	public void setCurrentSharePrice(Integer currentSharePrice) {
		this.currentSharePrice = currentSharePrice;
	}
	public Integer getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(Integer numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public Integer costInDollars() {
		return purchaseSharePrice*numberOfShares;
		
	}
	public Integer valueInDollars() {
		return currentSharePrice*numberOfShares;
	}
	
	
	
}
