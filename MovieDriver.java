package lab1;


import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	Scanner keyboard= new Scanner(System.in);
	 
	
	//this string starts the loop
	String choice= "yes"; 
	
	while( choice.equalsIgnoreCase("yes")) {
	
	//create new movie object
	Movie myMovie= new Movie();
	
	
	
	//ask user for movie title
	System.out.print("Enter a movie title: ");
	String title= keyboard.nextLine();
	myMovie.setTitle(title);
	
	
	
	//ask user for movie rating 
	System.out.print("What would you rate the Movie: ");
	String rating=keyboard.nextLine();
	myMovie.setRating(rating);

	
	//ask user number of tickets sold
	System.out.print("Enter # of tickets sold: ");
	int soldTickets= keyboard.nextInt();
	myMovie.setSoldTickets(soldTickets);
	
	
	//print movie info
	System.out.print("\nMovie Info: ");
	System.out.print(myMovie.toString());
	
	keyboard.nextLine();
	
	System.out.println("\nDo you want to enter another movie? (yes/no): ");
	choice = keyboard.nextLine();
	
	
	}
	
	System.out.println("Goodbye!");
	keyboard.close();
	
	
	}
	
}
