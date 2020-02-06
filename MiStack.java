import java.util.ArrayList;

public class MiStack<T> implements IStack<T> {
    protected ArrayList<T> data;

    public MiStack(){
        data = new ArrayList<T>();
    }
    // Se crea una nueva coleccion llamada MiStack

    public void push(T item) {
        data.add(item);
    }


    public T pop() {
        return data.remove(size()-1);
    }
    // Se remueve el ultimo elemento de la coleccion

    public boolean empty() {
        return size() == 0;
    }
    // Si la coleccion se encuentra vacia este devuelve un true

    public T get() {
        return data.get(size()-1);
    }
    //Se obtiene la informacion de un elemento de la coleccion

    public int size() {
        return data.size();
    }
    //Se obtiene el tamaño de la coleccion
}
