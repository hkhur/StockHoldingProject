import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PopulateStockHoldingDAO {

	private List fillStocksData() {
		Scanner scanner = new Scanner(System.in);
		List stocks = new ArrayList<>();
		StockHolding sh1 = new StockHolding();
		System.out.println("Enter The Company name        :");
		String cname = scanner.next();
		sh1.setCompanyName(cname);
		System.out.println("Enter The Current Share price :");
		Integer cshareprice = scanner.nextInt();
		sh1.setCurrentSharePrice(cshareprice);
		System.out.println("Enter The number of shares    :");
		Integer nos = scanner.nextInt();
		sh1.setNumberOfShares(nos);
		System.out.println("Enter The Purchase Share price :");
    	Integer pshareprice = scanner.nextInt();
    	sh1.setPurchaseSharePrice(pshareprice);
    	stocks.add(sh1);
    	
    	StockHolding sh2 = new StockHolding();
		System.out.println("Enter The Company name        :");
		String cname1 = scanner.next();
		sh2.setCompanyName(cname1);
		System.out.println("Enter The Current Share price :");
		Integer cshareprice1 = scanner.nextInt();
		sh2.setCurrentSharePrice(cshareprice1);
		System.out.println("Enter The number of shares    :");
		Integer nos1 = scanner.nextInt();
		sh2.setNumberOfShares(nos1);
		System.out.println("Enter The Purchase Share price :");
    	Integer pshareprice1 = scanner.nextInt();
    	sh2.setPurchaseSharePrice(pshareprice1);
    	stocks.add(sh2);
		
		
    	StockHolding sh3 = new StockHolding();
		System.out.println("Enter The Company name        :");
		String cname2 = scanner.next();
		sh3.setCompanyName(cname2);
		System.out.println("Enter The Current Share price :");
		Integer cshareprice2 = scanner.nextInt();
		sh2.setCurrentSharePrice(cshareprice2);
		System.out.println("Enter The number of shares    :");
		Integer nos2 = scanner.nextInt();
		sh3.setNumberOfShares(nos2);
		System.out.println("Enter The Purchase Share price :");
    	Integer pshareprice2 = scanner.nextInt();
    	sh3.setPurchaseSharePrice(pshareprice2);
    	stocks.add(sh3);
		
    	ForeignStockHolding fsh1 = new ForeignStockHolding();
		System.out.println("Enter The Company name        :");
		String cname3 = scanner.next();
		fsh1.setCompanyName(cname3);
		System.out.println("Enter The Current Share price :");
		Integer cshareprice3 = scanner.nextInt();
		fsh1.setCurrentSharePrice(cshareprice3);
		System.out.println("Enter The number of shares    :");
		Integer nos3 = scanner.nextInt();
		fsh1.setNumberOfShares(nos3);
		System.out.println("Enter The Purchase Share price :");
    	Integer pshareprice3 = scanner.nextInt();
    	fsh1.setPurchaseSharePrice(pshareprice3);
    	System.out.println("Enter The Conversion rate      :");
    	Integer cr1 = scanner.nextInt();
    	fsh1.setConversionRate(cr1);
    	stocks.add(fsh1);
		
    	ForeignStockHolding fsh2 = new ForeignStockHolding();
		System.out.println("Enter The Company name        :");
		String cname4 = scanner.next();
		fsh1.setCompanyName(cname4);
		System.out.println("Enter The Current Share price :");
		Integer cshareprice4 = scanner.nextInt();
		fsh1.setCurrentSharePrice(cshareprice4);
		System.out.println("Enter The number of shares    :");
		Integer nos4 = scanner.nextInt();
		fsh1.setNumberOfShares(nos4);
		System.out.println("Enter The Purchase Share price :");
    	Integer pshareprice4 = scanner.nextInt();
    	fsh1.setPurchaseSharePrice(pshareprice4);
    	System.out.println("Enter The Conversion rate      :");
    	Integer cr2 = scanner.nextInt();
    	fsh1.setConversionRate(cr2);
    	stocks.add(fsh1);
	    
    	return stocks;
		
		
	}

public List getStocksData() {
	return fillStocksData();
}



}
