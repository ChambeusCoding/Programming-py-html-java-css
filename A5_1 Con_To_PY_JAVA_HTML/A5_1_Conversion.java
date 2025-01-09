import java.util.Scanner;

public class A5_1_Conversion {

    public static void main(String[] args) {
        // Make your variables and scanner.
    double length;
    double width;
    double area;
        // Get the landing zone's length from the user using a method.
    Scanner kbd = new Scanner(System.in);
        // Pass the keyboard into this method.
        // Get the landing zone's width from the user using a method.
        width = getWidth(kbd);
        length = getLength(kbd);
        area = getLength(kbd);
        // Pass the keyboard into this method.
        // Close the keyboard
        kbd.close();
        // Get the landing zone's area and store it in area using a method.
        // Display the landing zone's data using a method.
    displayData(length, width, area);
        
    }

    // The getLength method prompts the user for the landing zone's length.
    //  @return The value entered by the user.
    //  */
    public static double getLength(Scanner kbd) {
        System.out.println("Enter the landing zone's length in feet:");
        return kbd.nextInt();
    }
    /**
     The getWidth method prompts the user for the landing zone's width.
     @return The value entered by the user.
     */
    public static double getWidth(Scanner kbd) {
        System.out.println("Enter the landing zone's width in feet:");
        return kbd.nextInt();
    }


    /**
     The getArea method calculates the landing zone's area.
     @param length The landing zone's length.
     @param width The landing zone's width.
     @return The area of the landing zone.
     */
    public static double getArea(double length, double width) {
        System.out.println("Enter the area of the landing zone in feet.");
        return length * width;
    }

    /**
     The displayData displays the landing zone's length, width, and area.
     @param length The landing zone's length.
     @param width The landing zone's width.
     @param area The landing zone's area.

     */

    public static void displayData(double length, double width, double area) {
        System.out.println("The Landing zone's dimensions are as follows:" +
                           "\nLength  = " + length +
                           "\nWidth = " + width +
                           "\nArea  = " + area);
    }
}
