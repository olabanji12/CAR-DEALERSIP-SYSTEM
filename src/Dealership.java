import java.util.InputMismatchException;
import java.util.Scanner;
public class Dealership {

	public static void main(String[] args) {
		
		

		Car[] cars = new Car[2]; 
		
		// ^^^ creates an array of object
		Scanner userInput = new Scanner(System.in); 
		
		// ^^^ creates the scanner
		int input = 0;   
		
		// ^^^ creates variable to store user option


		do {
			
			try {
			
			System.out.println("Please choose an option below: ");
			System.out.println();
			System.out.println("0. Exit out of menu");
			System.out.println();
			System.out.println("1. Add Vehicle");  
			System.out.println();
			System.out.println("2. Display all Vehicles");
			System.out.println();
			input = userInput.nextInt();
			
			
			}
			catch(Exception e) {
				System.out.println("exception occured");
				
			}
			// ^^^ General exception handling implementation
			

			// ^^^ displays the menu to the user ^^^



			switch(input) {

			case 0:
				System.out.println("Thank you for using the Auto Dealership page.");
				break;


			case 1:  {
						for (int i =0; i<cars.length; i++) {
							
				
							
							System.out.println("Please enter the make of the car: ");
							String make= userInput.nextLine();
							userInput.nextLine();
							System.out.println();
							
							
							
		
							System.out.println("Please enter the model of the car: ");
							String model = userInput.nextLine();
							System.out.println();
							
							
							
							System.out.println("Please enter the year of the car: ");
							int year = userInput.nextInt();
							System.out.println();
							
							
							int doors =0;
							
							System.out.println("Please enter the number of doors for the car: ");
							doors = userInput.nextInt();
							System.out.println();
							
							
						
							int price=0;
							
							
							try {															// specific exception handling implementation
							System.out.println("Please enter the price of the car: ");
							price  = userInput.nextInt();
							userInput.nextLine();
							System.out.println();
							
							}
							catch(InputMismatchException e) {
								System.out.println("Input is invalid");
							}
							
							

							
							
							
		
							// ^^^ request user input for car info. loops twice to collect info for two cars
		
							cars[i] = new Car(make,model, year, doors, price);
							
							

							
		
							// ^^^ creates an instance of the array and passing the user input as the arguments 
		
									}
					
						
							break;
													}
			
			
			case 2: {
							for (int i =0; i<2; i++) {
								cars[i].displayCars();
								System.out.println();
							}
							// ^^^ displays info for the cars. loops twice to display info for the two cars. 
			
							break;

									}
					}
		
			

			
		}

		while (input != 0);

		// ^^^^^^  ALL OF THE CODE ABOVE THIS IS IN A LOOP UNTIL THE USER MENU DISPLAY INPUT IS 0. ^^^^^
		// ^^^^^^ THEN THE LOOP BREAKS AND PRINT  A SHORT STATEMENT ^^^^^



	}

}


 
