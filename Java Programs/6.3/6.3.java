import java.util.Scanner;

public class SpaceCraft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Space Craft Management System!");
        System.out.print("Enter spacecraft name: ");
        String name = scanner.nextLine();
        System.out.print("Enter crew capacity: ");
        int crewCapacity = scanner.nextInt();
        System.out.print("Enter fuel capacity (in liters): ");
        double fuelCapacity = scanner.nextDouble();
        // Everything above this line is provided and correct. Do not change.
        // ^^^^^^^^^^

        // Create a new SpaceCraftBuilder object named craft and 
        // pass through the following variables: name, crewCapacity, fuelCapacity 
        // Replace this line with your working code for the previous two lines.
        SpaceCraftBuilder craft = new SpaceCraftBuilder(name, crewCapacity, fuelCapacity);


        // vvvvvvvvvv
        // Everything between this line and the next comment are provided and correct.
        // Do not change.
        System.out.println("Spacecraft '" + name + "' created successfully.\n");
        int choice;
        do {
            System.out.println("Available operations:");
            System.out.println("1. Board Crew");
            System.out.println("2. Refuel");
            System.out.println("3. Launch");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the number of crew members to board: ");
                    int crewCount = scanner.nextInt();
                    // Everything between this line and the previous comment are provided and correct.
                    // Do not change
                    // ^^^^^^^^^^

                    // Use the boardCrew method from SpaceCraftBuilder for the craft object to check whether
                    // or not there is enough space on the craft.
                    if (craft.boardCrew()) { // Part of this line is missing.

                        // If there is, display, "Crew boarded successfully. Current crew count: " followed
                        // by the getCurrentCrew method for your craft object.
                        // Replace this line with your working code for the previous two lines.

                    } else { // This line is correct

                        // Otherwise display, "Boarding failed. Insufficient capacity. Current crew count: "
                        // followed by the getCurrentCrew method for your craft object.
                        // Replace this line with your working code for the previous two lines.
                    
                    // vvvvvvvvvv
                    // Everything between this line and the next comment are provided and correct.
                    // Do not change
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount of fuel to refuel (in liters): ");
                    double fuelAmount = scanner.nextDouble();
                    // Everything between this line and the previous comment are provided and correct.
                    // Do not change
                    // ^^^^^^^^^^

                    // Use the refuel method from SpaceCraftBuilder for your craft object to add fuelAmount.
                    // Replace this line with your working code for the previous line.

                    // Display, "Spacecraft refueled. Current fuel level: " + [currentFuel] + " liters" where
                    // [currentFuel] is replaced by using the getCurrentFuel method for the craft object.
                    // Replace this line with your working code for the previous two lines.

                    // vvvvvvvvvv
                    // Everything between this line and the next comment are provided and correct.
                    // Do not change
                    break;
                case 3:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the destination: ");
                    String destination = scanner.nextLine();
                    // Everything between this line and the previous comment are provided and correct.
                    // Do not change
                    // ^^^^^^^^^^

                    // Use the launch method for your craft object and pass through the destination.
                    // Replace this line with your working code for the previous line.

                    // vvvvvvvvvv
                    // Everything below this line is provided and correct.
                    // Do not change
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 4);

        scanner.close();
        System.exit(0);
    }
}
