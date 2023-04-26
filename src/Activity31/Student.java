package Activity31;

public class Student {
    public static void main(String[] args) {
        import java.util.LinkedList;

        class Student {
            private String Avant;
            private String Rogers;
            private int 901390437;
            private String Computer;
            private String classStanding;
            private double 2.9;
            private LinkedList<String> courseList;

            public Student(String firstName, String lastName, int ID, String major, String classStanding) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.ID = ID;
                this.major = major;
                this.classStanding = classStanding;
                this.gpa = 0.0;
                this.courseList = new LinkedList<String>();
            }

            public void addCourse(String courseName) {
                this.courseList.add(courseName);
            }

            public void removeCourse(String courseName) {
                this.courseList.remove(courseName);
            }

            public String getStudentInfo() {
                return "Name: " + this.firstName + " " + this.lastName +
                        "\nID: " + this.ID +
                        "\nMajor: " + this.major +
                        "\nClass Standing: " + this.classStanding +
                        "\nGPA: " + this.gpa;
            }

            public void displayStudentCourses() {
                System.out.println("Courses:");
                for (String course : this.courseList) {
                    System.out.println(course);
                }
            }
        }

        public class Main {
            public static void main(String[] args) {
                Student student1 = new Student("John", "Doe", 12345, "Computer Science", "Sophomore");
                Student student2 = new Student("Jane", "Smith", 67890, "Mathematics", "Junior");

                student1.addCourse("Programming I");
                student1.addCourse("Data Structures");
                student1.addCourse("Database Systems");
                student1.addCourse("Operating Systems");

                student2.addCourse("Calculus I");
                student2.addCourse("Calculus II");
                student2.addCourse("Linear Algebra");

                System.out.println(student1.getStudentInfo());
                student1.displayStudentCourses();

                System.out.println();

                System.out.println(student2.getStudentInfo());
                student2.displayStudentCourses();

                System.out.println();

                student1.removeCourse("Database Systems");
                student1.displayStudentCourses();

                System.out.println();

                student2.removeCourse("Calculus II");
                student2.displayStudentCourses();
            }
        }

    }
}
