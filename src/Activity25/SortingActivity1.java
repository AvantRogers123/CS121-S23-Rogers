package Activity25;

public class SortingActivity1 {
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
                // Bubble sort algorithm
                int n = arr.length;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            // swap arr[j] and arr[j+1]
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp
                }
                return arr;
            }

    }
}
