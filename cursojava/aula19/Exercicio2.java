package com.alline.cursojava.aula19;

public class Exercicio2 {

	public static void main(String[] args) {
		int[] a = new int[9], b = new int[9];
		for(int i = 1; i <= 8; i++) {
			a[i] = i;
			b[i] = a[i] * 2;
			System.out.println("a: "+a[i]);
			System.out.println("b: "+b[i]);
		}
	}
}
