import java.util.Iterator;

/**
 * FibonacciSequence class implements the Sequence interface.
 * This class serves as a generator or factory for new FibonacciIterator instances.
 *
 * Design Decision:
 * ----------------
 * The state of the Fibonacci sequence (previous values, counters, etc.)
 * is NOT stored in this class. Instead, each call to iterator() returns
 * a new, independent FibonacciIterator.
 *
 * Rationale:
 * ----------
 * This approach avoids shared state across iterators, ensuring thread safety
 * and independence. It also follows the Iterator pattern’s principle of
 * separating the iteration logic from the sequence generator.
 */
public class FibonacciSequence implements Sequence {

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }
}
