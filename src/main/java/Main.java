import java.util.Iterator;

/**
 * Main class demonstrates the use of FibonacciSequence and FibonacciIterator.
 */
public class Main {
    public static void main(String[] args) {
        Sequence fibSeq = new FibonacciSequence();
        Iterator<Integer> iterator = fibSeq.iterator();

        System.out.println("First 10 Fibonacci numbers:");
        for (int i = 0; i < 10 && iterator.hasNext(); i++) {
            System.out.print(iterator.next() + " ");
        }
    }
}
