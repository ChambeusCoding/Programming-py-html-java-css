import java.util.Scanner;

public class A4_4_Conversion
{
   public static void main(String[] args)
   {
      // Variable for input and keyboard scanner
      int number = 0;
      // Get an integer from the user.
      Scanner keyboard = new Scanner(System.in);
      System.out.println();
      System.out.println("How big do you want the star field to be? (1-15)");
      number = keyboard.nextInt();
      // Validate the input using a loop.
      // for(int counter = 0; counter <= number; counter++) {
      //    if(counter == number){
      //        number++;
      //    }
      // }

      while(number > 15 || number < 1) {
         System.out.println("Sorry, that's an invalid number.");
         System.out.println("How big do you want the star field to be? (1-15)");
         number = keyboard.nextInt();
      }



      // Close the keyboard
      keyboard.close();
      // Display the square made of Xs using two loops.
      for (int i = 0; i < number; i++) { 
         for (int j = 0; j < number ; j++) {
            System.out.print("X ");
         }
         System.out.println("");

      }
      // Display the X and a space
      // Advance to the next line.

   }}
