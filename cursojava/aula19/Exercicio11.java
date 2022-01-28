package com.alline.cursojava.aula19;

import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] a = new int[10];
		int par = 0;
		for(int i = 0; i <10; i++) {
			a[i] = ler.nextInt();
			if(a[i] % 2 == 0) {
				par++;
			}
		}
		System.out.println("entre "+a.length+" elementos, "
				+ par+" são pares");
		ler.close();
	}

}
