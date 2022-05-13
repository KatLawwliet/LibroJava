
//Crear y manipular un objeto Cuenta
import java.util.Scanner;

public class PruebaCuenta
{
    public static void main(String[] args)
    {
        // crea un objeto Scanner para obtener la entrada desde el símbolo del sistema
        Scanner entrada = new Scanner(System.in);

        // crea un objeto Cuenta y lo asigna a miCuenta
        Cuenta miCuenta = new Cuenta();

        // muestra el valor inicial del nombre (null)
        System.out.printf("El nombre inicial es: %s%n%n", miCuenta.obtenerNombre());

        // pide y lee el nombre
        System.out.println("Introduzca el Nombre");
        String elNombre = entrada.nextLine(); //Lee una linea de texto
        miCuenta.establecerNombre(elNombre); //Coloca elNombre en mi Cuenta
        System.out.println(); //Imprime una linea en blanco

        // muestra el nombre almacenado en el objeto miCuenta
        System.out.printf("El nombre en el objeto miCuenta es:%n%s%n",
                miCuenta.obtenerNombre());
    }

}
