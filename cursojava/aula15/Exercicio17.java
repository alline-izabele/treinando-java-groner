package com.alline.cursojava.aula15;

import java.util.Scanner;
public class Exercicio17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um ano: ");
		int ano = ler.nextInt();
		if(ano % 4 == 0) {
			if(ano % 100 != 0) {
				System.out.println("Ano bissexto");
			}else {
				System.out.println("Não é bissexto");
			}
		}else {
			if(ano % 400 == 0) {
				System.out.println("Ano bissexto");
			}else {
				System.out.println("Não é bissexto");
			}
		}
		ler.close();
	}

}
