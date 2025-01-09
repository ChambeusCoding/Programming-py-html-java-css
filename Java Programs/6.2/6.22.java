import java.util.Scanner;

public class LandingZone {

  public static void main(String[] args) {
    double radius; // The radius of a landing zone.

    // Create a Scanner object for keyboard input.
    Scanner kbd = new Scanner(System.in);

    // Get the radius of a landing zone.
    System.out.print("Enter the radius of the landing zone: ");
    radius = kbd.nextDouble();
    kbd.close();
    // Create a landing zone object.
    LZBuilder lz = new LZBuilder(radius);

    // Display geometric info about the circle.
    System.out.printf("The landing zone's area is %,.2f\n",
        lz.getArea());
    System.out.printf("The landing zone's diameter is %,.2f\n",
        lz.getDiameter());
    System.out.printf("The landing zone's circumference is %,.2f\n",
        lz.getCircumference());
  }
}
