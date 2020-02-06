import java.io.IOException;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;

public interface iCalculator {
    void init () throws IOException, URISyntaxException;
    int sum(int a, int b);
    int subtraction(int a, int b);
    int division(int a, int b);
    int multiply(int a, int b);
    boolean isInt(String value);
    void manageOperator(String operator);
}