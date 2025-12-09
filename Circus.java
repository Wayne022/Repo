package circus;
import java.util.ArrayList;
import java.util.List;


public class Circus {

	 private List<Animal> animals;
	    private List<Person> persons;
	    private List<Building> buildings;
	    private List<Ticket> tickets;

	    public Circus() {
	        animals = new ArrayList<>();
	        persons = new ArrayList<>();
	        buildings = new ArrayList<>();
	        tickets = new ArrayList<>();
	    }



// ---------------------------------------
// Add building
// ---------------------------------------
public void addBuilding(Building building) {
    buildings.add(building);
    System.out.println("Building added: " + building);
}

// Display buildings
public void displayAllBuildings() {
    if (buildings.isEmpty()) {
        System.out.println("No buildings found.");
        return;
    }
    for (Building b : buildings) {
        System.out.println(b);
    }
}

// ---------------------------------------
// Add person
// ---------------------------------------
public void addPerson(Person p) {
    persons.add(p);
    System.out.println("Person added: " + p);
}

// Display persons
public void displayAllPersons() {
    if (persons.isEmpty()) {
        System.out.println("No persons found.");
        return;
    }
    for (Person p : persons) {
        System.out.println(p);
    }
}

// ---------------------------------------
// Add animal
// ---------------------------------------
public void addAnimal(Animal a) {
    animals.add(a);
    System.out.println("Animal added: " + a);
}

// Display animals
public void displayAllAnimals() {
    if (animals.isEmpty()) {
        System.out.println("No animals found.");
        return;
    }
    for (Animal a : animals) {
        System.out.println(a);
    }
}

// ---------------------------------------
// Selection sort animals by age
// ---------------------------------------
public void sortAnimalsByAge() {
    for (int i = 0; i < animals.size() - 1; i++) {
        int minIndex = i;

        for (int j = i + 1; j < animals.size(); j++) {
            if (animals.get(j).getAge() < animals.get(minIndex).getAge()) {
                minIndex = j;
            }
        }

        // Swap
        Animal temp = animals.get(i);
        animals.set(i, animals.get(minIndex));
        animals.set(minIndex, temp);
    }
}

// ---------------------------------------
// Selection sort animals by name
// ---------------------------------------
public void sortAnimalsByName() {
    for (int i = 0; i < animals.size() - 1; i++) {
        int minIndex = i;

        for (int j = i + 1; j < animals.size(); j++) {
            String name1 = animals.get(j).getName().toLowerCase();
            String name2 = animals.get(minIndex).getName().toLowerCase();

            if (name1.compareTo(name2) < 0) {
                minIndex = j;
            }
        }

        // Swap
        Animal temp = animals.get(i);
        animals.set(i, animals.get(minIndex));
        animals.set(minIndex, temp);
    }
}

// ---------------------------------------
// Search for an animal by name
// ---------------------------------------
public void searchAnimalByName(String name) {
    boolean found = false;

    for (Animal a : animals) {
        if (a.getName().equalsIgnoreCase(name)) {
            System.out.println("Animal found: " + a);
            found = true;
        }
    }

    if (!found) {
        System.out.println("No animal found with name: " + name);
    }
}

// ---------------------------------------
// Add ticket
// ---------------------------------------
public void addTicket(Ticket ticket) {
    tickets.add(ticket);
}

	    // Generate ticket
	    public Ticket generateTicket(String daysOfWeek, double basePrice, int age) {
	        Ticket ticket = new Ticket(daysOfWeek, basePrice, age);  // Pass dayOfWeek, basePrice, age to Ticket constructor
	        addTicket(ticket);
	        return ticket;
	    }
	
	
}
