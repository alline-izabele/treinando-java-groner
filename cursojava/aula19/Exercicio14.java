package com.alline.cursojava.aula19;

import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int[] a = new int [10];
		int media = 0, j = 0;
		for(int i = 0; i < a.length; i++) {
			a[i] = ler.nextInt();
			if(a[i] % 2 != 0) {
				j++;
				media += a[i];
			}	
		}
		System.out.println("a média dos impares é: "+(media/j));
		ler.close();
	}

}
