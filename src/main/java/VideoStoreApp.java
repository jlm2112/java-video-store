

public class VideoStoreApp {

	public static void main(String[] args) {

//		RentalCalculator calculator = new RentalCalculator();
			Movie regular = new RegularMovie("WCCI");
//			Movie childrens = new ChildrensMovie("Up");
//			Movie newRelease = new NewRelease("Dr Strange");
//		
//		System.out.println("amount due for regular movie for 5 days = " + calculator.calculate(regular,5));


		RentalStatement ourStatement = new RentalStatement();
		Rental firstRental = new Rental(regular, 5);
		ourStatement.add(firstRental);
		ourStatement.print();
	 
		

		
	}

}
