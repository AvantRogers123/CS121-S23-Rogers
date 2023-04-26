package weekFour.Activity7;

public class nestedForLoopsActivity{
    public static void main(String[] args) { import java.util.Scanner;

        public class GuessingGame {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int number = (int) (Math.random() * 100) + 1; // generate a random number between 1 and 100
                int guess = 0;
                int numGuesses = 0;

                while (true) {
                    System.out.print("Guess a number between 1 and 100 (or enter q to quit): ");
                    String input = scanner.nextLine();

                    if (input.equalsIgnoreCase("q")) {
                        System.out.println("You quit. The number was " + number);
                        break;
                    } else {
                        try {
                            guess = Integer.parseInt(input);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a number between 1 and 100 or q to quit.");
                            continue;
                        }
                    }

                    numGuesses++;

                    if (guess < 1 || guess > 100) {
                        System.out.println("Your guess is out of range. Please enter a number between 1 and 100.");
                    } else if (guess < number) {
                        System.out.println("Your guess is too low. Try again.");
                    } else if (guess > number) {
                        System.out.println("Your guess is too high. Try again.");
                    } else {
                        System.out.println("You guessed correctly! It took you " + numGuesses + " guesses.");
                        break;
                    }
                }

                scanner.close();
            }
        }


    }

}




