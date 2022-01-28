package com.alline.cursojava.aula15;

import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1 = ler.nextDouble(), nota2 = ler.nextDouble();
		double media = (nota1 + nota2)/2;
		if(media == 10) {
			System.out.println("Aprovado com Distinção");
		}else if(media >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		ler.close();
	}
}
