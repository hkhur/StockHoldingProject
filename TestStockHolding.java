import java.util.Scanner;

public class TestStockHolding {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("How many Stocks User want : ");
//		int numberOfStocks = scanner.nextInt(); 
		StockHolding[] stock = new StockHolding[5];
		ForeignStockHolding[] fsh = new ForeignStockHolding[2];
		PopulateStockHoldingDAO psh = new PopulateStockHoldingDAO();
		stock = psh.getStocksData();
		int i;
		for(i=0;i<(stock.length)-2;i++) {
			System.out.println("Stock Number    : "+ (i+1));
			System.out.println("--Stock Info--");
			System.out.println("Purchase Price  : "+ "$"+ stock[i].getPurchaseSharePrice());
			System.out.println("Current Price   : "+ "$"+ stock[i].getCurrentSharePrice());
			System.out.println("Number of Shares: "+ stock[i].getNumberOfShares());
			System.out.println("Company Name    : "+ stock[i].getCompanyName());
			System.out.println();
			
			
		}

		for( i=3;i<stock.length-1;i++) {
			System.out.println("Stock Number    : "+ (i+1));
			System.out.println("--Stock Info--");
			System.out.println("Purchase Price  : "+ "$"+ stock[i].getPurchaseSharePrice());
			System.out.println("Current Price   : "+ "$"+ stock[i].getCurrentSharePrice());
			System.out.println("Number of Shares: "+ stock[i].getNumberOfShares());
			System.out.println("Company Name    : "+ stock[i].getCompanyName());
			System.out.println("Conversion Rate :"+0.35);
			System.out.println();
	}

}
}
