import java.util.Vector;

public class MiStack<T> implements IStack<T> {

    protected Vector<T> vector = new Vector<T>();

    public void push(T item) {
        vector.add(item);
    }


    public T pop() {
        return vector.remove(size()-1);
    }
    // Se remueve el ultimo elemento de la coleccion

    public boolean empty() {
        return vector.size() == 0;
    }
    // Si la coleccion se encuentra vacia este devuelve un true

    public T get() {
        return vector.get(size()-1);
    }
    //Se obtiene la informacion de un elemento de la coleccion

    public int size() {
        return vector.size();
    }
    //Se obtiene el tamaño de la coleccion
}
