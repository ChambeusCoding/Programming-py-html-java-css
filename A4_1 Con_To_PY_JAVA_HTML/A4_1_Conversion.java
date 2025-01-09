import java.util.Scanner;

public class A4_1_Conversion {

    public static void main(String[] args) {

        // Variables for current speed, total speed, max seconds, and current seconds.
        int cspeed = 1;
        int tspeed = 1;
        int msec = 1;
        int csec = 1;
        double speed = .1;
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Get the maximum number of seconds.
        System.out.println("How many seconds is the burn?");
        msec = keyboard.nextInt();
        // Validate the input.
        while (msec < 1) {
            System.out.println("The number of seconds must be at least 1.");
            msec = keyboard.nextInt();
        // System.out.println(msec);
        // msec++;
        }
            // Check to see if the input is larger than 0.
              // If it is not, tell the user to enter another number.
              // Otherwise, accept the input.
        // Close the keyboard
        keyboard.close();
        // Initialize the seconds counter to 1.
        int seconds = 1;
        // Initialize the speed accumulator for the first second of the burn (100m/s).
        int speedaccumulator = 100; // m/s
        // Initialize the total speed accumulator.
        // for (int speed = 0; tspeed <=1; tspeed++) {
        // System.out.println("Seconds " + msec + " Total Speed " + speedAccumulator + "m/s.");
        // Display the report header.
        System.out.println
        ("| Seconds | Speed |\n" +
        "|-----------------|");

        for(int counter = 0; counter < msec; counter++) {
            System.out.println(counter + "\t\t" + speed);
            speed *= 2;  
        }

            // Display the seconds number and speed of the rocket.
        System.out.println("Final speed: \t" + tspeed + "km/s``\n");    
        // Display the final speed.
        //System.out.println("Final speed: \t" + tspeed + "km/s``\n");
        // Close the program
        System.exit(1);
    }
    }
