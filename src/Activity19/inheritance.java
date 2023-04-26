package Activity19;

public class inheritance {
    public static void main(String[] args) {
        package inheritance;

        public class UniversityMember {
            private String name;
            private int age;
            private String department;

            public UniversityMember(String name, int age, String department) {
                this.name = name;
                this.age = age;
                this.department = department;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getDepartment() {
                return department;
            }

            public void setDepartment(String department) {
                this.department = department;
            }

            public String toString() {
                return "Name: " + name + ", Age: " + age + ", Department: " + department;
            }
        }

        public class Student extends UniversityMember {
            private String major;

            public Student(String name, int age, String department, String major) {
                super(name, age, department);
                this.major = major;
            }

            public String getMajor() {
                return major;
            }

            public void setMajor(String major) {
                this.major = major;
            }

            public String toString() {
                return super.toString() + ", Major: " + major;
            }
        }

        public class Professor extends UniversityMember {
            private String researchArea;

            public Professor(String name, int age, String department, String researchArea) {
                super(name, age, department);
                this.researchArea = researchArea;
            }

            public String getResearchArea() {
                return researchArea;
            }

            public void setResearchArea(String researchArea) {
                this.researchArea = researchArea;
            }

            public String toString() {
                return super.toString() + ", Research Area: " + researchArea;
            }
        }

    }
}
