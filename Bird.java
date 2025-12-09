
package circus;
import java.util.Objects;

public class Bird implements Animal {

	
	//instance variables
    private String name;
    private int age;
    private String species;
    private String color;

    //constructor
    public Bird(String name, int age, String species, String color) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
    }



@Override
public void move() {
    System.out.println(name + " is flying in the air.");
}

@Override
public void makeSound() {
    System.out.println(name + " chirps!");
}

@Override
public String getName() {
    return name;
}

@Override
public int getAge() {
    return age;
}

@Override
public boolean equals(Object obj) {
    // Check for reference equality
    if (this == obj)
        return true;

    // Check for null or different class
    if (obj == null || getClass() != obj.getClass())
        return false;

    // Compare fields for logical equality
    Bird other = (Bird) obj;
    return age == other.age &&
           Objects.equals(name, other.name) &&
           Objects.equals(species, other.species) &&
           Objects.equals(color, other.color);
}

@Override
public String toString() {
    return String.format("Bird{name='%s', age=%d, species='%s', color='%s'}",
            name, age, species, color);
}
}


