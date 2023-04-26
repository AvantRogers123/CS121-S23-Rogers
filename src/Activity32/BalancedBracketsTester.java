package Activity32;

public class BalancedBracketsTester {
    public static void main(String[] args) {
        public class BalancedBracketsTester {
            public static void main(String[] args) {
                String[] testStrings = { "{[]()}", "{[(])}", "{{[[(())]]}}" };
                for (String str : testStrings) {
                    if (BalancedBrackets.isBalanced(str)) {
                        System.out.println(str + " has balanced brackets");
                    } else {
                        System.out.println(str + " has unbalanced brackets");
                    }
                }
            }
        }

    }
}
