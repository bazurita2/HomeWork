
package ec.espe.edu.calculateAge.utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Bryan Zurita
 */
public class AgeCalculation {
    private int birthDay;
    private int birthMonth;
    private int birthYear; 
      
    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int day) {
        this.birthDay = day;
    }

    public int getBirthMonth() {
        return birthMonth;
    }


    public void setBirthMonth(int month) {
        this.birthMonth = month;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int year) {
        this.birthYear = year;
    }

    public AgeCalculation(int day, int month, int year) {
        this.birthDay = day;
        this.birthMonth = month;
        this.birthYear = year;
    }
    
    public boolean validationDate(){
        int yearCalc;
        
        if (getBirthDay()<0 ||getBirthMonth()<0 ||getBirthYear()<0){
            System.out.println("Ingrese números positivos porfavor...");
            return true;
        }
        else{
            Calendar nowDate = new GregorianCalendar();
            yearCalc = nowDate.get(Calendar.YEAR);
            if(getBirthYear()>yearCalc){
                System.out.println("El año que ingreso supera al actual");
                return true;
            }
            
            switch (getBirthMonth()){
                case 1:
                    if (getBirthDay()>31){
                       System.out.println("El día ingresado no esta dentro del rango de este mes");
                       return true;
                    }
                    break;
                case 2:
                    if (getBirthDay()>29){
                        System.out.println("El día ingresado no esta dentro del rango de este mes");
                    }
                    else if (getBirthDay()==29){
                        if(!leapYear(getBirthYear())){
                            System.out.println("El día ingresado no esta dentro del rango de este mes como año bisiesto");
                             return true;  
                        }
                    }
                 case 3:
                    if (getBirthDay()>31){
                       System.out.println("El día ingresado no esta dentro del rango de este mes");
                       return true;
                    }
                    break;
                 case 4:
                    if (getBirthDay()>30){
                       System.out.println("El día ingresado no esta dentro del rango de este mes");
                       return true;
                    }
                    break;  
                 case 5:
                    if (getBirthDay()>31){
                       System.out.println("El día ingresado no esta dentro del rango de este mes");
                       return true;
                    }
                    break;     
                 case 6:
                    if (getBirthDay()>30){
                       System.out.println("El día ingresado no esta dentro del rango de este mes");
                       return true;
                    }
                    break;    
                 case 7:
                    if (getBirthDay()>31){
                       System.out.println("El día ingresado no esta dentro del rango de este mes");
                       return true;
                    }
                    break;      
                 case 8:
                    if (getBirthDay()>31){
                       System.out.println("El día ingresado no esta dentro del rango de este mes");
                       return true;
                    }
                    break;      
                 case 9:
                    if (getBirthDay()>30){
                       System.out.println("El día ingresado no esta dentro del rango de este mes");
                       return true;
                    }
                    break;        
                 case 10:
                    if (getBirthDay()>31){
                       System.out.println("El día ingresado no esta dentro del rango de este mes");
                       return true;
                    }
                    break;       
                 case 11:
                    if (getBirthDay()>30){
                       System.out.println("El día ingresado no esta dentro del rango de este mes");
                       return true;
                    }
                    break;     
                 case 12:
                    if (getBirthDay()>31){
                       System.out.println("El día ingresado no esta dentro del rango de este mes");
                       return true;
                    }
                    break;       
                 default:{
                    System.out.println("Mes no valido para cálculo");
                    break;  
                 }
              }
        }
        return false;
    }
    
    public boolean leapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    
    public CustomDate calculateAge(){
        int actualDay, actualMonth, actualYear;
        int gDay, gMonth, gYear;
        
        CustomDate customDate=new CustomDate();
        Calendar nowDate = new GregorianCalendar();
        
        actualYear = nowDate.get(Calendar.YEAR);
        actualMonth = nowDate.get(Calendar.MONTH)+1;
        actualDay = nowDate.get(Calendar.DAY_OF_MONTH);
        
        if (getBirthDay() == 0 || getBirthMonth() == 0 || getBirthYear() == 0 ){
            customDate.setAgeDay(0);
            customDate.setAgeMonth(0);
            customDate.setAgeYear(0);
        }
        gDay=actualDay-getBirthDay();
        gMonth=actualMonth-getBirthMonth();
        gYear=actualYear-getBirthYear();
        
        if(gDay<0){
            gDay+=30;
            gMonth--;
        }
        if(gMonth<0){
            gMonth+=12;
            gYear--;
        }
        
        customDate.setAgeDay(gDay);
        customDate.setAgeMonth(gMonth);
        customDate.setAgeYear(gYear);
        
        return customDate;
    }
    
}