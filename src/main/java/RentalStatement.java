import java.util.ArrayList;
import java.util.Collection;

public class RentalStatement {

	private Collection<Rental> myCollection = new ArrayList<Rental>();
	
	public RentalStatement() {

	}
	
	public void add(Rental toAdd) {
		 myCollection.add(toAdd);
	}
	
	public void print() {
		System.out.println("Your Rental Statement:");
		for(Rental a: myCollection) {
			System.out.println("" + a.getPriceCode() + " "
					+ "" + a.getTitle() + " " + a.calculateFees()  + "\n");
		}
	}

}
