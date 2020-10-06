import java.util.Comparator;

public class GetMinimumValue implements Comparator<StockHolding> {

	@Override
	public int compare(StockHolding o1, StockHolding o2) {
		
			return o1.getCurrentSharePrice().compareTo(o2.getCurrentSharePrice());
			
		}
//		else if(o1 instanceof ForeignStockHolding && o2 instanceof ForeignStockHolding ) {
//			return (((StockHolding)o1).getCurrentSharePrice()).compareTo(((StockHolding)o2).getCurrentSharePrice());
//			
//		}
//		else if(o1 instanceof ForeignStockHolding && o2 instanceof StockHolding ) {
//			return (((StockHolding)o1).getCurrentSharePrice()).compareTo(((StockHolding)o2).getCurrentSharePrice());
//			
//		}
	
	}


