package Activity27;

public class BinarySearchDemo {
    public static void main(String[] args) {
        import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

        public class BinarySearchDemo {
            public static void main(String[] args) {
                ArrayList<Integer> numbers = new ArrayList<>();
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter 10 numbers: ");
                for (int i = 0; i < 10; i++) {
                    int number = sc.nextInt();
                    numbers.add(number);
                }
                Collections.sort(numbers);

                System.out.println("Enter the number to search: ");
                int target = sc.nextInt();
                int result = binarySearch(numbers, target);
                if (result == -1) {
                    System.out.println("Number not found.");
                } else {
                    System.out.println("Number found at index " + result);
                }
            }

            public static int binarySearch(ArrayList<Integer> list, int target) {
                int left = 0;
                int right = list.size() - 1;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (list.get(mid) == target) {
                        return mid;
                    } else if (list.get(mid) < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                return -1;



