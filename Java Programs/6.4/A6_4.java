import java.util.Scanner;

public class A6_4 {
    public static void main(String[] args) {
        // Display "Welcome to the Cargo Management System!"
        System.out.println("Welcome to the Cargo Management System!");

        // Ask the user to "Enter cargo name: " and get the input as a string.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cargo name: ");
        String cargoName = scanner.nextLine();

        // Ask the user to "Enter cargo weight (in tons): " and get the input as a double.
        System.out.print("Enter cargo weight (in tons): ");
        double cargoWeight = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        // Ask the user to "Enter cargo destination planet or moon: " and get the input as a string.
        System.out.print("Enter cargo destination planet or moon: ");
        String cargoDestination = scanner.nextLine();

        // Create a new SpaceCargo object with the provided details named cargo.
        A6_42 cargo = new A6_42(cargoName, cargoWeight, cargoDestination);

        // Create an integer to hold the user's choice.
        int choice;

        // Use a do-while loop to display the options menu as follows until the user selects 3:
        do {
            System.out.println("\nMenu:");
            System.out.println("[1] Calculate Shipping Cost");
            System.out.println("[2] Display Cargo Details");
            System.out.println("[3] Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Based on the user's input, do the following:
            switch (choice) {
                case 1:
                    // Use calculateShippingCost for cargo to get the shippingCost as a double.
                    double A6_4 = cargo.calculateShippingCost();
                    // Display "Shipping Cost: $ [shippingCost]"
                    System.out.printf("Shipping Cost: $%,.2f\n", shippingCost);
                    break;

                case 2:
                    // Use the details method for cargo to display the cargo's details.
                    System.out.println(cargo.details());
                    break;

                case 3:
                    // Display "Thank you for using the Cargo Management System!"
                    System.out.println("Thank you for using the Cargo Management System!");
                    break;

                default:
                    // Display "Invalid choice. Please try again."
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        // Close the scanner
        scanner.close();
    }
}
