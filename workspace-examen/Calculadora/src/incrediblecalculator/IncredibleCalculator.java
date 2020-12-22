package incrediblecalculator;

import java.util.Scanner;

public class IncredibleCalculator {

    public static void main(String[] args) {

        System.out.println("Selecciona la operación que prefieras realizar: ");
        System.out.println("2. Restar");
       
        int opcion = leerEnteroEntrada();


        switch (opcion) {

            case 2: // Restar. Debes leer dos números enteros de entrada e imprimir su resta
                    break;
        }

    }



    public static int resta(int a, int b) {
        return a - b;
    }

    public static int leerEnteroEntrada() {
        try {
            Scanner sc = new Scanner(System.in);
            int result = Integer.parseInt(sc.next());
            sc.close();
            return result;
        } catch (NumberFormatException ex) {
            System.err.println("Lo que has introducido no es un número entero!");
            System.exit(1);
            return -1;
        }

    }

}