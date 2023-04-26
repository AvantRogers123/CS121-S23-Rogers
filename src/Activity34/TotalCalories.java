package Activity34;

public class TotalCalories {
    public static void main(String[] args) {
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

        public class TotalCalories {
            public static int calculateTotalCalories(int caloriesPerDay, String startDateStr, String endDateStr) throws ParseException {
                // Convert the start and end dates from String to Date objects
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                Date startDate = dateFormat.parse(startDateStr);
                Date endDate = dateFormat.parse(endDateStr);

                // Calculate the number of days on the diet
                long diffInMillies = Math.abs(endDate.getTime() - startDate.getTime());
                long diffInDays = diffInMillies / (24 * 60 * 60 * 1000);
                int numDays = (int) diffInDays + 1;

                // Calculate the total calories consumed over the days of the diet
                int totalCalories = numDays * caloriesPerDay;
                return totalCalories;
            }
        }

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Ask the user to enter the amount of calories allowed per day by a diet
                System.out.print("Enter the amount of calories allowed per day by a diet: ");
                int caloriesPerDay = scanner.nextInt();

                // Ask the user what date (as mm/dd/yyyy) the diet will start
                System.out.print("Enter the start date of the diet (mm/dd/yyyy): ");
                String startDateStr = scanner.next();

                // Ask the user what date (as mm/dd/yyyy) the diet will end
                System.out.print("Enter the end date of the diet (mm/dd/yyyy): ");
                String endDateStr = scanner.next();

                try {
                    // Call the method in the TotalCalories class to get the total calories consumed during the diet time period
                    int totalCalories = TotalCalories.calculateTotalCalories(caloriesPerDay, startDateStr, endDateStr);

                    // Print the result
                    System.out.println("The total calories consumed during the diet time period is " + totalCalories);
                } catch (ParseException e) {
                    System.out.println("Invalid date format.");
                }

                scanner.close();
            }
        }

    }

}
