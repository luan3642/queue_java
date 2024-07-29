package br.com.fila;

public class FilaMain {
	public int front;
	public int rear;
	public int size;
	public int[] fila;
 	
	public FilaMain(int capacidade) {
		fila = new int[capacidade];
		this.front = 0;
	}
	
	public void enfilerar(int elemento) {
		this.fila[size++] = elemento;
	}
	
	public void exibir() {
		System.out.print("[");
		for(int i = 0; i<size; i++) {
			System.out.print(fila[i]);
			if(i != size-1) {
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
	}
}
