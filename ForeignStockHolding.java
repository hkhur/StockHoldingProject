
public class ForeignStockHolding extends StockHolding {
private Integer conversionRate;
private StockHolding stockholding;

public Integer getConversionRate() {
	 conversionRate = costInDollars()*valueInDollars();
     return conversionRate;
}

public void setConversionRate(Integer conversionRate) {
	this.conversionRate = conversionRate;
}

public Integer costInDollars() {
	return stockholding.getCurrentSharePrice()*stockholding.getNumberOfShares();
	
}
public Integer valueInDollars() {
	return stockholding.getPurchaseSharePrice()*stockholding.getNumberOfShares();
}

}
