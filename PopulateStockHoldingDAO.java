import java.util.Scanner;

public class PopulateStockHoldingDAO {

	private StockHolding[] fillStocksData() {
		Scanner scanner = new Scanner(System.in);
		
		StockHolding[] stocks = new StockHolding[5];
		stocks[0] = new StockHolding();
		System.out.println("Enter The Company name        :");
		String cname = scanner.next();
		stocks[0].setCompanyName(cname);
		System.out.println("Enter The Current Share price :");
		float cshareprice = scanner.nextFloat();
		stocks[0].setCurrentSharePrice(cshareprice);
		System.out.println("Enter The number of shares    :");
		int nos = scanner.nextInt();
		stocks[0].setNumberOfShares(nos);
		System.out.println("Enter The purchase Share price :");
		float pshareprice = scanner.nextFloat();
		stocks[0].setPurchaseSharePrice(pshareprice);
		
		stocks[1] = new StockHolding();
		System.out.println("Enter The Company name        :");
		String cname1 = scanner.next();
		stocks[1].setCompanyName(cname1);
		System.out.println("Enter The Current Share price :");
		float cshareprice1 = scanner.nextFloat();
		stocks[1].setCurrentSharePrice(cshareprice1);
		System.out.println("Enter The number of shares    :");
		int nos1 = scanner.nextInt();
		stocks[1].setNumberOfShares(nos1);
		System.out.println("Enter The purchase Share price :");
		float pshareprice1 = scanner.nextFloat();
		stocks[1].setPurchaseSharePrice(pshareprice1);
		
		stocks[2] = new StockHolding();
		System.out.println("Enter The Company name        :");
		String cname2 = scanner.next();
		stocks[2].setCompanyName(cname2);
		System.out.println("Enter The Current Share price :");
		float cshareprice2 = scanner.nextFloat();
		stocks[2].setCurrentSharePrice(cshareprice2);
		System.out.println("Enter The number of shares    :");
		int nos2 = scanner.nextInt();
		stocks[2].setNumberOfShares(nos2);
		System.out.println("Enter The purchase Share price :");
		float pshareprice2 = scanner.nextFloat();
		stocks[2].setPurchaseSharePrice(pshareprice2);

	
		stocks[3] = new StockHolding();
		System.out.println("Enter The Company name        :");
		String cname3 = scanner.next();
		stocks[3].setCompanyName(cname3);
		System.out.println("Enter The Current Share price :");
		float cshareprice3 = scanner.nextFloat();
		stocks[3].setCurrentSharePrice(cshareprice3);
		System.out.println("Enter The number of shares    :");
		int nos3 = scanner.nextInt();
		stocks[3].setNumberOfShares(nos3);
		System.out.println("Enter The purchase Share price :");
		float pshareprice3 = scanner.nextFloat();
		stocks[3].setPurchaseSharePrice(pshareprice3);
		
		stocks[4] = new StockHolding();
		System.out.println("Enter The Company name        :");
		String cname4 = scanner.next();
		stocks[4].setCompanyName(cname4);
		System.out.println("Enter The Current Share price :");
		float cshareprice4 = scanner.nextFloat();
		stocks[4].setCurrentSharePrice(cshareprice4);
		System.out.println("Enter The number of shares    :");
		int nos4 = scanner.nextInt();
		stocks[4].setNumberOfShares(nos4);
		System.out.println("Enter The purchase Share price :");
		float pshareprice4 = scanner.nextFloat();
		stocks[4].setPurchaseSharePrice(pshareprice4);
		
		
		System.out.println("Display stock Information with the lowest vaulue");
		System.out.println("Display stock with highest value");
		System.out.println("Display the most profitable stock");
		System.out.println("Display the least Profitable stock");
		System.out.println("Display stock Information with the lowest vaulue");
		System.out.println("List all stocks sorted by company name(A-Z)");
		System.out.println("List all stocks sorted from the lowest to the highest value");
		System.out.println("Exit");
		
		return stocks;
		
		
	}

public StockHolding[] getStocksData() {
	return fillStocksData();
}



}
