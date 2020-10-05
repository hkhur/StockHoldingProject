
public class TestStockHolding {

	public static void main(String[] args) {
		
		StockHolding[] stock = new StockHolding[3];
		PopulateStockHoldingDAO psh = new PopulateStockHoldingDAO();
		stock = psh.getStocksData();
		
		for(int i=0;i<stock.length;i++) {
			System.out.println("Stock Number    : "+ (i+1));
			System.out.println("--Stock Info--");
			System.out.println("Purchase Price  : "+ "$"+ stock[i].getPurchaseSharePrice());
			System.out.println("Current Price   : "+ "$"+ stock[i].getCurrentSharePrice());
			System.out.println("Number of Shares: "+ stock[i].getNumberOfShares());
			System.out.println("Company Name    : "+ stock[i].getCompanyName());
			System.out.println();
			
		}

	}

}
