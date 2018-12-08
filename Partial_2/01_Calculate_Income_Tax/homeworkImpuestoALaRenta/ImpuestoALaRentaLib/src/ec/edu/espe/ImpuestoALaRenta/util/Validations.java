
package ec.edu.espe.ImpuestoALaRenta.util;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Validations {
    private static Scanner scanner = new Scanner(System.in);
    
    public static int numberScanInt()
    {
        int numberReturn = 0;
        int aux =0;
        do
        {
            try
            {
                
                numberReturn = scanner.nextInt();
                aux =1;
                scanner.skip("\n");
            }
            catch(InputMismatchException e)
            {
                System.out.println("Error, ingrese solo números enteros");
                aux=0;
                System.out.println("Ingrese nuevamente");
                scanner.nextLine();
            }
            
        }while(aux == 0);
        return numberReturn;
    }
    
    public static float numberScanFloat()
    {
        float numberReturn = 0;
        int aux =0;
        do
        {
            try
            {
                numberReturn = scanner.nextFloat();
                scanner.skip("\n");
                aux =1;
            }
            catch(InputMismatchException e)
            {
                System.out.println(e);
                System.out.println("Error, ingrese solo números");
                System.out.println("Recuerda ingresar en número con coma. Ejemplo 2,2 en lugar de 2.2");
                aux=0;
                System.out.println("Ingrese nuevamente");
                scanner.nextLine();
            }
            
        }while(aux == 0);
        return numberReturn;
    }
    
     public static int error() {
        int aux = 0;
        int aux2 = 0;
        do {
            System.out.println("Error");
            System.out.println("Desea intentar otra vez?");
            System.out.println("0. Para salir del programa");
            System.out.println("1. Para intentar nuevamente");
            try {
                aux = scanner.nextInt();
                aux2 = 0;
                scanner.skip("\n");
            } catch (InputMismatchException e) {
                System.out.println("Error, ingrese solo números enteros");
                scanner.nextLine();//Revisar el funcionamiento de esta linea - No se que hize pero funciono
                aux2 = 1;
            }
        } while (aux2 == 1);
        if (aux == 0) {
            System.exit(0);
            return 0;
        } else if (aux == 1) {
            return 1;
        } else {
            System.out.println("Error fatal, ingrese nuevamente a el programa por favor.");
            System.exit(0);
            return 0;
        }
        
    }
    public static float truncate(float numberToTruncate) {
        float truncatedNumber;
        int aux = (int)(numberToTruncate*100);
        truncatedNumber = aux/100f;
        return truncatedNumber;
    }
    
}
