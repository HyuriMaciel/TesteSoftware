package br.ufal.filateste2;

public class HRQueue<T> {
	    private T[] vector;
	    private int size;
	    private int head;
	    private int tail;
	    private int capacite;

	    public HRQueue(int length) {
	        this.vector = (T[]) new Object[length];
	        this.size = 0;
	        this.head = 0;
	        this.capacite = length;
	        this.tail = 0;
	    }

	    public void clear() {
	        this.size = 0;
	        this.head = 0;
	        this.tail = 0;
	    }

	    public boolean empty() {
	        return size() == 0;
	    }

	    public int size() {
	        return this.size;
	    }

	    public T front() {
	        if (size == 0) return null;
	        return this.vector[this.head];
	    }

	    public T back() {
	        if (size == 0) return null;
	        return this.vector[this.tail];
	    }

	    public boolean push(T element) {
	        if (size() == this.capacite) {
	            return false;
	        }
	        this.vector[this.tail] = element;
	        this.size++;
	        this.tail = (this.tail + 1) % this.capacite;
	        return true;
	    }

	    public T pop() {
	        if (empty()) {
	            return null;
	        }
	        T temp = front();
	        this.head = (this.head + 1) % this.capacite;
	        this.size--;
	        return temp;
	    }

}
