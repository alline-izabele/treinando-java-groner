package com.alline.cursojava.aula19;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] a = new int[10];
		int soma = 0;
		for(int i = 0; i <10; i++) {
			a[i] = ler.nextInt();
			soma = soma + a[i];
		}
		System.out.println(soma);
		ler.close();
	}

}
