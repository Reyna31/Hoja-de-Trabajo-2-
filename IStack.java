import java.util.Collection;

public interface IStack <T> {
    public void push(T item);
    public T pop();
    public T get(int index);
    public int index(T object);
    public void addAll(Collection<T> values);
    public int size();
}
