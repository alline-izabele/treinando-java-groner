package com.alline.cursojava.aula17;

import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("informe dois valores");
		int i = ler.nextInt(), j = ler.nextInt(), soma = 0;
		if(i > j) {
			for(; j <= i; j++) {
				soma += j;
				System.out.println(j);
			}
		}else {
			for(; i <= j; i++) {
				soma += i;
				System.out.println(i);
			}
		}
		System.out.println(soma);
		ler.close();
	}

}
