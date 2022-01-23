
public class Car extends Vehicle {
													
		private int Doors;
		private int Price;
		
		
		// ^^^ creates all necessary variables ^^^
		


public Car (String Make, String Model, int Year, int Doors, int Price){
	
	super(Model, Make, Year);
	this.Doors = Doors;
	this.Price = Price;
	
	
	// ^^^ creates a parameterized constructor  to initialize value to the 
		// ^^^ defined variables
}

 

private int getDoors() {
	return Doors;
}

private void setDoors(int doors) {
	Doors = doors;
}

private int getPrice() {
	return Price;
}

private void setPrice(int price) {
	Price = price;
}



// ^^^^^ creates getters and setters for all private variables so they can be accessed ^^^^^ 


public void displayCars() {
	 super.displayCars();
	 System.out.println("Doors: " + getDoors());
	 System.out.println();
	 System.out.println("Price: $" + getPrice());
	 
	 // ^^^ a function that displays all inputed vehicle info
	 
 }



}
