package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i = 0, menos21 = 0, mais50 = 0;		
			
		while(i != -99) {
			System.out.println("Digite sua idade (insira -99 para encerrar): ");
			i = in.nextInt();
			
			if(i <= 21) {
				menos21++;
			}
			if(i >= 50) {
				mais50++;
			}
			if(i == -99) {
				System.out.println("Contagem encerrada.");
			}
		}
		System.out.println("Total de pessoas: " + i++);
		System.out.println("Total de pessoas com menos de 21 anos: " + menos21);
		System.out.println("Total de pessoas com mais de 50 anos: " + mais50);
	
		in.close();
	}

}
