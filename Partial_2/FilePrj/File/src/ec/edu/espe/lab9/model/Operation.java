
package ec.edu.espe.lab9.model;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Operation {
    private int operand1;
     private int operand2;
     private int result;

    public Operation(int operand1, int operand2, int result) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = result;
    }

    
    public int add(int operand1, int operand2){
   
        result = operand1 + operand2;

        return result;
    }
    public int substract(int operand1, int operand2){
        operand2*=-1;
        result = add(operand1,operand2);

        return result;
    }
    public int mult(int operand1, int operand2){
        int sign=1;
        
        if((operand1<0)&&(operand2<0))
        {
            sign=1;
            operand1=-operand1;
            operand2=-operand2;
        }
        else
        {
            if (operand1<0)
            {
                operand1=-operand1;
                sign=-1;
            }
            if (operand2<0)
            {
                operand2=-operand2;
                sign=-1;
            }
        }
        
        
        int acum=0;
        for(int i=0; i<operand2; i++){
            acum=acum+operand1;
        }
        result=acum;
        if (sign==-1)
        {
            result=-result;
        }
        System.out.println("The result is: " + result);
        return result;
    }
    public int div(int operand1, int operand2){
        int sign=1;
        
        if((operand1<0)&&(operand2<0))
        {
            sign=1;
            operand1=-operand1;
            operand2=-operand2;
        }
        else
        {
            if (operand1<0)
            {
                operand1=-operand1;
                sign=-1;
            }
            if (operand2<0)
            {
                operand2=-operand2;
                sign=-1;
            }
        }
        
        int cont=0;
        if (operand2 >0){
            while(operand1>=0){
            operand1=operand1-operand2;
            cont=cont+1;
            }
            cont --;
        
            }else{
                do
                {
                    System.out.println("The division is not posible \n Enter another number");
                    System.out.println("Enter the second number");
                    Scanner dc = new Scanner(System.in);
                    operand2 = dc.nextInt();
                    cont=div(operand1,operand2);
                } while(operand2==0);
            }
        if (sign==-1)
        {
            cont=-cont;
        }
        
        return cont;
        }

    /**
     * @return the operand1
     */
    public int getOperand1() {
        return operand1;
    }

    /**
     * @param operand1 the operand1 to set
     */
    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    /**
     * @return the operand2
     */
    public int getOperand2() {
        return operand2;
    }

    /**
     * @param operand2 the operand2 to set
     */
    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    /**
     * @return the result
     */
    public int getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(int result) {
        this.result = result;
    }
}
