/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.calculateAge.utils;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author bryan
 */
public class Test {
    
    @org.junit.Test
    public void testCalculateAge10() {
        System.out.println("CalculateAge 10");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(31,04,2016);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(0);
        expResult.setAgeMonth(0);
        expResult.setAgeYear(0);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    @org.junit.Test
    public void testCalculateAge11() {
        System.out.println("CalculateAge 11");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(31,11,2013);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(0);
        expResult.setAgeMonth(0);
        expResult.setAgeYear(0);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    @org.junit.Test
    public void testCalculateAge12() {
        System.out.println("CalculateAge 12");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(17,12,1970);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(0);
        expResult.setAgeMonth(0);
        expResult.setAgeYear(0);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    @org.junit.Test
    public void testCalculateAge13() {
        System.out.println("CalculateAge 13");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(17,12,1970);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(26);
        expResult.setAgeMonth(11);
        expResult.setAgeYear(47);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    
    @org.junit.Test
    public void testCalculateAge14() {
        System.out.println("CalculateAge 14");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(13,12,1970);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(0);
        expResult.setAgeMonth(0);
        expResult.setAgeYear(48);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    
}
