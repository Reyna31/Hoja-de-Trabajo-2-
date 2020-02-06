import java.util.Collection;
import java.util.Vector;

public class Stack<T> implements IStack<T> {

    public void push(T item) {
        vector.add(item);
    }

    public T pop() {
        return vector.remove(size() -1);
    }

    public T get(int index) {
        return null;
    }

    public int index(T object) {
        return 0;
    }

    public void addAll(Collection<T> values) {

    }
    
    public int size() {
        return vector.size();
    }
}
