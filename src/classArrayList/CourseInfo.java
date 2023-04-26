package classArrayList;

public class CourseInfo {
    public static void main(String[] args) {
        import java.util.ArrayList;

        public class CourseInfo {
            private ArrayList<String> courseNameList;
            private ArrayList<Double> gpaList;
            private ArrayList<Integer> scoreList;
            private ArrayList<String> letterGradeList;

            public CourseInfo() {
                courseNameList = new ArrayList<String>();
                gpaList = new ArrayList<Double>();
                scoreList = new ArrayList<Integer>();
                letterGradeList = new ArrayList<String>();
            }

            public void addCourse(String courseName, double gpa, int score, String letterGrade) {
                courseNameList.add(courseName);
                gpaList.add(gpa);
                scoreList.add(score);
                letterGradeList.add(letterGrade);
            }

            public void printCourseInfo() {
                System.out.println("Course Name\tGPA\tScore\tLetter Grade");
                for(int i=0; i<courseNameList.size(); i++) {
                    System.out.println(courseNameList.get(i) + "\t" + gpaList.get(i) + "\t" + scoreList.get(i) + "\t" + letterGradeList.get(i));
                }
            }
        }
    }
}
