
import java.io.IOException;
import java.net.URISyntaxException;


/**
 * Clase encargada de realizar las operaciones
 * implementa la interfaz iCalculator 
 * @author oscar
 */
public class Calcu implements iCalculator {
    
   /**
    * las operaciones se realizan unicamente con dos parametros
    * @param a
    * @param b
    * @return suma 
    */
    // el siguiente metodo realiza las sumas 
  @Override
  public int sum (int a, int b){
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
  public int subtraction (int a, int b){
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
      if (a == 0){
          return 0;
      }
      if (b == 0){
          return 0;
      }
      
      return a / b;
      
  }
  /**
    * las operaciones se realizan unicamente con dos parametros
    * @param a
    * @param b
    * @return multiplicacion  
    */
  // el siguiente metodo realiza las multiplicaciones 
  @Override
  public int multiply (int a, int b){
      return a * b;
      
  }

    @Override
    public void init() throws IOException, URISyntaxException {
    }

    @Override
    public boolean isInt(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void manageOperator(String operator) {
        
    }
}
