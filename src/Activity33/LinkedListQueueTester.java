package Activity33;

public class LinkedListQueueTester {
    public static void main(String[] args) {
        public class LinkedListQueueTester {

            public static void main(String[] args) {
                LinkedListQueue<String> queue = new LinkedListQueue<String>();

                // Step 1
                queue.enqueue("Tom");
                queue.enqueue("Jane");
                queue.enqueue("Beth");
                System.out.println("Step 1:");
                System.out.println(queue.dequeue()); // Tom
                System.out.println(queue.dequeue()); // Jane
                System.out.println(queue.dequeue()); // Beth
                System.out.println();

                // Step 2
                queue.enqueue("Tom");
                queue.enqueue("Jane");
                queue.enqueue("Beth");
                queue.enqueue("John");
                queue.enqueue("Mary");
                System.out.println("Step 2:");
                System.out.println(queue.dequeue()); // Tom
                System.out.println(queue.dequeue()); // Jane
                System.out.println(queue.dequeue()); // Beth
                System.out.println(queue.dequeue()); // John
                System.out.println(queue.dequeue()); // Mary
                System.out.println();

                // Step 3
                queue.enqueue("Tom");
                queue.enqueue("Jane");
                queue.enqueue("Beth");
                queue.enqueue("John");
                queue.enqueue("Mary");
                System.out.println("Step 3:");
                System.out.println("Queue is empty: " + queue.isEmpty()); // false
                System.out.println("Number of items in queue is " + queue.size()); // 5
                System.out.println("The head of the queue is: " + queue.peek()); // Tom
                System.out.println("Remove " + queue.dequeue()); // Tom
                System.out.println();

                // Step 4
                System.out.println("Step 4:");
                System.out.println(queue.dequeue()); // Jane
                System.out.println(queue.dequeue()); // Beth
                System.out.println(queue.dequeue()); // John
                System.out.println(queue.dequeue()); // Mary
                System.out.println();

                // Step 5
                queue.enqueue("Tom");
                queue.enqueue("Jane");
                queue.enqueue("Beth");
                queue.enqueue("John");
                queue.enqueue("Mary");
                System.out.println("Step 5:");
                System.out

            }
}
