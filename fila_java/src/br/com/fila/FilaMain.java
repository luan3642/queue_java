package br.com.fila;

public class FilaMain {
	public int front;
	public int rear;
	public int size;
	public int[] fila;
 	
	public FilaMain(int capacidade) {
		fila = new int[capacidade];
		this.front = 0;
		this.rear = -1;
	}
	
	public void enfilerar(int elemento) {
		if(size == this.fila.length) {
			throw new RuntimeException("fila está cheia");
		}
		this.fila[++rear] = elemento;
		this.size++;
	}
	
	public int desenfilerar() {
		if(isEmpty()) {
			throw new RuntimeException("A fila está vazia");
		}
		int elemento = this.fila[this.front];
		this.front++;
		this.size--;
		return elemento;
		
	}
	
	public void exibir() {
		System.out.print("[");
		for(int i = front; i<front + size; i++) {
			System.out.print(fila[i]);
			if(i != front + size-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public int peek() {
		return this.fila[front];
	}
	
	public static void main(String[] args) {
		FilaMain filaMain = new FilaMain(3);
		
		filaMain.enfilerar(1);
		filaMain.enfilerar(2);
		filaMain.enfilerar(3);
		
		
		filaMain.exibir();
		
		System.out.println();
		System.out.println("a fila está vazia? "+filaMain.isEmpty());
		System.out.println("o primeiro elemento da fila é: "+filaMain.peek());
		System.out.println("quantidade de elementos na fila: "+filaMain.size);
		System.out.println();
		System.out.println("desinfilerando");
		System.out.println("quem está saindo da fila? "+filaMain.desenfilerar());
		System.out.println("o primeiro elemento da fila é: "+filaMain.peek());
		System.out.println("quantidade de elementos na fila: "+filaMain.size);
		filaMain.exibir();
	}
}
