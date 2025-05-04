import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * FibonacciIterator implements java.util.Iterator<Integer>.
 * It handles the logic for iterating over the Fibonacci sequence.
 *
 * Design Decision:
 * ----------------
 * The current state of the Fibonacci sequence (prev, curr, count)
 * is maintained here, within the iterator.
 *
 * Rationale:
 * ----------
 * - Encapsulating the state within the iterator ensures that each iterator
 *   instance is self-contained and independent.
 * - This allows multiple iterators to operate concurrently on their own sequences
 *   without conflict or shared state issues.
 * - This is also more memory-efficient as numbers are generated on demand.
 */
public class FibonacciIterator implements Iterator<Integer> {
    private int count = 0;    // Tracks how many numbers have been generated
    private int prev = 0;     // Previous Fibonacci number
    private int curr = 1;     // Current Fibonacci number

    @Override
    public boolean hasNext() {
        // Infinite sequence, always returns true
        return true;
    }

    @Override
    public Integer next() {
        int nextValue;

        // First call: return 1
        if (count == 0) {
            nextValue = 1;
        } else {
            nextValue = prev + curr;
            prev = curr;
            curr = nextValue;
        }

        count++;
        return (count == 1) ? 1 : nextValue;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove not supported");
    }
}
