import java.util.Iterator;

/**
 * Sequence interface declaring a method to get an Iterator.
 * This abstracts away how the sequence is generated.
 */
public interface Sequence {
    Iterator<Integer> iterator();
}
