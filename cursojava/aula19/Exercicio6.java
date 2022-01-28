package com.alline.cursojava.aula19;

public class Exercicio6 {

	public static void main(String[] args) {
		int[] a = new int[10], b = new int[10], c = new int[10];
		for(int i = 0; i < 10; i++) {
			a[i] = i;
			b[i] = i;
			c[i] = a[i] + b[i];
			System.out.println("a: " + a[i]+ " e b: "+b[i]);
			System.out.println("c: " + c[i]);
		}
	}

}
