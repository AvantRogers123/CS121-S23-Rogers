package Activity28;

public class StudentSet {
    public static void main(String[] args) {
        import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

        public class StudentSet {
            private HashSet<String> students;

            public StudentSet() {
                students = new HashSet<String>();
            }

            public void addStudents() {
                Scanner input = new Scanner(System.in);
                String name;
                System.out.println("Enter student names (enter 'q' to quit):");
                while (true) {
                    name = input.nextLine();
                    if (name.equals("q")) {
                        break;
                    }
                    students.add(name);
                }
            }

            public void displayStudents() {
                Iterator<String> iterator = students.iterator();
                System.out.println("\nList of Students:");
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        }

    }
}
