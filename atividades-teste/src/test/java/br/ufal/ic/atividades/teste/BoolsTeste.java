package br.ufal.ic.atividades.teste;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;


import static org.junit.Assert.assertEquals;

public class BoolsTeste {
    boolean[] Vazio = {};
    boolean[] Falso = {false};
    boolean[] Verdadeiro = {true};
    boolean[] FalsoFalso = {false, false};
    boolean[] FalsoVerdadeiro = {false, true};
    boolean[] VerdadeiroVerdadeiro = {true, true};
    boolean[] Ambos = {false, true};

    
    public BoolsTeste() {
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
    
    @Test
    public void CompareTest() {
    for (boolean x : Ambos) {
      for (boolean y : Ambos) {
        assertEquals(x + ", " + y, Boolean.valueOf(x).compareTo(y), Bools.compare(x, y));
        }
    }
    }
    
    @Test
    public void ContainsTest() {
    	
        assertNotNull("should not be null", Bools.contains(Verdadeiro, true));
        assertFalse(Bools.contains(Vazio, false));
        assertFalse(Bools.contains(Falso, true));
        assertTrue(Bools.contains(Falso, false));
        assertTrue(Bools.contains(Verdadeiro, true));
        assertTrue(Bools.contains(FalsoVerdadeiro, true));       
        assertTrue(Bools.contains(FalsoVerdadeiro, false));
        assertTrue(Bools.contains(FalsoFalso, false));
        assertTrue(Bools.contains(VerdadeiroVerdadeiro, true));
    }
    
    @Test
    public void IndexOfTest() {
        assertEquals(0, Bools.indexOf(Verdadeiro, new boolean[0]));
        assertEquals(-1, Bools.indexOf(Verdadeiro, Falso));
        assertEquals(-1, Bools.indexOf(Vazio, Falso));
        assertEquals(0, Bools.indexOf(Falso, Falso));     
        assertEquals(-1, Bools.indexOf(Falso, Verdadeiro));             
        assertEquals(-1, Bools.indexOf(Falso, FalsoFalso));        
        assertEquals(-1, Bools.indexOf(Falso, FalsoVerdadeiro));
        assertEquals(0, Bools.indexOf(FalsoFalso, Falso));
        assertEquals(-1, Bools.indexOf(FalsoFalso, Verdadeiro));
        assertEquals(0, Bools.indexOf(FalsoVerdadeiro, Falso));
        assertEquals(1, Bools.indexOf(FalsoVerdadeiro, Verdadeiro));
    }
    
    @Test
    public void IndexOfArraysTest() {
    	
        assertEquals(0, Bools.indexOf(new boolean[] {false, false}, false));
        assertEquals(1, Bools.indexOf(new boolean[] {false, true}, true));
        assertEquals(0, Bools.indexOf(VerdadeiroVerdadeiro, true));
        assertEquals(1, Bools.indexOf(Ambos, true));
        assertEquals(-1, Bools.indexOf(Vazio, false));
        assertEquals(-1, Bools.indexOf(Falso, true));
        assertEquals(-1, Bools.indexOf(FalsoFalso, true));
        assertEquals(0, Bools.indexOf(Falso, false));
        assertEquals(0, Bools.indexOf(FalsoVerdadeiro, false));
        assertEquals(1, Bools.indexOf(FalsoVerdadeiro, true));
    }
    
    @Test
    public void LastIndexOfTest() {
        assertEquals(2, Bools.lastIndexOf(new boolean[] {false, true, true}, true));
        assertEquals(0, Bools.indexOf(new boolean[] {false, false}, false));
        assertEquals(1, Bools.indexOf(new boolean[] {false, true}, true));
        assertEquals(-1, Bools.lastIndexOf(Vazio, false));        
        assertEquals(-1, Bools.lastIndexOf(Vazio, true));
        assertEquals(-1, Bools.lastIndexOf(Falso, true));
        assertEquals(0, Bools.lastIndexOf(Falso, false));
        assertEquals(0, Bools.lastIndexOf(Verdadeiro, true));
        assertEquals(-1, Bools.lastIndexOf(Verdadeiro, false));
        assertEquals(-1, Bools.lastIndexOf(FalsoFalso, true));
        assertEquals(1, Bools.lastIndexOf(FalsoFalso, false));
        assertEquals(0, Bools.lastIndexOf(FalsoVerdadeiro, false));
        assertEquals(1, Bools.lastIndexOf(FalsoVerdadeiro, true));
        assertEquals(-1, Bools.lastIndexOf(VerdadeiroVerdadeiro, false));
        assertEquals(1, Bools.lastIndexOf(VerdadeiroVerdadeiro, true));
    }
    
    @Test
    public void ConcatTest() {
        assertNotSame("should not be the same", Vazio, Bools.concat(Vazio));        
        assertNotSame("should not be the same", true, Bools.concat(Verdadeiro));        
        assertNotSame("should not be the same", false, Bools.concat(Falso));
        assertTrue(Arrays.equals(new boolean[] {true}, Bools.concat(Verdadeiro)));
        assertTrue(Arrays.equals(new boolean[] {false, false}, Bools.concat(Falso, Falso)));
        assertTrue(Arrays.equals(new boolean[] {false, true}, Bools.concat(Ambos)));
        assertTrue(Arrays.equals(new boolean[] {true, false}, Bools.concat(Verdadeiro, Falso)));
        assertTrue(Arrays.equals(new boolean[] {false, false, true}, Bools.concat(Falso, Falso, Verdadeiro)));
        assertThat(new boolean[]{}, is(Bools.concat()));
        assertThat(new boolean[]{}, is(Bools.concat(Vazio, Vazio)));
        assertThat(new boolean[]{false, false}, is(Bools.concat(Falso, Falso)));
        assertThat(new boolean[]{false, true, false, false}, is(Bools.concat(FalsoVerdadeiro, FalsoFalso)));
        assertThat(new boolean[]{false, true, true}, is(Bools.concat(Falso, VerdadeiroVerdadeiro)));
        assertThat(new boolean[]{true, false}, is(Bools.concat(Verdadeiro, Falso)));
        assertThat(new boolean[]{true, true}, is(Bools.concat(Verdadeiro, Verdadeiro)));
        assertTrue(Arrays.equals(Vazio, Bools.concat()));
        assertTrue(Arrays.equals(Vazio, Bools.concat(Vazio)));
        assertTrue(Arrays.equals(Vazio, Bools.concat(Vazio, Vazio)));
        assertTrue(Arrays.equals(Falso, Bools.concat(Falso)));
        assertTrue(Arrays.equals(Falso, Bools.concat(Vazio, Falso, Vazio)));
    }
    
    @Test
    public void ToArrayTest() {
        List<Boolean> zero = Arrays.<Boolean>asList();
        List<Boolean> um = Arrays.asList(false);
        List<Boolean> dois = Arrays.asList(false, true);   
        List<Boolean> tres = Arrays.asList(false,true, true);   

        boolean[] teste = {false, true};    
        boolean[] teste2 = {false, true, true};
        
        assertTrue(Arrays.equals(Vazio, Bools.toArray(zero)));
        assertTrue(Arrays.equals(Falso, Bools.toArray(um)));
        assertTrue(Arrays.equals(teste, Bools.toArray(dois)));
        assertTrue(Arrays.equals(teste, Bools.toArray(Bools.asList(teste))));
        assertTrue(Arrays.equals(teste2, Bools.toArray(Bools.asList(teste2)))); 
    }
   
    
    @Test
    public void ListTest() {
        List<Boolean> teste = Bools.asList(Falso);

        assertEquals(0, Bools.asList(Vazio).size());
        assertEquals(1, Bools.asList(Falso).size());
        assertEquals(2, Bools.asList(FalsoVerdadeiro).size());
        assertEquals(Bools.asList(Falso), teste);
        assertEquals(-1, Bools.asList(Vazio).indexOf(true));
        assertEquals(-1, Bools.asList(Falso).indexOf(true));
        assertEquals(teste, teste);
        assertEquals("[false]", Bools.asList(Falso).toString());
        assertTrue(Bools.asList(Vazio).isEmpty());
        assertFalse(Bools.asList(Falso).equals(null));
        assertFalse(Bools.asList(Falso).isEmpty());
        assertFalse(Bools.asList(Vazio).contains(true));   

    }
    
    @Test
    public void CountTrueTest() {
        assertEquals(0, Bools.countTrue());
        assertEquals(0, Bools.countTrue(false));
        assertEquals(0, Bools.countTrue(false, false, false, false));
        assertEquals(1, Bools.countTrue(true));
        assertEquals(1, Bools.countTrue(true, false, false));
        assertEquals(1, Bools.countTrue(false, false, true));
        assertEquals(3, Bools.countTrue(false, true, true, true));
        assertEquals(1, Bools.countTrue(false, false, true, false));
    }
    
    @Test(expected = NullPointerException.class)
    public void checkNotNull() {
        assertEquals(Vazio, Bools.checkNotNull(Vazio));
        assertEquals(FalsoVerdadeiro, Bools.checkNotNull(FalsoVerdadeiro));
        assertEquals(FalsoFalso, Bools.checkNotNull(FalsoFalso));
        assertEquals(VerdadeiroVerdadeiro, Bools.checkNotNull(VerdadeiroVerdadeiro));
        assertEquals(Ambos, Bools.checkNotNull(Ambos));
        assertEquals(true, Bools.checkNotNull(true));
        assertEquals(false, Bools.checkNotNull(false));
        Bools.checkNotNull(null);
        assertNull("should be null", null);

    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void checkElementIndex() {
        assertEquals(21, Bools.checkElementIndex(-1, 1, "test"));
        assertEquals(0, Bools.checkElementIndex(0, 1, "test"));
        assertEquals(-1, Bools.checkElementIndex(2, 1, "test"));
    }
  
}