
package calculateAge;

import java.util.Scanner;
import java.util.InputMismatchException;
import ec.espe.edu.calculateAge.utils.CustomDate;
import ec.espe.edu.calculateAge.utils.AgeCalculation;

/**
 * @author Bryan Zurita
 */
public class CalculateAge {

    public static void main(String[] args) {   
        
    int birthDay=0,birthMonth=0,birthYear=0, validationChar=0;
    String personName = null, tempOption = null;
    char option = 0;
    try{
      do{  
      Scanner scan = new Scanner(System.in);
      System.out.println("Ingrese su nombre: ");
      personName=scan.next();
      
      System.out.println("Ingrese el dia de su nacimiento en numeros: ");
      try{
           birthDay=scan.nextInt();
      } catch (InputMismatchException ed) {
          System.out.println("Valor ingresado NO numerico resetee el programa");
          break;
      }
      System.out.println("Ingrese el mes de su nacimiento en numeros: ");
          try{
           birthMonth=scan.nextInt();
      } catch (InputMismatchException em) {
          System.out.println("Valor ingresado NO numerico resetee el programa");
          break;
      }
      System.out.println("Ingrese el año de su nacimiento en numeros");
       try{
           birthYear=scan.nextInt();
      } catch (InputMismatchException ey) {
          System.out.println("Valor ingresado NO numerico resetee el programa");
          break;
      }
       
       AgeCalculation ageVal = new AgeCalculation(birthDay,birthMonth,birthYear);
       CustomDate ageCalc;

       if(ageVal.validationDate()) {
                System.out.println("Posiblemente el año, mes o día insertados den un error de cálculo, inserte datos válidos");
       }else{
           ageCalc=ageVal.calculateAge();
           System.out.println("\n"+personName + " usted tiene la sguiente edad:\nAños: " + String.valueOf(ageCalc.getAgeYear()) + "\nMeses: " +String.valueOf(ageCalc.getAgeMonth()) + "\nDias: " + String.valueOf(ageCalc.getAgeDay())+"\n");
       }
       
     System.out.println("Si desea realizar una nueva consulta dijite \"s\", pulse cualquier otra tecla para salir...");
     do{
         tempOption = scan.next();
         validationChar = tempOption.length();
         if( validationChar == 1){
             option = tempOption.charAt(0);
         }else{
             System.out.println("Solo ingrese un caracter \"s\" o cualquier tecla para salir por favor...");
             option = 0;
         }
     }while(validationChar != 1);
     
    }while(option == 'S' || option == 's');
      
   }catch(InputMismatchException ex){
        System.out.println("Acaba de suceder un error porfavor contactese con soporte tecnico...");
   }
  }
 }
    
    

