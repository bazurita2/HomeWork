
package ec.edu.espe.ImpuestoALaRenta.operation;

import ec.edu.espe.ImpuestoALaRenta.util.Validations;

/**
 * 
 * @author bryan
 */
public class SalaryCalc {
    private float monthlySalary;
    private float netMonthlySalary;
    private float netAnualySalary;
    private final float aportacion = 945F;//Aportacion actual es el 9.45%

    public SalaryCalc(float monthlySalary) {
        this.monthlySalary = monthlySalary;
        netMonthlySalary = 0;
        netAnualySalary = 0;
    }
    public float netMonthlySalary()//net means neto
    {
        netMonthlySalary = monthlySalary - ((monthlySalary * aportacion)/10000F);//El salario neto se calcula del salrio bruto por el 9.45% del procentaje de aportaciones al IESS 
        netMonthlySalary = Validations.truncate(getNetMonthlySalary());
        return getNetMonthlySalary();
    }
    public float netAnualySalary()
    {
        netAnualySalary = netMonthlySalary * 12F;
        netAnualySalary = Validations.truncate(getNetAnualySalary());
        return getNetAnualySalary();
    }

    /**
     * @return the netMonthlySalary
     */
    public float getNetMonthlySalary() {
        return netMonthlySalary;
    }

    /**
     * @return the netAnualySalary
     */
    public float getNetAnualySalary() {
        return netAnualySalary;
    }
    

    
   
}
