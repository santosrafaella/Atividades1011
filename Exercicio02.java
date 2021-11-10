package br.com.generation.exercicios;


public class Exercicio02 {

	public static void main(String[] args) {
		
		
		int n = 10, par = 0, impar = 0;		
		
		for(n = 0; n < 10; n++) {
						
			
			if(n % 2 == 0) {
				System.out.println("Esse número é par: " + n);
				par++;
			}
			else {
				System.out.println("\nEsse número é ímpar: " + n);
				impar++;
			}			
		}		
		System.out.println("Pares: " + par);
		System.out.println("Ímpares: " + impar);		
	}
}
