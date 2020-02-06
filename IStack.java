import java.util.Collection;

public interface IStack <T> {
    public void push(T item);
    //pre:
    //post: agrega un nuevo elemento a la coleccion
    public T pop();
    //pre: si la coleccion no esta vacia
    //post: remueve el elemento mas reciente de la colecccion
    public boolean empty();
    //post: Devuele un true si la coleccion no esta vacia
    public T get();
    //pre: La coleccion no debe estar vacia
    //post: El ultimo elemento de la coleccion es obtenido sin removerlo
    public int size();
    //post: return el tamaño de la coleccion 
}
