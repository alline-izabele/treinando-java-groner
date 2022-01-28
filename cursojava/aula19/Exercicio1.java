package com.alline.cursojava.aula19;

public class Exercicio1 {

	public static void main(String[] args) {
		int[] a = new int[5], b = new int[5];
		b = a;
		for(int i = 0; i < 5; i++) {
			a[i] = i;
			
			System.out.println("a["+i+"] é: "+a[i]);
			System.out.println("b["+i+"] é: "+b[i]);
		}

	}

}
