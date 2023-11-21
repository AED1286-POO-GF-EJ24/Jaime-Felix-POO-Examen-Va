package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        System.out.println("Factorial");
        System.out.println("=========");

        System.out.println();

        // Proporcione el valor de N
        System.out.print("Proporcione el valor de N:");

        try
        {
            // Crear Factorial
            Factorial f = new Factorial( N );
            
            // Mostrar el factorial
            System.out.println();
        }
        catch (FactorialException fe )
        {
            // Mostrar mensaje de la excepcion
        }
        finally
        {
            entrada.close();
        }
    }
}