package com.alline.cursojava.aula19;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int[] a = new int [10];
		int pp = 0, pi = 0;
		for(int i = 0; i < a.length; i++) {
			a[i] = ler.nextInt();
			if(a[i] % 2 != 0) {
				pi++;
			}
			else {
				pp++;
			}
		}
		System.out.println("o percentual dos impares é: "+(pi/100));
		System.out.println("o percentual dos pares é: "+(pp/100));
		ler.close();
	}
}
