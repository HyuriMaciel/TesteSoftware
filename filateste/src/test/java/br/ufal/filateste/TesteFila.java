package br.ufal.filateste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteFila {
	
	
		
	 @Test
		public void testefront() {
		
		    HRQueue<Integer> minhaFila = new HRQueue<Integer>(5);
			minhaFila.push(new Integer(1));
			minhaFila.push(new Integer(2));
			minhaFila.push(new Integer(3));
			minhaFila.push(new Integer(4));
			minhaFila.push(new Integer(5));
			
			assertEquals(new Integer(1), minhaFila.front());
			
		}
	 @Test
	 	public void testback() {
		   HRQueue<Integer> minhaFila = new HRQueue<Integer>(5);
					minhaFila.push(new Integer(1));
					minhaFila.push(new Integer(2));
					minhaFila.push(new Integer(3));
					minhaFila.push(new Integer(4));
					minhaFila.push(new Integer(5));
					
					assertEquals(new Integer(5), minhaFila.back());
		 
	 }
	
	 @Test
		public void testpop() {
		 HRQueue<Integer> minhaFila = new HRQueue<Integer>(5);
			minhaFila.push(new Integer(1));
			minhaFila.push(new Integer(2));
			minhaFila.push(new Integer(3));
			minhaFila.push(new Integer(4));
			minhaFila.push(new Integer(5));
			
			assertEquals("[1,2,3,4,5]", minhaFila.pop());
		 
		
	}
}
