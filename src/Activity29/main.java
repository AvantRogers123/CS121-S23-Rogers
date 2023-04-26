package Activity29;

public class main {
    public static void main(String[] args) {
        import java.util.ArrayList;
import java.util.Arrays;

        public class Main {
            public static void main(String[] args) {
                GenericMethods gm = new GenericMethods();

                // ArrayLists of different types
                ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
                ArrayList<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
                ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(1.5, 2.5, 3.5));
                ArrayList<Character> charList = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd'));

                // Print out the ArrayLists
                GenericMethods.printArrayList(intList);
                GenericMethods.printArrayList(stringList);
                GenericMethods.printArrayList(doubleList);
                GenericMethods.printArrayList(charList);
            }
        }

    }
}
