package br.ufal.filateste;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	HRQueue<Integer> q = new HRQueue<Integer>(5);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            q.push(i);
        }
        for (int i = 0; q.empty()!= true; i++) {
            System.out.println(q.pop());
        }
    }
    
}
