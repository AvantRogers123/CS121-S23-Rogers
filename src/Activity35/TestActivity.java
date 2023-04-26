package Activity35;

public class TestActivity {
    public static void main(String[] args) {
            public int add(int a, int b) {
                return a + b;
            }

    }
import static org.junit.Assert.*;

import org.junit.Test;

    public class CalculatorTest {
        @Test
        public void testAdd() {
            Calculator calculator = new Calculator();

            // Test case 1: add two positive integers
            int result = calculator.add(2, 3);
            assertEquals(5, result);

            // Test case 2: add a positive integer and a negative integer
            result = calculator.add(5, -3);
            assertEquals(2, result);
        }
    }

