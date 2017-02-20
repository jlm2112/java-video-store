import java.math.BigDecimal;

public class NewRelease extends Movie {

	public NewRelease(String title) {
		super(title, "3.00");
	}

	public String getPriceCode() {
		return "New Release";
	}
	
	public BigDecimal calculateFees(int days){
		BigDecimal rentalDays = new BigDecimal(days);
		BigDecimal amount = new BigDecimal("3.00").multiply(rentalDays);
		return amount;
		
	}
}	
