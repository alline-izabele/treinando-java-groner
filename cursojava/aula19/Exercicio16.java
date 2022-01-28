package com.alline.cursojava.aula19;

import java.util.Scanner;
public class Exercicio16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] a = new int[10];
		int soma = 0, valores15 = 0, media = 0;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Escreva um número");
			a[i] = ler.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] < 15) {
				soma += a[i];
			}
			if(a[i] == 15) {
				valores15++;
			}
			if(a[i] > 15) {
				int j = 1;
				media += a[i]/j;
				j++;
			}
		}
		System.out.println("a soma dos elementos menores que 15: " + soma);
		System.out.println("valores iguais a 15: " + valores15);
		System.out.println("media de elementos maiores que 15: " + media);
		
		ler.close();
	}

}
