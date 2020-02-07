import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        IStack<Integer> coleccion = new MiStack<Integer>();// Se instancia un Stack
        ICalculator Calculadora = new Calculator(); // Se instancia una nueva calculadora

        String datos = "";
        //Se crea un try and catch por posibles errores
        try {
            String archivo = "datos.txt"; //Se crea el archivo el cual servira para poder leer el archivo de texto
            File fl = new File(archivo);
            Scanner sc = new Scanner(fl); // Se instancia un scanner que servira para leer el archivo de texto

            datos = sc.nextLine();//Se guardan los datos en la variable datos
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        String [] datosLista = datos.split("\\s");// Guarda los datos en un array con split
        System.out.println(datosLista);
        boolean numero = false;
        int contador = 0;//Variable que me servira para poder saber que dato se esta leyendo

        while (contador < datosLista.length ){

            try{
                coleccion.push(Integer.parseInt(datosLista[contador]));
                numero = true;
            }catch (Exception e){
                numero = false;
            }

            if (numero == false){
                if (coleccion.size() <= 1){
                    System.out.println("No hay suficientes datos para operar");
                }else {

                    if (datosLista.equals("+")){
                        coleccion.push(Calculadora.sumar(coleccion.pop(),coleccion.pop())); //Realiza la operacion de suma
                    }else if (datosLista.equals("-")){
                        coleccion.push(Calculadora.restar(coleccion.pop(),coleccion.pop())); //Realiza la operacion de resta
                    }else if (datosLista.equals("*")){
                        coleccion.push(Calculadora.multiplicacion(coleccion.pop(),coleccion.pop())); // Realiza la operacion de multiplicacion
                    }else if (datosLista.equals("/")){
                        coleccion.push(Calculadora.division(coleccion.pop(),coleccion.pop())); // Realiza la operacion de divsion
                    }else{
                        System.out.println("No se puede realizar la operacion porfavor ingrese nuevamente");
                    }
                }

            }
            contador++;// aumenta el contador
        }

        if (coleccion.size() == 1){
            System.out.println("Su resultado es: "+ coleccion.get());//imprime el resultado de las operaciones
        }else{
            System.out.println("No se pudo procesar la informacion porfavor comprueba los datos.");// en caso de que no se puede leer el archivo de texto
        }
    }
}