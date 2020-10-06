import java.util.Comparator;

public class SortByCompanyNameAscending implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof StockHolding && o2 instanceof StockHolding ) {
			return (((StockHolding)o1).getCompanyName()).compareTo(((StockHolding)o2).getCompanyName());
			
		}
		else if(o1 instanceof ForeignStockHolding && o2 instanceof ForeignStockHolding ) {
			return (((StockHolding)o1).getCompanyName()).compareTo(((StockHolding)o2).getCompanyName());
			
		}
		else if(o1 instanceof ForeignStockHolding && o2 instanceof StockHolding ) {
			return (((StockHolding)o1).getCompanyName()).compareTo(((StockHolding)o2).getCompanyName());
			
		}
		else {
			return (((StockHolding)o1).getCompanyName()).compareTo(((StockHolding)o2).getCompanyName());
		}
	}

}