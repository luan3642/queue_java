package br.com.fila;

public class FilaTeste {
	
	private int[] fila;
	private int size;
	private int rear;
	private int front;
	
	public FilaTeste(int capacidade) {
	   fila = new int[capacidade];
	   this.front = 0;
	   this.rear = -1;
	   this.size = 0;
	}
	
	public void enfilerar(int elemento) {
		if(isFull()) {
			throw new RuntimeException("a fila já está cheia");
		}
		this.fila[++rear] = elemento;
		this.size++;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public void desinfilerar() {
		if(isEmpty()) {
			throw new RuntimeException("A fila já está vazia");
		}
		this.front++;
		this.size--;
		
		
	}
	
	public void exibir() {
		System.out.print("[");
		for(int i = front; i< front + size; i++) {
			System.out.print(fila[i]);
			if(i != front + size - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
	
	public boolean isFull() {
		return this.size == this.fila.length;
	}
	
	public int peek() {
		return this.fila[front];
	}
	
	

	public static void main(String[] args) {
		FilaTeste filaTeste = new FilaTeste(3);
		
		filaTeste.enfilerar(5);
		filaTeste.enfilerar(4);
		filaTeste.enfilerar(8);
		
		System.out.println("a fila está cheia? "+filaTeste.isFull());

		
		filaTeste.exibir();
		
		System.out.println();
		filaTeste.desinfilerar();
		filaTeste.exibir();
		
		System.out.println("primeiro da fila "+filaTeste.peek());
		
		
		

	}

}
