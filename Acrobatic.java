package circus;

public class Acrobatic extends Person {

	
	 private String job;

	    public Acrobatic(String name, int age, int yearsWorked, String job) {
	        super(name, age, yearsWorked);
	        this.job=job;
	    }

	    public String getJob() {
	        return job;
	    }

	    @Override
	   
	    public String toString() {
	        return String.format("Clerk{name='%s', age=%d, yearsWorked=%d, job='%s'}",
	                getName(), getAge(), getYearsWorked(), job);      
	        
	      
	    }   
	
}
