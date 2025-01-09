import java.util.Scanner;
public class A4_2_Conversion {

    public static void main(String[] args) {
        // Create your variables and keyboard scanner.
        int letterCount;
        String letterCounting;
        String Astroname;
        char letter;
        int number = 0;
        // Get a name from the user.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the name of the astronaut.");
        // Get the uppercase equivalent of the name.
        Astroname = keyboard.nextLine().toUpperCase();
        // Get the letter to count.
        System.out.println("Please enter the letter you want counted.");
        letterCounting = keyboard.nextLine().toUpperCase();
        // Close the keyboard
        keyboard.close();
        // Make sure the letter is uppercase.
        // Retrieve the letter.
        letter = letterCounting.charAt(0);
        // Count the number of times the letter appears in the string using a loop.
        for(int counter = 0; counter < Astroname.length(); counter++) {
            if(Astroname.charAt(counter) == letter){
                number++;
            }
        }
        System.out.println(" The letter " + letter + " appears " + number + " time(s) in " + Astroname);

        System.exit(2);
        
    }
}
