import java.util.Scanner;

public class A5_4_Conversion {

    // Create a static method named currentSpeed that accepts target, rate, and
    // minutes that returns the current speed as a double.
    // Calculate and return the current speed.
    public static double calcCurrentSpeed(double targetS, double PercentIPM, int minutes) {
        double currentSpeed = targetS;
        currentSpeed = targetS / (Math.pow(1 + PercentIPM, minutes));
        Math.pow(targetS, currentSpeed);
        return currentSpeed;
    //   //  for (int i = 0; i < minutes; i++) {
    //         currentSpeed += currentSpeed * (PercentIPM / 100);
    //     }
    //     return currentSpeed;
    }

    public static void main(String[] args) {
        // Variables and scanner
        int minutes;
        double currentSpeed;
        double PercentIPM;
        double targetS;
        // Get the target speed as a double
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter target speed: ");
        targetS = kbd.nextDouble();
        // Get the rate of increase and convert it to decimal notation as a double.
        System.out.println("Rate of speed increase per minute: ");
        PercentIPM = kbd.nextDouble();
        // Get the number of minutes until the spacecraft reaches target speed as a double
        System.out.println("Minutes until target speed achieved: ");
        minutes = kbd.nextInt();
        // Close the keyboard
        kbd.close();
        // Call the currentSpeed method passing target, rate, and minutes.
        currentSpeed = calcCurrentSpeed(targetS, PercentIPM, minutes);
        // Display the result.
        System.out.println("Current Speed: " + currentSpeed);
    }

}
