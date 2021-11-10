package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n, soma = 0;
		
		do {
			System.out.println("Digite um número. Insira 0 para encerrar: ");
			n = in.nextInt();
						
			soma += n;
		}
		
		while(n != 0); {
			System.out.println("A soma dos números é: " + soma);		
			
		in.close();
		}
	}
}


