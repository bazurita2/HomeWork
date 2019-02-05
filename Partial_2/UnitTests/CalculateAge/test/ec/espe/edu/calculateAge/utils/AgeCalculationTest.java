
package ec.espe.edu.calculateAge.utils;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bryan
 */
public class AgeCalculationTest {
    
    public AgeCalculationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validationDate method, of class AgeCalculation.
     */
    
    @Test
    public void testValidationDate1() {
        System.out.println("ValidationDate 1");
        AgeCalculation instance = new AgeCalculation(27,03,1997);
        boolean expResult = false;
        boolean result = instance.validationDate();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationDate2() {
        System.out.println("ValidationDate 2");
        AgeCalculation instance = new AgeCalculation(23,12,1996);
        boolean expResult = false;
        boolean result = instance.validationDate();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationDate3() {
        System.out.println("ValidationDate 3");
        AgeCalculation instance = new AgeCalculation(29,02,1998);
        boolean expResult = false;
        boolean result = instance.validationDate();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationDate4() {
        System.out.println("ValidationDate 4");
        AgeCalculation instance = new AgeCalculation(13,-1,0);
        boolean expResult = false;
        boolean result = instance.validationDate();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationDate5() {
        System.out.println("ValidationDate 5");
        AgeCalculation instance = new AgeCalculation(1,14,1998);
        boolean expResult = false;
        boolean result = instance.validationDate();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationDate6() {
        System.out.println("ValidationDate 6");
        AgeCalculation instance = new AgeCalculation(35,12,1998);
        boolean expResult = false;
        boolean result = instance.validationDate();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationDate7() {
        System.out.println("ValidationDate 7");
        AgeCalculation instance = new AgeCalculation(31,04,1999);
        boolean expResult = false;
        boolean result = instance.validationDate();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationDate8() {
        System.out.println("ValidationDate 8");
        AgeCalculation instance = new AgeCalculation(1998,01,04);
        boolean expResult = false;
        boolean result = instance.validationDate();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationDate9() {
        System.out.println("ValidationDate 9");
        AgeCalculation instance = new AgeCalculation(12,12,2030);
        boolean expResult = false;
        boolean result = instance.validationDate();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationDate10() {
        System.out.println("ValidationDate 10");
        AgeCalculation instance = new AgeCalculation(29,02,2015);
        boolean expResult = false;
        boolean result = instance.validationDate();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationDate11() {
        System.out.println("ValidationDate 11");
        AgeCalculation instance = new AgeCalculation(31,04,2016);
        boolean expResult = false;
        boolean result = instance.validationDate();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationDate12() {
        System.out.println("ValidationDate 12");
        AgeCalculation instance = new AgeCalculation(31,11,2013);
        boolean expResult = false;
        boolean result = instance.validationDate();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationDate13() {
        System.out.println("ValidationDate 13");
        AgeCalculation instance = new AgeCalculation(17,12,1970);
        boolean expResult = false;
        boolean result = instance.validationDate();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationDate14() {
        System.out.println("ValidationDate 14");
        AgeCalculation instance = new AgeCalculation(17,12,1970);
        boolean expResult = false;
        boolean result = instance.validationDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateAge method, of class AgeCalculation.
     */
    
    @Test
    public void testCalculateAge1() {
        System.out.println("CalculateAge 1");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(27,03,1997);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(16);
        expResult.setAgeMonth(8);
        expResult.setAgeYear(21);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    @Test
    public void testCalculateAge2() {
        System.out.println("CalculateAge 2");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(23,12,1996);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(20);
        expResult.setAgeMonth(11);
        expResult.setAgeYear(21);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    @Test
    public void testCalculateAge3() {
        System.out.println("CalculateAge 3");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(29,02,1998);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(5);
        expResult.setAgeMonth(9);
        expResult.setAgeYear(20);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    @Test
    public void testCalculateAge4() {
        System.out.println("CalculateAge 4");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(13,-1,0);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(21);
        expResult.setAgeMonth(0);
        expResult.setAgeYear(2019);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    @Test
    public void testCalculateAge5() {
        System.out.println("CalculateAge 5");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(1,12,1998);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(3);
        expResult.setAgeMonth(11);
        expResult.setAgeYear(20);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    @Test
    public void testCalculateAge6() {
        System.out.println("CalculateAge 6");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(35,12,1998);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(29);
        expResult.setAgeMonth(10);
        expResult.setAgeYear(19);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    @Test
    public void testCalculateAge7() {
        System.out.println("CalculateAge 7");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(31,04,1999);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(3);
        expResult.setAgeMonth(7);
        expResult.setAgeYear(19);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    @Test
    public void testCalculateAge8() {
        System.out.println("CalculateAge 8");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(1998,01,04);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(13);
        expResult.setAgeMonth(5);
        expResult.setAgeYear(2009);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    @Test
    public void testCalculateAge9() {
        System.out.println("CalculateAge 9");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(29,02,2015);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(22);
        expResult.setAgeMonth(11);
        expResult.setAgeYear(-13);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    @Test
    public void testCalculateAge10() {
        System.out.println("CalculateAge 10");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(31,04,2016);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(29);
        expResult.setAgeMonth(02);
        expResult.setAgeYear(2015);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    @Test
    public void testCalculateAge11() {
        System.out.println("CalculateAge 11");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(31,11,2013);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(31);
        expResult.setAgeMonth(04);
        expResult.setAgeYear(2016);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    @Test
    public void testCalculateAge12() {
        System.out.println("CalculateAge 12");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(17,12,1970);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(31);
        expResult.setAgeMonth(11);
        expResult.setAgeYear(2013);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    @Test
    public void testCalculateAge13() {
        System.out.println("CalculateAge 13");
        String expectedResult = null, actualResult = null;
        AgeCalculation instance = new AgeCalculation(17,12,1970);
        CustomDate expResult = new CustomDate();
        expResult.setAgeDay(31);
        expResult.setAgeMonth(11);
        expResult.setAgeYear(2013);
        CustomDate result = instance.calculateAge();
        expectedResult=expResult.getAgeDay()+"/"+expResult.getAgeMonth()+"/"+expResult.getAgeYear();
        actualResult=result.getAgeDay()+"/"+result.getAgeMonth()+"/"+result.getAgeYear();
        System.out.println(expectedResult+" expected");
        System.out.println(actualResult+" actual");
        assertEquals(expectedResult, actualResult);
        System.out.println("The date it's allright\n");
    }
    
    
    @Test
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
