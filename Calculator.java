import java.io.IOException;
import java.net.URISyntaxException;


/**
 * Clase encargada de realizar las operaciones
 * implementa la interfaz iCalculator
 * @author oscar
 */
public class Calculator implements ICalculator {

    /**
     * las operaciones se realizan unicamente con dos parametros
     * @param a
     * @param b
     * @return suma
     */
    // el siguiente metodo realiza las sumas
    @Override
    public int sumar (int a, int b){
        return a + b;
    }
    /**
     * las operaciones se realizan unicamente con dos parametros
     * @param a
     * @param b
     * @return resta
     */
    //el siguiente metodo realiza las restas
    @Override
    public int restar (int a, int b){
        return a - b;
    }
    /**
     * las operaciones se realizan unicamente con dos parametros
     * @param a
     * @param b
     * @return division
     */
    // el siguiente metodo realiza las divisiones siempre
    // y cuando ninguno de los parametros sea 0
    @Override
    public int division (int a, int b){
        int dividendo = 0;
        try {
           if (a == 0) {
               return 0;
           }
           if (b == 0) {
               return 0;
           }
           dividendo = (a/b);
       }catch (Exception e){
          System.out.println("La division no e posible");
          dividendo = -1;
       }
        return dividendo;
    }
    /**
     * las operaciones se realizan unicamente con dos parametros
     * @param a
     * @param b
     * @return multiplicacion
     */
    // el siguiente metodo realiza las multiplicaciones
    @Override
    public int multiplicacion (int a, int b){
        return a * b;

    }
}
