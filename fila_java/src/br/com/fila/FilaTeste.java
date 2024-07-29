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
		this.fila[front++] = elemento;
		this.size++;
		this.rear++;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public void desinfilerar() {
		if(isEmpty()) {
			throw new RuntimeException("A fila já está vazia");
		}
	}
	
	public void exibir() {
		System.out.print("[");
		for(int i = front; i< front + size; i++) {
			System.out.print(i);
			if(i != front + size - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
	
	public boolean isFull() {
		return this.size == this.fila.length -1;
	}
	
	

	public static void main(String[] args) {
		FilaTeste filaTeste = new FilaTeste(4);
		
		filaTeste.enfilerar(5);
		filaTeste.enfilerar(4);
		filaTeste.enfilerar(8);
		
		filaTeste.exibir();

	}

}
