package incrediblecalculator;

import java.util.Scanner;

public class IncredibleCalculator {

    public static void main(String[] args) {

        System.out.println("Selecciona la operaci�n que prefieras realizar: ");


        System.out.println("1. Sumar");


        System.out.println("2. Restar");


        System.out.println("3. Multiplicar");

       
        int opcion = leerEnteroEntrada();


        switch (opcion) {


            case 1: //Sumar. Debes leer dos numeros enteros de entrada e imprimir su suma
                    break;
            



            case 2: // Restar. Debes leer dos n�meros enteros de entrada e imprimir su resta
            		break;
            case 3: // Multiplicar. Debes leer dos n�meros enteros de entrada e imprimir su producto.
            	    break;
        }



    




    public static int resta(int a, int b) {
        return a - b;
    }


  

   
    public static int multiplicacion(int a, int b) {
        return a * b;
    }

   


    public static int leerEnteroEntrada() {
        try {
            Scanner sc = new Scanner(System.in);
            int result = Integer.parseInt(sc.next());
            sc.close();
            return result;
        } catch (NumberFormatException ex) {
            System.err.println("Lo que has introducido no es un n�mero entero!");
            System.exit(1);
            return -1;
        }

    }

}