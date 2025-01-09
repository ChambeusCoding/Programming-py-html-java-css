import java.util.Scanner;

public class A5_2_Conversion {

  /**
   * The calcAverage method calculates the average of five scores.
   * 
   * @param score1 The first score.
   * @param score2 The second score.
   * @param score3 The third score.
   * @param score4 The fourth score.
   * @param score5 The fifth score.
   * @return The average of the five scores.
   */
  public static double calcAverage(double score1, double score2, double score3, double score4, double score5) {
    return (score1 + score2 + score3 + score4 + score5) / 5;
}
  /**
   * The determineGrade method determines the grade
   * for a numeric score.
   * 
   * @param score The numeric score.
   * @return The grade.
   */

  public static String determineGrade(double score) {
    if (score >= 90) {
      return "A";
    } else if (score >= 80) {
      return "B";
    } else if (score >= 70) {
      return "C";
    } else if (score >= 60) {
      return "D";
    } else {
      return "F";
    }
  }
  // Determine and the grade based on score.

  public static void main(String[] args) {
        // Variables for scores and average.
      double score1 = 0;
      double score2 = 0;
      double score3 = 0;
      double score4 = 0;
      double score5 = 0;
      double average = 0;
      double number = 0;
      
        // Keyboard scanner
      Scanner kbd = new Scanner(System.in);
        // Get each of the scores
System.out.println("\":Enter the first score: \"");
score1 = kbd.nextDouble();
System.out.println("\":Enter the second score: \"");
score2 = kbd.nextDouble();
System.out.println("\":Enter the third score: \"");
score3 = kbd.nextDouble();
System.out.println("\":Enter the fourth score: \"");
score4 = kbd.nextDouble();
System.out.println("\":Enter the fifth score: \"");
score5 = kbd.nextDouble();
        // Get the average using the calcAverage method you created above
      average = calcAverage(score1, score2, score3, score4, score5);

        // Display the letter grades, the average, and an overall grade.
        System.out.println("Here are the grades and the average:");
        System.out.println("Score 1: " + determineGrade(score1));
        System.out.println("Score 2: " + determineGrade(score2));
        System.out.println("Score 3: " + determineGrade(score3));
        System.out.println("Score 4: " + determineGrade(score4));
        System.out.println("Score 5: " + determineGrade(score5));
        System.out.printf("Average score: %.2f\n", average);
        System.out.printf("Average Grade: %s\n",
                determineGrade(average));
    
        // What's the last thing you should always do in your main method?

    }

}
