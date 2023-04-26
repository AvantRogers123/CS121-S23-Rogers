package StringArrayLists;

public class StringAwayList { import java.util.ArrayList;

    public class StringArrayList {
        private ArrayList<String> list;

        public StringArrayList() {
            list = new ArrayList<String>();
        }

        public void add(String str) {
            list.add(str);
        }

        public void remove(String str) {
            list.remove(str);
        }

        public int size() {
            return list.size();
        }

        public String get(int index) {
            return list.get(index);
        }

        public void displayForEach() {
            for(String str : list) {
                System.out.println(str);
            }
        }

        public void displayFor() {
            for(int i=0; i<list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }

}
