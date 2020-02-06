import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        IStack<Integer> CStack = new MiStack<Integer>();// Se instancia un Stack
        ICalculator Calculadora = new Calculator(); // Se instancia una nueva calculadora
        Scanner sc = null; // Se instancia un scanner que servira para leer el archivo de texto

        String archivo ="dato.txt"; //Se crea un String el cual servira para poder leer el archivo de texto
        File fl = new File(archivo);
        String datos = "";

        //Se crea un try and catch por posibles errores
        try {
            sc = new Scanner(fl); //El scaner lee el archivo de texto
            datos = sc.nextLine();//Se guardan los datos en la variable datos
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        String[] datosList = datos.split("\\s");// Guarda los datos en un array con split
        int contador = 0;//Variable que me servira para poder saber que dato se esta leyendo

        while (contador < datosList.length ){
            CStack.push(Integer.parseInt(datosList[contador]));
            if (CStack.size() < 2){
                System.out.println("No hay suficientes datos para operar");
            }
            else {
                if (datosList.equals("+")){
                    CStack.push(Calculadora.sum(CStack.pop(),CStack.pop()));
                }else if (datosList.equals("-")){
                    CStack.push(Calculadora.subtraction(CStack.pop(),CStack.pop()));
                }else if (datosList.equals("*")){
                    CStack.push(Calculadora.multiply(CStack.pop(),CStack.pop()));
                }else if (datosList.equals("/")){
                    CStack.push(Calculadora.division(CStack.pop(),CStack.pop()));
                }else{
                    System.out.println("No se puede realizar la operacion porfavor ingrese nuevamente");
                }

            }
            contador++;// aumenta el contador
        }

        if (CStack.size() == 1){
            System.out.println("Su resultado es: "+ CStack.get());//imprime el resultado de las operaciones
        }else{
            System.out.println("No se pudo procesar la informacion porfavor comprueba los datos.");// en caso de que no se puede leer el archivo de texto
        }
    }
}

