package Activity29;

public class GenericsMethod {
    public static void main(String[] args) {
        import java.util.ArrayList;

        public class GenericMethods {
            public static <T> void printArrayList(ArrayList<T> arrayList) {
                for (T element : arrayList) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

    }
}
