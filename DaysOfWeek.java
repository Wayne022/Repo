package circus;

public enum DaysOfWeek {

	 MONDAY(0.10),
	    TUESDAY(0.10),
	    WEDNESDAY(0.10),
	    THURSDAY(0.10),
	    FRIDAY(0.10),
	    SATURDAY(0.00),
	    SUNDAY(0.00);
	    
	
	private final double discount; // instance variable

	   
	
	//Constructor for the DayOfWeek enum
	    DaysOfWeek(double discount) {
	        this.discount = discount;
	    }

	    //Public method provides access to the discount value associated with a specific enum constant.
	    public double getDiscount() {
	        return discount;
	    }
	}

	

