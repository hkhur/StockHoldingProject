import java.util.Comparator;

public class LowestToHighestValue implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof StockHolding && o2 instanceof StockHolding ) {
			return (((StockHolding)o1).getCurrentSharePrice()).compareTo(((StockHolding)o2).getCurrentSharePrice());
			
		}
		else if(o1 instanceof ForeignStockHolding && o2 instanceof ForeignStockHolding ) {
			return (((StockHolding)o1).getCurrentSharePrice()).compareTo(((StockHolding)o2).getCurrentSharePrice());
			
		}
		else if(o1 instanceof ForeignStockHolding && o2 instanceof StockHolding ) {
			return (((StockHolding)o1).getCurrentSharePrice()).compareTo(((StockHolding)o2).getCurrentSharePrice());
			
		}
		else {
			return (((StockHolding)o1).getCurrentSharePrice()).compareTo(((StockHolding)o2).getCurrentSharePrice());
		}
	}

}
