
package ec.edu.espe.lab9.model;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author bryan
 */
public class Person {
    
    private String name;
    
    private int birthDay;
    private int birthMonth;
    private int birthYear;
   
    private int ageDay;
    private int ageMonth;
    private int ageYear;
    
    


   

    
    public void calculateAge (int birthDay, int birthMonth, int birthYear, int ageDay, int ageMonth, int ageYear)
    {
        int year;
        int month;
        int day;
       
        Calendar date1 = new GregorianCalendar();
        year = date1.get(Calendar.YEAR);
        month = date1.get(Calendar.MONTH)+1;
        day = date1.get(Calendar.DAY_OF_MONTH);
       
        ageDay=day-birthDay;
        ageMonth=month-birthMonth;
        ageYear=year-birthYear;
         
        if(ageDay<0)
        {
            ageDay=30+ageDay;
 
                ageMonth--;
        }
        
        
        if(ageMonth<0)
        {
            ageMonth=12+ageMonth;
            ageYear--;
        }
        
        setAgeDay(ageDay);
        setAgeMonth(ageMonth);
        setAgeYear(ageYear);
        
        
        System.out.println("Your age is: \n" + "years :"+ageYear +" \nmonth :" +ageMonth +" \nday :" +ageDay);
        
    }
    
    public int validation(int birthDay, int birthMonth, int birthYear)
    {
        int year;
        if (birthYear<0 || birthMonth<0 || birthDay<0)
        {
            System.out.println("The date isnt correct");
            return 1;
        }
        else
        {
            Calendar date1 = new GregorianCalendar();
            year = date1.get(Calendar.YEAR);
            if(birthYear>year)
            {
                System.out.println("The date isnt correct, Enter again");
                return 1;
            }
            
        }
        return 0;  
    }

    public Person(int birthDay, int birthMonth, int birthYear, int ageDay, int ageMonth, int ageYear) {
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ageDay = ageDay;
        this.ageMonth = ageMonth;
        this.ageYear = ageYear;
    }

    /**
     * @return the birthDay
     */
    public int getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * @return the birthMonth
     */
    public int getBirthMonth() {
        return birthMonth;
    }

    /**
     * @param birthMonth the birthMonth to set
     */
    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    /**
     * @return the birthYear
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * @param birthYear the birthYear to set
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * @return the ageDay
     */
    public int getAgeDay() {
        return ageDay;
    }

    /**
     * @param ageDay the ageDay to set
     */
    public void setAgeDay(int ageDay) {
        this.ageDay = ageDay;
    }

    /**
     * @return the ageMonth
     */
    public int getAgeMonth() {
        return ageMonth;
    }

    /**
     * @param ageMonth the ageMonth to set
     */
    public void setAgeMonth(int ageMonth) {
        this.ageMonth = ageMonth;
    }

    /**
     * @return the ageYear
     */
    public int getAgeYear() {
        return ageYear;
    }

    /**
     * @param ageYear the ageYear to set
     */
    public void setAgeYear(int ageYear) {
        this.ageYear = ageYear;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}