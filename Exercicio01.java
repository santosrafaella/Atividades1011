package br.com.generation.exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		
		for(int n = 1000; n < 2000; n++) {
		if(n % 11 == 5) {
			System.out.println("Os número dentro da condição são: " + n);
		}
		}
	}
}
