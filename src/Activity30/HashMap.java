package Activity30;

public class HashMap {
    public static void main(String[] args) {
        import java.util.HashMap;
import java.util.Map;
import java.util.Set;

        public class MyHashMap {
            private Map<String, String> map;

            public MyHashMap() {
                map = new HashMap<>();
            }

            public void addKeyValuePair(String key, String value) {
                map.put(key, value);
            }

            public void removeKeyValuePair(String key) {
                map.remove(key);
            }

            public String getValue(String key) {
                return map.get(key);
            }

            public void displayKeyValues() {
                Set<String> keys = map.keySet();
                for (String key : keys) {
                    System.out.println(key + ": " + map.get(key));
                }
            }
        }

        public class MyHashMapTest {
            public static void main(String[] args) {
                MyHashMap myHashMap = new MyHashMap();

                // Adding key/value pairs
                myHashMap.addKeyValuePair("John", "Smith");
                myHashMap.addKeyValuePair("Mary", "Johnson");
                myHashMap.addKeyValuePair("James", "Brown");

                // Displaying all key/value pairs
                System.out.println("All key/value pairs:");
                myHashMap.displayKeyValues();

                // Removing one key/value pair

            }



}
