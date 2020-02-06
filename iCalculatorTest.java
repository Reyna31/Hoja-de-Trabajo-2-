/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URISyntaxException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oscar
 */
public class iCalculatorTest {
    
    public iCalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of init method, of class iCalculator.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        iCalculator instance = new iCalculatorImpl();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class iCalculator.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int a = 0;
        int b = 0;
        iCalculator instance = new iCalculatorImpl();
        int expResult = 0;
        int result = instance.sum(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtraction method, of class iCalculator.
     */
    @Test
    public void testSubtraction() {
        System.out.println("subtraction");
        int a = 0;
        int b = 0;
        iCalculator instance = new iCalculatorImpl();
        int expResult = 0;
        int result = instance.subtraction(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class iCalculator.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int a = 0;
        int b = 0;
        iCalculator instance = new iCalculatorImpl();
        int expResult = 0;
        int result = instance.division(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class iCalculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 0;
        int b = 0;
        iCalculator instance = new iCalculatorImpl();
        int expResult = 0;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInt method, of class iCalculator.
     */
    @Test
    public void testIsInt() {
        System.out.println("isInt");
        String value = "";
        iCalculator instance = new iCalculatorImpl();
        boolean expResult = false;
        boolean result = instance.isInt(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of manageOperator method, of class iCalculator.
     */
    @Test
    public void testManageOperator() {
        System.out.println("manageOperator");
        String operator = "";
        iCalculator instance = new iCalculatorImpl();
        instance.manageOperator(operator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class iCalculatorImpl implements iCalculator {

        public void init() throws IOException, URISyntaxException {
        }

        public int sum(int a, int b) {
            return 0;
        }

        public int subtraction(int a, int b) {
            return 0;
        }

        public int division(int a, int b) {
            return 0;
        }

        public int multiply(int a, int b) {
            return 0;
        }

        public boolean isInt(String value) {
            return false;
        }

        public void manageOperator(String operator) {
        }
    }
    
}
