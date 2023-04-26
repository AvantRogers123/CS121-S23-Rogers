package Activity27;

public class BinarySearchTester {
    public static void main(String[] args) {
        import java.util.ArrayList;
import java.util.Arrays;

        public class BinarySearchTester {
            public static void main(String[] args) {
                ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 8, 11, 14, 18, 21, 23, 27, 30));
                int target = 18;
                int result = BinarySearchDemo.binarySearch(numbers, target);
                if (result == -1) {
                    System.out.println("Number not found.");
                } else {
                    System.out.println("Number found at index " + result);
                }

    }
}
