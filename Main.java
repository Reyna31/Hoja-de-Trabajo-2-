import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        iCalculadora Calculadora = new Micalculadora(); // Se instancia una nueva calculadora
        Scanner sc = null; // Se instancia un scanner que servira para leer el archivo de texto

        String archivo ="dato.txt"; //Se crea un String el cual servira para poder leer el archivo de texto
        File fl = new fichero(archivo);

        //Se crea un try and catch por posibles errores
        try {
            sc = new Scanner(fl); //El scaner lee el archivo de texto
            datos = sc.nextLine();//Se guardan los datos en la variable datos
        }
        catch (Exception ex){
            ex.printStackTrace();
        }


    }
}

