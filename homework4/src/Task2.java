import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        Deque test = new Deque();
        test.dequeue(5);
        test.dequeue(4);
        test.enqueue(1);
        test.enqueue(2);
        System.out.println(test.first());
        test.print();
    }

    static class Deque {
        LinkedList<Integer> deque;
        {
            deque = new LinkedList<>();
        }
        void dequeue (int n) {
            this.deque.add(n);
        }
        void enqueue (int n) {
            this.deque.addFirst(n);
        }
        Integer first () {
            return this.deque.getFirst();
        }
        void print() {
            for (Integer el : this.deque) {
                System.out.printf("%d ", el);
            }
        }
    }
}
