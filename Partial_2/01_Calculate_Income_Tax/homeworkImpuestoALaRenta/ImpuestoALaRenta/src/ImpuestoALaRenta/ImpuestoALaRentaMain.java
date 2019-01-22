
package ImpuestoALaRenta;
import ec.edu.espe.ImpuestoALaRenta.util.Validations;
import ec.edu.espe.ImpuestoALaRenta.operation.SalaryCalc;
import ec.edu.espe.ImpuestoALaRenta.operation.ImpuestoALaRentaCalc;
import java.util.Scanner;

/**
 * 
 * @author bryan
 */
public class ImpuestoALaRentaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int menu = 0;
        int auxWhile = 0;
        float salary = 0;
        int auxValidationPositiveSalary=0;
        float taxToPay;
        String name;
        
        Scanner scanner = new Scanner(System.in);
        SalaryCalc salaryCalc;
        ImpuestoALaRentaCalc taxCalc;
        
        do {
            System.out.println("Bienvenido al programa de cálculo del Impuesto a la Renta");
            System.out.println("1. Para darle un resumen del proceso de cálculo del Impuesto a la Renta");
            System.out.println("2. Para ingresar al proceso del cálculo");
            System.out.println("0. Para salir del programa");
            menu = Validations.numberScanInt();
            switch (menu) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Al ingresar tu salario mensual sera calculado para 12 meses; es decir para un año");
                    System.out.println("despues de eso se verificara en que rango de la tabla del SRI cae tu sueldo en los 12 meses");
                    System.out.println("una vez listo el rango, se obtendra el impuesto a la fraccion basica segun te corresponde");
                    System.out.println("que sera un valor q ya se debera pagar, a este valor le debemos sumar el excedente de tu");
                    System.out.println("salario que se calcula el salario en los 12 meses menos la fraccion basica,ese valor sera");
                    System.out.println("multiplicado por el tanto porciento que te corresponde en la tabla, y con estos dos valores");
                    System.out.println("sabremos cual es el valor que tienes que pagar al SRI");
                    System.out.println("");
                    System.out.println("Una vez haber entendido el proceso del calculo del Impuesto a la Renta");
                    System.out.println("Deseas realizar el cálculo de su Impuesto a la Renta?");
                    System.out.println("1. Si");
                    System.out.println("0. No");
                    auxWhile = Validations.numberScanInt();
                    break;
                case 2:
                    System.out.println("Bienvenido");
                    System.out.println("Ingrese su nombre por favor");
                    name = scanner.nextLine();
                    System.out.println("Hola " + name);
                    do {
                        System.out.println("Por favor ingresa el valor mensual del tu salario");
                        salary = Validations.numberScanFloat();
                        if(salary < 0f)
                        {
                            System.out.println(name+", por favor ingresa un numero positivo");
                            auxValidationPositiveSalary = 0;
                        }
                        else
                        {
                            auxValidationPositiveSalary = 1;
                        }
                    } while (auxValidationPositiveSalary == 0);
                    salary = Validations.truncate(salary);
                    salaryCalc = new SalaryCalc(salary);
                    System.out.println("Su ingreso despues de la aportación persona obligatoria al IESS al mes es: "+salaryCalc.netMonthlySalary());
                    System.out.println("Su ingreso anual neto es: "+salaryCalc.netAnualySalary());
                    taxCalc = new ImpuestoALaRentaCalc();
                    taxToPay = taxCalc.(salaryCalc.getNetAnualySalary());
                    System.out.println("El valor del impuesto a pagar es: "+taxToPay);
                    System.out.println("Deseas realizar otro cálculo?");
                    System.out.println("1. Si");
                    System.out.println("0. No");
                    auxWhile = Validations.numberScanInt();
                    break;
                default:
                    auxWhile = Validations.error();
                    break;
            }
        } while (auxWhile == 1);
    }
}
