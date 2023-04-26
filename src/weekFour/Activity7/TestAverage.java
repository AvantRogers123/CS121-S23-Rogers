package weekFour.Activity7;

public class TestAverage{
    public static void main(String[] args) {
        import java.util.Scanner;

        public class TestAverage {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("How many students are there? ");
                int numStudents = scanner.nextInt();
                System.out.print("How many test scores are there per student? ");
                int numScores = scanner.nextInt();

                for (int i = 1; i <= numStudents; i++) {
                    System.out.println("Student #" + i);
                    double sum = 0;
                    for (int j = 1; j <= numScores; j++) {
                        System.out.print("Enter test score #" + j + ": ");
                        double score = scanner.nextDouble();
                        sum += score;
                    }
                    double average = sum / numScores;
                    System.out.println("Average test score for student #" + i + ": " + average);
                }

                scanner.close();
            }
        }

    }
}
