package circus;

public class Ticket {

	 private double basePrice;
	    private String dayOfWeek;
	    private int age;

	    public Ticket(String dayOfWeek, double basePrice, int age) {
	        this.basePrice = basePrice;
	        this.age = age;
	        this.dayOfWeek = dayOfWeek.toLowerCase();
	    }

	    // Calculate ticket price based on day of week and age
	    public double calculatePrice() {
	        double price = basePrice;

	        // Weekday discount (Mon–Fri)
	        if (isWeekday(dayOfWeek)) {
	            price = price * 0.90;  // 10% off
	        }

	        // Customer type discount
	        switch (age) {
	            case 1: // Child
	                price = price * 0.90; // 10% off
	                break;
	            case 2: // Student
	                price = price * 0.90; // 10% off
	                break;
	            case 4: // Senior
	                price = price * 0.95; // 5% off
	                break;
	            case 3: // Adult
	            default:
	                // no discount
	                break;
	        }

	        return price;
	    }
	        
	    private boolean isWeekday(String day) {
	            return day.equals("monday") ||
	                   day.equals("tuesday") ||
	                   day.equals("wednesday") ||
	                   day.equals("thursday") ||
	                   day.equals("friday");
	    
	    
	    
	    
	    
	    
	    
	    
	    }	    // Display the ticket details
	    public void displayTicketDetails() {
	        System.out.printf("Ticket Details: [Age: %d, Day: %s, Price: $%.2f]%n",
	                          age, dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1), calculatePrice());
	    }

	    @Override
	    public String toString() {
	        return String.format("Ticket [Day: %s, Age: %d, Price: $%.2f]",
	                             dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1), 
	                             age, calculatePrice());
	    }
	}

	



