package br.ufal.ic.atividades.teste;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

public class BooleanArrayAsListTest {    
    BooleanArrayAsList BAAL1, BAAL2, BAAL3;
    boolean[] Ambos = {false, true};

   
    @BeforeClass
    public static void setUpClass() {
    
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
      
   
    
    @Test
    public void SizeTest() {
        assertEquals(0, BAAL1.size());
        assertEquals(2, BAAL2.size());
        assertEquals(3, BAAL3.size());
    }
    
    @Test
    public void isEmptyTest() {
        assertFalse(BAAL1.isEmpty());
        assertFalse(BAAL2.isEmpty());
        assertFalse(BAAL3.isEmpty());
    }
    
    @Test
    public void GetTest() {
        assertEquals(BAAL2.get(0), true);
        assertEquals(BAAL2.get(1), true);
        assertEquals(BAAL3.get(2), true);
    }
    
    @Test
    public void ContainsTest() {
        assertEquals(false, BAAL1.contains(true));
        assertEquals(false, BAAL1.contains(true));
        assertEquals(true, BAAL2.contains(true));
        assertEquals(false, BAAL2.contains(false));
        assertEquals(true, BAAL3.contains(true));
        assertEquals(false, BAAL3.contains(false));
    }
    
    @Test
    public void IndexOfTest() {
        assertEquals(-1, BAAL1.indexOf(true));
        assertEquals(0, BAAL2.indexOf(true));
        assertEquals(0, BAAL2.indexOf(true));
        assertEquals(0, BAAL3.indexOf(true));
        assertEquals(0, BAAL3.indexOf(true));
        assertEquals(0, BAAL3.indexOf(true));        
    }
    
    @Test
    public void LastIndexOfTest() {
        assertEquals(-1, BAAL1.lastIndexOf(false));
        assertEquals(1, BAAL2.lastIndexOf(true));
        assertEquals(2, BAAL3.lastIndexOf(true));
    }
    
    @Test
    public void SetTest() {
        List<Boolean> listateste = Bools.asList(false);
        
        try {
            listateste.set(0, null);
            fail();
        } catch (NullPointerException expected) {
        }
        try {
            listateste.set(1, true);
            fail();
        } catch (IndexOutOfBoundsException expected) {
        }
    }
    
    @Test
    public void SublistTest() {
        throw new UnsupportedOperationException("not implemented yet.");
    }
 
    
    @Test
    public void HashCodeTest() {
        assertEquals(1, BAAL1.hashCode());
        assertEquals(40353, BAAL2.hashCode());
        assertEquals(1252174, BAAL3.hashCode());
    }
    
    @Test
    public void ToStringTest() {
        assertEquals("[true, true]", BAAL2.toString());
        assertEquals("[true, true, true]", BAAL3.toString());
    }
    

}
