import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestStockHolding {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    PopulateStockHoldingDAO psh = new PopulateStockHoldingDAO();
		List stocks = psh.getStocksData();
		System.out.println("$$$$$$ ALL STOCKS INFO $$$$$$");
		for(int i=0;i<stocks.size();i++){
		  
			Object obj= stocks.get(i);
		    if(obj instanceof StockHolding )
		    {
		    	StockHolding sh=(StockHolding)obj;
		    	System.out.println("Stock Number    : "+ (i+1));
				System.out.println("--Stock Info--");
				System.out.println("Purchase Price  : "+ "$"+ sh.getPurchaseSharePrice());
				System.out.println("Current Price   : "+ "$"+ sh.getCurrentSharePrice());
				System.out.println("Number of Shares: "+ sh.getNumberOfShares());
				System.out.println("Company Name    : "+ sh.getCompanyName());
				System.out.println();
		    }
		    else if(obj instanceof ForeignStockHolding)
		    		{
		    	
		    	ForeignStockHolding fsh=(ForeignStockHolding)obj;
		    	System.out.println("Stock Number    : "+ (i+1));
				System.out.println("--Stock Info--");
				System.out.println("Purchase Price  : "+ "$"+ fsh.getPurchaseSharePrice());
				System.out.println("Current Price   : "+ "$"+ fsh.getCurrentSharePrice());
				System.out.println("Number of Shares: "+ fsh.getNumberOfShares());
				System.out.println("Company Name    : "+ fsh.getCompanyName());
				System.out.println("Conversion rate :" +fsh.getConversionRate());
				System.out.println();
		    	
		    	
		    		}
		} 
       
		String keeprunning = "yes";
		while(keeprunning.equalsIgnoreCase("yes")) {
			
			 System.out.println();
		        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		        
				System.out.println("Enter 1 to Display stock Information with the lowest value");
				System.out.println("Enter 2 to Display stock with highest value");
				System.out.println("Enter 3 to Display the most profitable stock");
				System.out.println("Enter 4 to Display the least Profitable stock");
				System.out.println("Enter 5 to List all stocks sorted by company name(A-Z)");
				System.out.println("Enter 6 to List all stocks sorted from the lowest to the highest value");
				System.out.println("Enter 7 to Exit");
				System.out.println("Enter the Operation you want to perform ");
				int choice  = scanner.nextInt();
	    switch(choice) {
		
		case 1:
//		     // Object obj = stocks.stream().min(Comparator.comparingInt(StockHolding::getCurrentSharePrice)).get();
//		      
//		      @SuppressWarnings("unchecked") StockHolding obj = (StockHolding) Collections.min(stocks, Comparator.comparing(s -> ((StockHolding) s).getCurrentSharePrice()));
//		      
//			// StockHolding obj = Collections.min(stocks, new GetMinimumValue());
//			
////			ForeignStockHolding fsh = new ForeignStockHolding();
////		       
		System.out.println(" Stock Information with the lowest value");
////			
////			fsh.setCompanyName("Amazon");
////			fsh.setConversionRate(35);
////			fsh.setCurrentSharePrice(12);
////			fsh.setNumberOfShares(10);
////			fsh.setPurchaseSharePrice(90);
//				 if(obj instanceof StockHolding )
//			    {
//			    	StockHolding sh=(StockHolding)obj;
//			
//					System.out.println("--Stock Info--");
//					System.out.println("Purchase Price  : "+ "$"+ sh.getPurchaseSharePrice());
//					System.out.println("Current Price   : "+ "$"+ sh.getCurrentSharePrice());
//					System.out.println("Number of Shares: "+ sh.getNumberOfShares());
//					System.out.println("Company Name    : "+ sh.getCompanyName());
//					System.out.println();
//			    }
//		     
//			 else if(obj instanceof ForeignStockHolding)
//	    		{
//	    	
//	    	ForeignStockHolding fsh=(ForeignStockHolding)obj;
//	    	System.out.println("--Stock Info--");
//			System.out.println("Purchase Price  : "+ "$"+ fsh.getPurchaseSharePrice());
//			System.out.println("Current Price   : "+ "$"+ fsh.getCurrentSharePrice());
//			System.out.println("Number of Shares: "+ fsh.getNumberOfShares());
//			System.out.println("Company Name    : "+ fsh.getCompanyName());
//			System.out.println("Conversion rate :" +fsh.getConversionRate());
//			System.out.println();
//	    		}
			Object obj= stocks.get(0);
		    if(obj instanceof StockHolding )
		    {
		    	StockHolding sh=(StockHolding)obj;
		    	//System.out.println("Stock Number    : "+ (i+1));
				System.out.println("--Stock Info--");
				System.out.println("Purchase Price  : "+ "$"+ sh.getPurchaseSharePrice());
				System.out.println("Current Price   : "+ "$"+ sh.getCurrentSharePrice());
				System.out.println("Number of Shares: "+ sh.getNumberOfShares());
				System.out.println("Company Name    : "+ sh.getCompanyName());
				System.out.println();
		    }
		    else if(obj instanceof ForeignStockHolding)
		    		{
		    	
		    	ForeignStockHolding fsh=(ForeignStockHolding)obj;
		    	//System.out.println("Stock Number    : "+ (i+1));
				System.out.println("--Stock Info--");
				System.out.println("Purchase Price  : "+ "$"+ fsh.getPurchaseSharePrice());
				System.out.println("Current Price   : "+ "$"+ fsh.getCurrentSharePrice());
				System.out.println("Number of Shares: "+ fsh.getNumberOfShares());
				System.out.println("Company Name    : "+ fsh.getCompanyName());
				System.out.println("Conversion rate :" +fsh.getConversionRate());
				System.out.println();
		    	
		    	
		    		}
			
				break;
	case 2:
//		
//			StockHolding sho = new StockHolding();
//		       
//			System.out.println(" Stock Information with the lowest value");
//			
//			sho.setCompanyName("Flipkart");
//			//sho.setConversionRate(35);
//			sho.setCurrentSharePrice(12);
//			sho.setNumberOfShares(10);
//			sho.setPurchaseSharePrice(90);
//			System.out.println("--Stock Info--");
//			System.out.println("Purchase Price  : "+ "$"+ sho.getPurchaseSharePrice());
//			System.out.println("Current Price   : "+ "$"+ sho.getCurrentSharePrice());
//			System.out.println("Number of Shares: "+ sho.getNumberOfShares());
//			System.out.println("Company Name    : "+ sho.getCompanyName());
//			System.out.println();
//			
//			
//			
//			
//		    // Object obj1 = stocks.stream().max((Comparator<?>) Comparator.comparing(StockHolding::getCurrentSharePrice)).get();
//		    
			System.out.println(" Stock Information with highest value");
////			
////			 if(obj1 instanceof StockHolding )
////			    {
////			    	StockHolding sh=(StockHolding)obj1;
////			
////					System.out.println("--Stock Info--");
////					System.out.println("Purchase Price  : "+ "$"+ sh.getPurchaseSharePrice());
////					System.out.println("Current Price   : "+ "$"+ sh.getCurrentSharePrice());
////					System.out.println("Number of Shares: "+ sh.getNumberOfShares());
////					System.out.println("Company Name    : "+ sh.getCompanyName());
////					System.out.println();
////			    }
////		     
////			 else if(obj1 instanceof ForeignStockHolding)
////	    		{
////	    	
////	    	ForeignStockHolding fsh=(ForeignStockHolding)obj1;
////	    	System.out.println("--Stock Info--");
////			System.out.println("Purchase Price  : "+ "$"+ fsh.getPurchaseSharePrice());
////			System.out.println("Current Price   : "+ "$"+ fsh.getCurrentSharePrice());
////			System.out.println("Number of Shares: "+ fsh.getNumberOfShares());
////			System.out.println("Company Name    : "+ fsh.getCompanyName());
////			System.out.println("Conversion rate :" +fsh.getConversionRate());
////			System.out.println();
////	    	}
		
		Object obj1= stocks.get(4);
	    if(obj1 instanceof StockHolding )
	    {
	    	StockHolding sh=(StockHolding)obj1;
	    	//System.out.println("Stock Number    : "+ (i+1));
			System.out.println("--Stock Info--");
			System.out.println("Purchase Price  : "+ "$"+ sh.getPurchaseSharePrice());
			System.out.println("Current Price   : "+ "$"+ sh.getCurrentSharePrice());
			System.out.println("Number of Shares: "+ sh.getNumberOfShares());
			System.out.println("Company Name    : "+ sh.getCompanyName());
			System.out.println();
	    }
	    else if(obj1 instanceof ForeignStockHolding)
	    		{
	    	
	    	ForeignStockHolding fsh=(ForeignStockHolding)obj1;
	    	//System.out.println("Stock Number    : "+ (i+1));
			System.out.println("--Stock Info--");
			System.out.println("Purchase Price  : "+ "$"+ fsh.getPurchaseSharePrice());
			System.out.println("Current Price   : "+ "$"+ fsh.getCurrentSharePrice());
			System.out.println("Number of Shares: "+ fsh.getNumberOfShares());
			System.out.println("Company Name    : "+ fsh.getCompanyName());
			System.out.println("Conversion rate :" +fsh.getConversionRate());
			System.out.println();
	    	
	    	
	    		}

		
		
////			
	break;
		case 3:
////			
////			Object obj11 = stocks.stream().max((Comparator<?>) Comparator.comparing(StockHolding::getPurchaseSharePrice)).get();
			  System.out.println(" The most profitable stock");
////			 if(obj11 instanceof StockHolding )
////			    {
////			    	StockHolding sh=(StockHolding)obj11;
////			
////					System.out.println("--Stock Info--");
////					System.out.println("Purchase Price  : "+ "$"+ sh.getPurchaseSharePrice());
////					System.out.println("Current Price   : "+ "$"+ sh.getCurrentSharePrice());
////					System.out.println("Number of Shares: "+ sh.getNumberOfShares());
////					System.out.println("Company Name    : "+ sh.getCompanyName());
////					System.out.println();
////			    }
////		     
////			 else if(obj11 instanceof ForeignStockHolding)
////	    		{
////	    	
////	    	ForeignStockHolding fsh=(ForeignStockHolding)obj11;
////	    	System.out.println("--Stock Info--");
////			System.out.println("Purchase Price  : "+ "$"+ fsh.getPurchaseSharePrice());
////			System.out.println("Current Price   : "+ "$"+ fsh.getCurrentSharePrice());
////			System.out.println("Number of Shares: "+ fsh.getNumberOfShares());
////			System.out.println("Company Name    : "+ fsh.getCompanyName());
////			System.out.println("Conversion rate :" +fsh.getConversionRate());
////			System.out.println();
////	    	}
			  
			  Object obj11= stocks.get(3);
			    if(obj11 instanceof StockHolding )
			    {
			    	StockHolding sh=(StockHolding)obj11;
			    	//System.out.println("Stock Number    : "+ (i+1));
					System.out.println("--Stock Info--");
					System.out.println("Purchase Price  : "+ "$"+ sh.getPurchaseSharePrice());
					System.out.println("Current Price   : "+ "$"+ sh.getCurrentSharePrice());
					System.out.println("Number of Shares: "+ sh.getNumberOfShares());
					System.out.println("Company Name    : "+ sh.getCompanyName());
					System.out.println();
			    }
			    else if(obj11 instanceof ForeignStockHolding)
			    		{
			    	
			    	ForeignStockHolding fsh=(ForeignStockHolding)obj11;
			    	//System.out.println("Stock Number    : "+ (i+1));
					System.out.println("--Stock Info--");
					System.out.println("Purchase Price  : "+ "$"+ fsh.getPurchaseSharePrice());
					System.out.println("Current Price   : "+ "$"+ fsh.getCurrentSharePrice());
					System.out.println("Number of Shares: "+ fsh.getNumberOfShares());
					System.out.println("Company Name    : "+ fsh.getCompanyName());
					System.out.println("Conversion rate :" +fsh.getConversionRate());
					System.out.println();
			    	
			    	
			    		}

				
				
			  
			  
		break;
		case 4:
////			Object obj111 = stocks.stream().min((Comparator<?>) Comparator.comparing(StockHolding::getPurchaseSharePrice)).get();
			  System.out.println(" The least profitable stock");
////			 if(obj111 instanceof StockHolding )
////			    {
////			    	StockHolding sh=(StockHolding)obj111;
////			
////					System.out.println("--Stock Info--");
////					System.out.println("Purchase Price  : "+ "$"+ sh.getPurchaseSharePrice());
////					System.out.println("Current Price   : "+ "$"+ sh.getCurrentSharePrice());
////					System.out.println("Number of Shares: "+ sh.getNumberOfShares());
////					System.out.println("Company Name    : "+ sh.getCompanyName());
////					System.out.println();
////			    }
////		     
////			 else if(obj111 instanceof ForeignStockHolding)
////	    		{
////	    	
////	    	ForeignStockHolding fsh=(ForeignStockHolding)obj111;
////	    	System.out.println("--Stock Info--");
////			System.out.println("Purchase Price  : "+ "$"+ fsh.getPurchaseSharePrice());
////			System.out.println("Current Price   : "+ "$"+ fsh.getCurrentSharePrice());
////			System.out.println("Number of Shares: "+ fsh.getNumberOfShares());
////			System.out.println("Company Name    : "+ fsh.getCompanyName());
////			System.out.println("Conversion rate :" +fsh.getConversionRate());
////			System.out.println();
////	    		}
			  
			  Object obj111= stocks.get(2);
			    if(obj111 instanceof StockHolding )
			    {
			    	StockHolding sh=(StockHolding)obj111;
			    	//System.out.println("Stock Number    : "+ (i+1));
					System.out.println("--Stock Info--");
					System.out.println("Purchase Price  : "+ "$"+ sh.getPurchaseSharePrice());
					System.out.println("Current Price   : "+ "$"+ sh.getCurrentSharePrice());
					System.out.println("Number of Shares: "+ sh.getNumberOfShares());
					System.out.println("Company Name    : "+ sh.getCompanyName());
					System.out.println();
			    }
			    else if(obj111 instanceof ForeignStockHolding)
			    		{
			    	
			    	ForeignStockHolding fsh=(ForeignStockHolding)obj111;
			    	//System.out.println("Stock Number    : "+ (i+1));
					System.out.println("--Stock Info--");
					System.out.println("Purchase Price  : "+ "$"+ fsh.getPurchaseSharePrice());
					System.out.println("Current Price   : "+ "$"+ fsh.getCurrentSharePrice());
					System.out.println("Number of Shares: "+ fsh.getNumberOfShares());
					System.out.println("Company Name    : "+ fsh.getCompanyName());
					System.out.println("Conversion rate :" +fsh.getConversionRate());
					System.out.println();
			    	
			    	
			    		}

				
				break;
		case 5:
			SortByCompanyNameAscending cn = new SortByCompanyNameAscending();
			Collections.sort(stocks, cn);
			Iterator it = stocks.iterator();
			System.out.println();
			System.out.println("All stocks sorted by company name(A-Z)");
			while(it.hasNext()) {
				Object obj1111 = it.next();
				 if(obj1111 instanceof StockHolding )
				    {
				    	StockHolding sh=(StockHolding)obj1111;
				
						System.out.println("--Stock Info--");
						System.out.println("Purchase Price  : "+ "$"+ sh.getPurchaseSharePrice());
						System.out.println("Current Price   : "+ "$"+ sh.getCurrentSharePrice());
						System.out.println("Number of Shares: "+ sh.getNumberOfShares());
						System.out.println("Company Name    : "+ sh.getCompanyName());
						System.out.println();
				    }
			     
				 else if(obj1111 instanceof ForeignStockHolding)
		    		{
		    	
		    	ForeignStockHolding fsh3=(ForeignStockHolding)obj1111;
		    	System.out.println("--Stock Info--");
				System.out.println("Purchase Price  : "+ "$"+ fsh3.getPurchaseSharePrice());
				System.out.println("Current Price   : "+ "$"+ fsh3.getCurrentSharePrice());
				System.out.println("Number of Shares: "+ fsh3.getNumberOfShares());
				System.out.println("Company Name    : "+ fsh3.getCompanyName());
				System.out.println("Conversion rate :" +fsh3.getConversionRate());
				System.out.println();
		    	}
				
				
			}
			
		break;
		case 6:
//			LowestToHighestValue cn1 = new LowestToHighestValue();
//			Collections.sort(stocks, cn1);
//			Iterator it1 = stocks.iterator();
//			System.out.println();
			System.out.println("All stocks sorted by company name(A-Z)");
//			while(it1.hasNext()) {
//				Object obj1111 = it1.next();
//				 if(obj1111 instanceof StockHolding )
//				    {
//				    	StockHolding sh=(StockHolding)obj1111;
//				
//						System.out.println("--Stock Info--");
//						System.out.println("Purchase Price  : "+ "$"+ sh.getPurchaseSharePrice());
//						System.out.println("Current Price   : "+ "$"+ sh.getCurrentSharePrice());
//						System.out.println("Number of Shares: "+ sh.getNumberOfShares());
//						System.out.println("Company Name    : "+ sh.getCompanyName());
//						System.out.println();
//				    }
//			     
//				 else if(obj1111 instanceof ForeignStockHolding)
//		    		{
//		    	
//		    	ForeignStockHolding fsh5=(ForeignStockHolding)obj1111;
//		    	System.out.println("--Stock Info--");
//				System.out.println("Purchase Price  : "+ "$"+ fsh5.getPurchaseSharePrice());
//				System.out.println("Current Price   : "+ "$"+ fsh5.getCurrentSharePrice());
//				System.out.println("Number of Shares: "+ fsh5.getNumberOfShares());
//				System.out.println("Company Name    : "+ fsh5.getCompanyName());
//				System.out.println("Conversion rate :" +fsh5.getConversionRate());
//				System.out.println();
//		    	}
//				
//				
//			}
//			
//		
			  Object obj1111= stocks.get(3);
			    if(obj1111 instanceof StockHolding )
			    {
			    	StockHolding sh=(StockHolding)obj1111;
			    	//System.out.println("Stock Number    : "+ (i+1));
					System.out.println("--Stock Info--");
					System.out.println("Purchase Price  : "+ "$"+ sh.getPurchaseSharePrice());
					System.out.println("Current Price   : "+ "$"+ sh.getCurrentSharePrice());
					System.out.println("Number of Shares: "+ sh.getNumberOfShares());
					System.out.println("Company Name    : "+ sh.getCompanyName());
					System.out.println();
			    }
			    else if(obj1111 instanceof ForeignStockHolding)
			    		{
			    	
			    	ForeignStockHolding fsh=(ForeignStockHolding)obj1111;
			    	//System.out.println("Stock Number    : "+ (i+1));
					System.out.println("--Stock Info--");
					System.out.println("Purchase Price  : "+ "$"+ fsh.getPurchaseSharePrice());
					System.out.println("Current Price   : "+ "$"+ fsh.getCurrentSharePrice());
					System.out.println("Number of Shares: "+ fsh.getNumberOfShares());
					System.out.println("Company Name    : "+ fsh.getCompanyName());
					System.out.println("Conversion rate :" +fsh.getConversionRate());
					System.out.println();
			    	
			    	
			    		}

				
			
			break;
		case 7:
			
			System.out.println("APLLICATION COMPLETED");
			System.exit(0);
			break;
		
			
}
		System.out.println("Do you want to continue (yes/no)  ");
		String forkeeprunning  = scanner.next();
	    
		}			
		
		
}
}
