package Activity33;

public class LinkedListQueue {
    public static void main(String[] args) {
        public class LinkedListQueue<T> {

            private Node<T> head;
            private Node<T> tail;
            private int size;

            public LinkedListQueue() {
                head = null;
                tail = null;
                size = 0;
            }

            public void enqueue(T data) {
                Node<T> newNode = new Node<T>(data);
                if (isEmpty()) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.setNext(newNode);
                    tail = newNode;
                }
                size++;
            }

            public T dequeue() {
                if (isEmpty()) {
                    throw new RuntimeException("Queue is empty");
                }
                T data = head.getData();
                head = head.getNext();
                size--;
                if (isEmpty()) {
                    tail = null;
                }
                return data;
            }

            public T peek() {
                if (isEmpty()) {
                    throw new RuntimeException("Queue is empty");
                }
                return head.getData();
            }

            public boolean isEmpty() {
                return size == 0;
            }

            public int size() {
                return size;
            }

            private static class Node<T> {

                private T data;
                private Node<T> next;

                public Node(T data) {
                    this.data = data;
                    this.next = null;
                }

                public T getData() {
                    return data;
                }

                public Node<T> getNext() {
                    return next;
                }

                public void setNext(Node<T> next) {
                    this.next = next;
                }
            }
        }

    }
}
