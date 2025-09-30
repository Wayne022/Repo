import java.util.Scanner;

public class patientDriverApp {
    public static void main(String[] args) {
        

        // Get patient info from user
        Scanner keyboard = new Scanner(System.in);

     // Get patient info from user
     System.out.print("Enter first name: ");
     String fn = keyboard.nextLine();

     System.out.print("Enter middle name: ");
     String mn = keyboard.nextLine();

     System.out.print("Enter last name: ");
     String ln = keyboard.nextLine();

     System.out.print("Enter street address: ");
     String addr = keyboard.nextLine();

     System.out.print("Enter city: ");
     String city = keyboard.nextLine();

     System.out.print("Enter state: ");
     String state = keyboard.nextLine();

     System.out.print("Enter ZIP code: ");
     String zip = keyboard.nextLine();

     System.out.print("Enter phone number: ");
     String phone = keyboard.nextLine();

     System.out.print("Enter emergency contact name: ");
     String eName = keyboard.nextLine();

     System.out.print("Enter emergency contact phone: ");
     String ePhone = keyboard.nextLine();

     keyboard.close();


        
        // Create Patient object
        Patient patient = new Patient(fn, mn, ln, addr, city, state, zip, phone, eName, ePhone);

        // Create 3 procedures
        procedures p1 = new procedures("X-Ray", "06/01/2025", "Dr. Smith", 250.0);
        procedures p2 = new procedures("Blood Test", "06/02/2025");
        p2.setPractitioner("Nurse Lee");
        p2.setCharge(125.0);
        procedures p3 = new procedures();
        p3.setName("MRI Scan");
        p3.setDate("06/03/2025");
        p3.setPractitioner("Dr. Adams");
        p3.setCharge(1000.0);

        // Display results
        displayPatient(patient);
        System.out.println("\nProcedures:");
        displayProcedure(p1);
        displayProcedure(p2);
        displayProcedure(p3);

        double total = calculateTotalCharges(p1, p2, p3);
        System.out.printf("\nTotal Charges: $%,.2f\n", total);
    }

    // Method to display patient info
    public static void displayPatient(Patient p) {
        System.out.println("\nPatient Info:");
        System.out.println(p.toString());
    }

    // Method to display procedure info
    public static void displayProcedure(procedures p) {
        System.out.println(p.toString());
    }

    // Method to calculate total charges
    public static double calculateTotalCharges(procedures p1, procedures p2, procedures p3) {
        return p1.getCharge() + p2.getCharge() + p3.getCharge();
    }
}