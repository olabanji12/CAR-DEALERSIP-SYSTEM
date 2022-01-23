
public class Vehicle {
	
	private String Make;
	private String Model;
	private int Year;
	
	// ^^^ creates all necessary variables
	
	
	
	public Vehicle (String Make, String Model, int Year){
		this.Make = Make;
		this.Model = Model;
		this.Year = Year;
	}
	
	// ^^^ creates a parameterized constructor to initialize value to the 
	// ^^^ defined variables


	private String getMake() {
		return Make;
	}

	private void setMake(String make) {
		Make = make;
	}

	private String getModel() {
		return Model;
	}

	private void setModel(String model) {
		Model = model;
	}

	private int getYear() {
		return Year;
	}

	private void setYear(int year) {		
		Year = year;
	}
	
	
	// ^^^ creates getters and setters for private variables so they can be accessible ^^^
	
	
	public void displayCars() {
		System.out.println("Make: " + getMake());
		 System.out.println();
		 System.out.println("Model: " + getModel());
		 System.out.println();
		 System.out.println("Year: " + getYear());	
		 System.out.println();
		 
		 
		//  ^^^ function to display all inputed vehicle info 
	}

}
