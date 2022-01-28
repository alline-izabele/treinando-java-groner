package com.alline.cursojava.aula19;

public class Exercicio3 {

	public static void main(String[] args) {
		int[] a = new int[15], b = new int[15];
		for(int i = 0; i < 15; i++) {
			a[i] = i;
			b[i] = a[i] * a[i];
			System.out.println("a: "+a[i]);
			System.out.println("b: "+b[i]);
		}

	}

}
