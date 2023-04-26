package Activity13;

public class PackagesDemo {  Private instance variables
    private String occupation;
    private double salary;
    private boolean employed;

    // Constructor
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    // Private method
    private void setSalary(double salary) {
        this.salary = salary;
    }

    // Protected method
    protected void setEmployed(boolean employed) {
        this.employed = employed;
    }

    // Package-private method
    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
        System.out.println("Salary: " + salary);
        System.out.println("Employed: " + employed);
    }

}
