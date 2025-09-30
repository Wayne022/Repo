public class procedures {
	// Fields for procedure info
    private String name;
    private String date;
    private String practitioner;
    private double charge;

    // No-arg constructor
    public procedures() {
        name = "";
        date = "";
        practitioner = "";
        charge = 0.0;
    }

    // Constructor with name and date
    public procedures(String name, String date) {
        this.name = name;
        this.date = date;
    }

    // Constructor with all info
    public procedures(String name, String date, String practitioner, double charge) {
        this.name = name;
        this.date = date;
        this.practitioner = practitioner;
        this.charge = charge;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getPractitioner() { return practitioner; }
    public void setPractitioner(String practitioner) { this.practitioner = practitioner; }

    public double getCharge() { return charge; }
    public void setCharge(double charge) { this.charge = charge; }

    // toString method
    public String toString() {
        return name + "\t" + date + "\t" + practitioner + "\t$" + String.format("%.2f", charge);
    }
}