
public class ForeignStockHolding extends StockHolding {
private float conversionRate;
private StockHolding stockholding;

public float getConversionRate() {
	 conversionRate = costInDollars()*valueInDollars();
     return conversionRate;
}

public float costInDollars() {
	return stockholding.getCurrentSharePrice()*stockholding.getNumberOfShares();
	
}
public float valueInDollars() {
	return stockholding.getPurchaseSharePrice()*stockholding.getNumberOfShares();
}

}
