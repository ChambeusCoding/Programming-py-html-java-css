import java.util.Scanner;

public class A5_3_Conversion {

    /*
     * The menu method displays the menu with four options
     * and is used to select which other method should be
     * called next or if the program should close.
     */
    public static void showMenu() {
        System.out.println("Select Option");
        System.out.println("1. Convert to Kilometers");
        System.out.println("2. Convert to Inches");
        System.out.println("3. convert to Feet");
        System.out.println("4. Exit Program");
    }

    /*
     * The calcKilometers method returns the kilometers that
     * are equivalent to a specified number of meters entered.
     */
    public static double calcKilometers(double meters) {
        return meters * 0.001;
    }

    /*
     * The calcInches method returns the inches that
     * are equivalent to a specified number of meters.
     */
    public static double calcInches(double meters) {
        return meters * 39.37;
    }

    /*
     * The calcFeet method returns the feet that
     * are equivalent to a specified number of meters.
     */
    public static double calcFeet(double meters) {
        return meters * 3.281;
    }

    public static void main(String[] args) {
        // Variables and scanner
        double inches;
        double feet;
        double meters = 500;
        double kilometers;
        double option1;
        double option2;
        double option3;
        double option4;
        int number = 0;
        // Get a distance from the user.
        Scanner kbd = new Scanner(System.in);

        // Display the menu and process the user's selection until 4 is selected.
        // Display the menu.

        // Get the user's selection.
        while (number > 4 || number < 1) {
        System.out.println("Sorry, that's an invalid number.");
        System.out.println("Select an Option");
        number = kbd.nextInt();
        }

        // Get the meters from the user and set the variable
        //
        //

        while (number != 4) {
            showMenu();
            number = kbd.nextInt();

            switch (number) {
                case 1:
                    // Call the method to convert to kilometers
                    kilometers = calcKilometers(meters);
                    System.out.println("Kilometers: " + kilometers);
                case 2:
                    // Convert to inches
                    inches = calcInches(meters);
                    System.out.println("Inches: " + inches);
                case 3:
                    feet = calcFeet(meters);
                    System.out.println("Feet: " + feet);
            }

            // Print out the menu
            // Get the choice
        }

        System.exit(0);

        // Validate the user's selection.

        // If the selection is invaldi, ask them again.

        // Process the user's selection. A switch is probably easiest.
        // switch (choice) {
        // case 1:
        // option1();
        // break;
        // case 2:
        // option2();
        // break;
        // case 3:
        // option3();
        // break;
        // case 4:
        // System.out.println("Exiting the program...");
        // break;
        // default:
        // System.out.println("Invalid choice. Please try again.");
        // }

        // scanner.close();

    }
}
