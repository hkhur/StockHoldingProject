
public class PopulateStockHoldingDAO {

	private StockHolding[] fillStocksData() {
		
		StockHolding[] stocks = new StockHolding[3];
		stocks[0] = new StockHolding();
		stocks[0].setCompanyName("Amazon");
		stocks[0].setCurrentSharePrice(4.50f);
		stocks[0].setNumberOfShares(40);
		stocks[0].setPurchaseSharePrice(2.30f);
		
		stocks[1] = new StockHolding();
		stocks[1].setCompanyName("Facebook");
		stocks[1].setCurrentSharePrice(10.56f);
		stocks[1].setNumberOfShares(90);
		stocks[1].setPurchaseSharePrice(12.19f);
		
		stocks[2] = new StockHolding();
		stocks[2].setCompanyName("Myntra");
		stocks[2].setCurrentSharePrice(49.51f);
		stocks[2].setNumberOfShares(210);
		stocks[2].setPurchaseSharePrice(45.10f);
		
		return stocks;
		
		
	}

public StockHolding[] getStocksData() {
	return fillStocksData();
}



}
