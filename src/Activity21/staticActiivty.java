package Activity21;

public class staticActiivty {
    public static void main(String[] args) {
        public class Person {
            private String name;
            private int age;
            private boolean isStudent;
            private static int numPersons = 0;

            public Person(String name, int age, boolean isStudent) {
                this.name = name;
                this.age = age;
                this.isStudent = isStudent;
                numPersons++;
            }

            public static int getNumPersons() {
                return numPersons;
            }
        }

        public class Main {
            public static void main(String[] args) {
                Person person1 = new Person("Alice", 25, true);
                Person person2 = new Person("Bob", 30, false);

                System.out.println("Number of persons created: " + Person.getNumPersons());
                System.out.println("Person 1 is a student: " + person1.isStudent);
                System.out.println("Person 2 is a student: " + person2.isStudent);
            }
        }

    }
}
