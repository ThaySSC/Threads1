package controller;

import javax.swing.JOptionPane;

/*Criar em java um projeto com uma Thread chamada ThreadVetor, 
 * que receba um valor numérico e vetor como parâmetros.*/
public class ThreadVetor extends Thread{
	private int valor_numerico;
	private int[] vetor;
	
	public ThreadVetor(int[] vetor, int valor) {
		this.valor_numerico = valor;
		this.vetor = vetor;
	}
	
	public void run() {
		double elapsed_time;
		// Se o valor for Par
		if( (valor_numerico % 2) == 0 ) {
			double start_time = System.nanoTime();
			for(int i = 0; i < vetor.length; i++);
			elapsed_time = (System.nanoTime() - start_time) / Math.pow(10, 9);
			System.out.printf("Par - Tempo: %f segundos.\n", elapsed_time);
		}
		//Se o valor for Impar
		else {
			double start_time = System.nanoTime();
			for(int i : vetor);
			elapsed_time = (System.nanoTime() - start_time) / Math.pow(10, 9);
			System.out.printf("Impar - Tempo: %f segundos.\n", elapsed_time);
		}
	}
}