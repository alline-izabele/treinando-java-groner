package com.alline.cursojava.aula19;

public class Exercicio5 {

	public static void main(String[] args) {
		int[] a = new int[10], b = new int[10];
		for(int i = 0; i < 10; i++) {
			a[i] = i;
			b[i] = a[i] * i;
			System.out.println("a: " + a[i]);
			System.out.println("b: " + b[i]);
		}

	}

}
