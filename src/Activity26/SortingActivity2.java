package Activity26;

public class SortingActivity2 {
    public static void main(String[] args) {
        import java.util.Scanner;

        public class Sorting {
            public static int[] getArray() {
                int[] arr = new int[5];
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter 5 unsorted integers:");
                for (int i = 0; i < 5; i++) {
                    arr[i] = sc.nextInt();
                }
                return arr;
            }

            public static int[] sortArray(int[] arr) {
                // Selection sort algorithm
                int n = arr.length;
                for (int i = 0; i < n - 1; i++) {
                    int min_idx = i;
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] < arr[min_idx]) {
                            min_idx = j;
                        }
                    }
                    // swap arr[min_idx] and arr[i]
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
                return arr;} }
}
