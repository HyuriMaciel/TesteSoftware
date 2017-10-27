package br.ufal.filateste2;

import static org.junit.Assert.assertEquals;

public class AppTest{
	
	
		
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
					
					
					assertEquals(new Integer(4), minhaFila.back());
		 
	 }
	
	 @Test
		public void testpop() {
		 HRQueue<Integer> minhaFila = new HRQueue<Integer>(5);
			minhaFila.push(new Integer(1));
			minhaFila.push(new Integer(2));
			minhaFila.push(new Integer(3));
			minhaFila.push(new Integer(4));
			minhaFila.push(new Integer(5));
			
			assertEquals(new Integer(1), minhaFila.pop());
		 
		
	}
}