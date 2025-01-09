import java.io.*;
import java.util.Scanner;

public class A4_3_Conversion {

    public static void main(String[] args) throws FileNotFoundException, java.io.IOException {
        // Variables and keyboard scanner.
        String filePath1 = "astronaut1.txt";
        int letterCount;
        String letterCounting;
        String Astroname ="";
        char letter;
        int number = 0;
        
        // Get the file name from the user.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the name of the file.");
        filePath1 = keyboard.nextLine().toUpperCase();
        System.out.println("Enter a letter that you want counted.");
        letterCounting = keyboard.nextLine().toUpperCase();
        // Close the keyboard 
        keyboard.close();
        // Make sure the letter is uppercase.
        // Retrieve the letter as a character
        letter = letterCounting.charAt(0);
        // Open the file. We suggest FileReader and BufferedReader.
        // Read the first line from the file.
        try (BufferedReader br = new BufferedReader(new FileReader(filePath1))) {
        Astroname = br.readLine();
        }
    
        System.out.println("The letter " + letter + " appears " + number + " times in that file.");

        // Process the entire file using a loop to check each line.
        for(int counter = 0; counter <= Astroname.length(); counter++) {
            if(Astroname.toUpperCase().charAt(counter) == letter){
                number++;
        }
        // Close the file.       
        // Format and display the count.
        System.out.println( "The letter " + letter + " appears " + number + " times in that file.");
        System.exit(2);
    }}}


