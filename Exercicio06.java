package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 
		 int n = 0;
		 double media = 0.0, multiplos = 0.0, soma = 0.0;
		 
		 do {
			 System.out.println("Digite um n�mero inteiro. Insira 0 para sair: ");
			 n = in.nextInt();
			 
			 if(n % 3 == 0 && n != 0) {
				 multiplos++;
				 
				soma += n;
			 }
					 
		 }
		 while(n != 0);
		 media = soma / multiplos;
		 
		 System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: " + media);
		 
		 in.close();
	}

}
