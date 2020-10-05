
public class PopulateStockHoldingDAO {

	private StockHolding[] fillStocksData() {
		
		StockHolding[] stocks = new StockHolding[5];
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
		
		stocks[3] = new ForeignStockHolding();
		stocks[3].setCompanyName("Nyka");
		stocks[3].setCurrentSharePrice(49.51f);
		stocks[3].setNumberOfShares(210);
		stocks[3].setPurchaseSharePrice(45.10f);
		
		stocks[4] = new ForeignStockHolding();
		stocks[4].setCompanyName("Orange");
		stocks[4].setCurrentSharePrice(49.51f);
		stocks[4].setNumberOfShares(210);
		stocks[4].setPurchaseSharePrice(45.10f);
		
		return stocks;
		
		
	}

public StockHolding[] getStocksData() {
	return fillStocksData();
}



}
