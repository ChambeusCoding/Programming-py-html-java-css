public class SpaceCraftBuilder {
    public static void main(String[] args) {
    // Variables:
    String craftName; // craftName double
    int crewCapacity; // crewCapacity
    int currentCrew; // fuelCapacity
    double fuelCapacity; // currentCrew
    double currentFuel;// currentFuel
    }
    // Constructor
    public SpaceCraftBuilder(String craftName, int crewCapacity, int fuelCapacity) {
        this.craftName = craftName;
        this.crewCapacity = crewCapacity;
        this.fuelCapacity = fuelCapacity;
        this.currentCrew = 0;
        this.currentFuel = 0;
    }

    // Create a method to board crew members onto the spacecraft named boardCrew
    // that takes a number of crew members.
    public boolean boardCrew(int crewCapacity) {
        if (crewCapacity < 0) {
        }
        if (currentCrew + crewCapacity <= crewCapacity) {
            currentCrew += crewCapacity;
            return true;
        } else {
            return false;
        }
    }
    // Create a method to refuel the spacecraft named refuel that takes an amount of fuel.
    public void refuel(double fuelCapacity) {
        Math.min(currentFuel + amount, fuelCapacity);
    }
    // Check if there are crew members on board and enough fuel for the journey
    // If there are, display, "Spacecraft '[craftName]' successfully launched to
    // [destination]!"
    public boolean launchSpacecraft(double fuelCapacity) {
        if (fuelCapacity < 0) {
        }
        if (currentFuel + fuelCapacity <= fuelCapacity) {
            currentFuel += fuelCapacity;
            return true;
        } else {
            return false;
        }
        if (true) {
            System.out.println("\"Spacecraft " + craftName + " successfully launched to " + destination);
        }
        if (false) {
            System.out.println("Not Compatable");
        } else {
            System.out.println("Launch failed. Insufficent crew or fuel.");
        }
    }
    // If there weren't enough crew or fuel (else)
    // Display: "Launch failed. Insufficient crew or fuel."

    // Create getters for current crew and current fuel called ...
    // getCurrentCrew and
    // getCurrentFuel
    public int getcurrentCrew() {
        return currentCrew;
    }
    public int getCurrentFuel() {
        return currentFuel;
    }
}

