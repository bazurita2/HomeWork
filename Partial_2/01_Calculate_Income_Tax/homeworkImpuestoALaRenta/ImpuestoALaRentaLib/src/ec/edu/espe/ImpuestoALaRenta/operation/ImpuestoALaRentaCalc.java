
package ec.edu.espe.ImpuestoALaRenta.operation;

import java.util.Arrays;
import java.util.List;
import ec.edu.espe.ImpuestoALaRenta.util.Validations;

/**
 *
 * @author 
 */
public class ImpuestoALaRentaCalc {
    private float taxToPay;
    private float fraccionBasica;
    private float valorFraccionExcedente;
    private final List<Float> taxSalaryRange = Arrays.asList(0f, 11270f, 14360f, 17950f, 21550f,43100f,64630f,86180f,114890f);
    private final List<Float> taxPayRange = Arrays.asList(0f,155f,514f,946f,4178f,8484f,13872f,22485f);
    private final List<Float> porcentajeFraccionExcedente = Arrays.asList(0f,5f,10f,12f,15f,20f,25f,30f,35f);
    
    public ImpuestoALaRentaCalc() {
        taxToPay = 0F;
        valorFraccionExcedente = 0F;
        fraccionBasica = 0F;
    }
    public float ImpuestoALaRentaCalc(float netAnualSalary)
    {
        //Ubicacion en la tabla
        if(netAnualSalary>=taxSalaryRange.get(0)&&netAnualSalary<taxSalaryRange.get(1))
        {
            fraccionBasica = taxPayRange.get(0);
            valorFraccionExcedente = ((netAnualSalary - taxSalaryRange.get(0))*porcentajeFraccionExcedente.get(0))/100f;
            taxToPay = Validations.truncate(fraccionBasica+valorFraccionExcedente);
            return getTaxToPay();
        }
        else if(netAnualSalary>=taxSalaryRange.get(1)&&netAnualSalary<taxSalaryRange.get(2))
        {
            fraccionBasica = taxPayRange.get(0);
            valorFraccionExcedente = ((netAnualSalary - taxSalaryRange.get(1))*porcentajeFraccionExcedente.get(1))/100f;
            taxToPay = Validations.truncate(fraccionBasica+valorFraccionExcedente);
            return getTaxToPay();
        }
        else if(netAnualSalary>=taxSalaryRange.get(2)&&netAnualSalary<taxSalaryRange.get(3))
        {
            fraccionBasica = taxPayRange.get(1);
            valorFraccionExcedente = ((netAnualSalary - taxSalaryRange.get(2))*porcentajeFraccionExcedente.get(2))/100f;
            taxToPay = Validations.truncate(fraccionBasica+valorFraccionExcedente);
            return getTaxToPay();
        }
        else if(netAnualSalary>=taxSalaryRange.get(3)&&netAnualSalary<taxSalaryRange.get(4))
        {
            fraccionBasica = taxPayRange.get(2);
            valorFraccionExcedente = ((netAnualSalary - taxSalaryRange.get(3))*porcentajeFraccionExcedente.get(3))/100f;
            taxToPay = Validations.truncate(fraccionBasica+valorFraccionExcedente);
            return getTaxToPay();
        }
        else if(netAnualSalary>=taxSalaryRange.get(4)&&netAnualSalary<taxSalaryRange.get(5))
        {
            fraccionBasica = taxPayRange.get(3);
            valorFraccionExcedente = ((netAnualSalary - taxSalaryRange.get(4))*porcentajeFraccionExcedente.get(4))/100f;
            taxToPay = Validations.truncate(fraccionBasica+valorFraccionExcedente);
            return getTaxToPay();
        }
        else if(netAnualSalary>=taxSalaryRange.get(5)&&netAnualSalary<taxSalaryRange.get(6))
        {
            fraccionBasica = taxPayRange.get(4);
            valorFraccionExcedente = ((netAnualSalary - taxSalaryRange.get(5))*porcentajeFraccionExcedente.get(5))/100f;
            taxToPay = Validations.truncate(fraccionBasica+valorFraccionExcedente);
            return getTaxToPay();
        }
        else if(netAnualSalary>=taxSalaryRange.get(6)&&netAnualSalary<taxSalaryRange.get(7))
        {
            fraccionBasica = taxPayRange.get(5);
            valorFraccionExcedente = ((netAnualSalary - taxSalaryRange.get(6))*porcentajeFraccionExcedente.get(6))/100f;
            taxToPay = Validations.truncate(fraccionBasica+valorFraccionExcedente);
            return getTaxToPay();
        }
        else if(netAnualSalary>=taxSalaryRange.get(7)&&netAnualSalary<taxSalaryRange.get(8))
        {
            fraccionBasica = taxPayRange.get(6);
            valorFraccionExcedente = ((netAnualSalary - taxSalaryRange.get(7))*porcentajeFraccionExcedente.get(7))/100f;
            taxToPay = Validations.truncate(fraccionBasica+valorFraccionExcedente);
            return getTaxToPay();
        }
        else
        {
            fraccionBasica = taxPayRange.get(7);
            valorFraccionExcedente = ((netAnualSalary - taxSalaryRange.get(8))*porcentajeFraccionExcedente.get(8))/100f;
            taxToPay = Validations.truncate(fraccionBasica+valorFraccionExcedente);
            return getTaxToPay();
        }
        
    }

    /**
     * @return the taxToPay
     */
    public float getTaxToPay() {
        return taxToPay;
    }
    
}
