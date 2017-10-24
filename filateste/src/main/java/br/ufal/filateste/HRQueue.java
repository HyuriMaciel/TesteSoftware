package br.ufal.filateste;



import java.util.Arrays;

public class HRQueue<T> {
    private T[] vector;
    private int size;
    private int head;
    private int capacite;
    public  HRQueue(int length) {
        this.vector = (T[]) new Object[length];
        this.size = 0;
        this.head = 0;
        this.capacite = length;
    }

    public boolean empty(){
        return size() == 0;
    }
    public int size(){
        return this.size;
    }
    public T front(){
        if(size == 0) return null;
        return this.vector[this.head];
    }
    public T back(){
        if(size == 0) return null;
        return this.vector[this.head + size()];
    }
    public void push(T element){
        if ((this.head + size()) == this.capacite) {
            this.vector = Arrays.copyOf(this.vector, (int) (this.capacite * 1.5));
            this.capacite *= 1.5;
        }
        this.vector[this.head + size()] = element;
        this.size++;
    }

    public T pop(){
        T temp = front();
        this.head++;
        this.size--;
        return temp;
    }
}
