import java.io.IOException;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;

public interface iCalculator {
    void init () throws IOException, URISyntaxException;
    // realiza suma de dos parametros 
    int sum(int a, int b);
    // relaiza la resta de dos parametros
    int subtraction(int a, int b);
    // realiza la division de dos parametros
    int division(int a, int b);
    // realiza la multiplicacion de dos parametros
    int multiply(int a, int b);
    
    boolean isInt(String value);
    void manageOperator(String operator);
}