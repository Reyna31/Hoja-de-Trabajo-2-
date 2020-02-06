/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class IStackTest {
    
    public IStackTest() {
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
     * Test of push method, of class IStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = null;
        IStack instance = new IStackImpl();
        instance.push(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class IStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        IStack instance = new IStackImpl();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class IStack.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        IStack instance = new IStackImpl();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class IStack.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        IStack instance = new IStackImpl();
        Object expResult = null;
        Object result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class IStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        IStack instance = new IStackImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IStackImpl implements IStack {

        public void push(T item) {
        }

        public T pop() {
            return null;
        }

        public boolean empty() {
            return false;
        }

        public T get() {
            return null;
        }

        public int size() {
            return 0;
        }
    }
    
}
