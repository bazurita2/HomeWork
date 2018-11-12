
package ec.edu.espe.barbershopproject.model;

/**
 *
 * @author Bryan Zurita
 */
public class Schedule {
    private double weekHoursOfWorking;
    private double weekendHoursOfWorking;
    private int holiDays;
    private int workDays;

    public Schedule(double weekHoursOfWorking, double weekendHoursOfWorking, int holiDays, int workDays) {
        this.weekHoursOfWorking = weekHoursOfWorking;
        this.weekendHoursOfWorking = weekendHoursOfWorking;
        this.holiDays = holiDays;
        this.workDays = workDays;
    }

    public void comply (/*Schedule schedule*/){
        
        
    }
    
    private void assistOfEmployee (/*Schedule schedule, Employee employee*/){
        
        
    }
    
    /**
     * @return the weekHoursOfWorking
     */
    public double getWeekHoursOfWorking() {
        return weekHoursOfWorking;
    }

    /**
     * @param weekHoursOfWorking the weekHoursOfWorking to set
     */
    public void setWeekHoursOfWorking(double weekHoursOfWorking) {
        this.weekHoursOfWorking = weekHoursOfWorking;
    }

    /**
     * @return the weekendHoursOfWorking
     */
    public double getWeekendHoursOfWorking() {
        return weekendHoursOfWorking;
    }

    /**
     * @param weekendHoursOfWorking the weekendHoursOfWorking to set
     */
    public void setWeekendHoursOfWorking(double weekendHoursOfWorking) {
        this.weekendHoursOfWorking = weekendHoursOfWorking;
    }

    /**
     * @return the holiDays
     */
    public int getHoliDays() {
        return holiDays;
    }

    /**
     * @param holiDays the holiDays to set
     */
    public void setHoliDays(int holiDays) {
        this.holiDays = holiDays;
    }

    /**
     * @return the workDays
     */
    public int getWorkDays() {
        return workDays;
    }

    /**
     * @param workDays the workDays to set
     */
    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }
    
}
