package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade, np = 1, sexo, caracteristica;
	    int pc = 0, mn = 0, ha = 0, oc = 0, pc40 = 0, pc18 = 0;
	    
		
		while(np <= 3) {
			
			System.out.println("Digite a idade: ");
			idade = in.nextInt();
			
			System.out.println("Informe o gênero: 1 para feminino, 2 para masculino, 3 para outros: ");
			sexo = in.nextInt();
			
			System.out.println("Digite a característica: 1 para calma, 2 para nervosa, 3 para agressividade: ");
			caracteristica = in.nextInt();
			
		if(caracteristica == 1) {
			pc++;
		}
		if(sexo == 1 && caracteristica == 2) {//fazer variavel para mulher nervosa e cada uma das opções pedidas	
		      mn++;
		}
		if(sexo == 2 && caracteristica == 3) {
			ha++;
		}
		if(sexo == 3 && caracteristica == 1) {
			oc++;
		}
		if(idade >= 40 && caracteristica == 2) {
			pc40++;
		}
		if(idade <= 18 && caracteristica == 1) {
			pc18++;
		}
		np++;

	}
	System.out.println("Dentre os 3 habitantes entrevistados, " + pc + " se consideram calmos; " + mn + " mulheres se consideram nervosas; " +
	ha + " \nhomens se consideram agressivos; " + oc + " pessoas de outros genêros se consideram calmas; " + pc40 + " \npessoas acima dos 40 anos se consideram nervosas e " + 
	pc18 + " pessoas abaixo dos 18 anos se consideram calmas."); 
	
	in.close();
}
}
